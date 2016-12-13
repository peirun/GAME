package com.yupeirun.controle.joueur;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.yupeirun.carte.Carte;
import com.yupeirun.carte.CarteAction;
import com.yupeirun.carte.Croyant;
import com.yupeirun.carte.Divinite;
import com.yupeirun.carte.GuideSpirituel;
import com.yupeirun.controle.carte.Cartes;
import com.yupeirun.controle.carte.CartesDivinite;
import com.yupeirun.controle.carte.CartesSurTable;
import com.yupeirun.controle.partie.Partie;
import com.yupeirun.controle.partie.Tour;

public abstract class Joueur {

	protected int numJoueur;
	protected Tour tour;
	protected ArrayList<CarteAction> cartesALaMain;
	protected Divinite divinite;
	protected int pointActionJour;
	protected int pointActionNeant;
	protected int pointActionNuit;
	protected int nbPriere;
	protected List<Croyant> croyants = new ArrayList<Croyant>();
	protected List<GuideSpirituel> guideSpirituels = new ArrayList<GuideSpirituel>();
	protected boolean enableSacrifier;
	public Joueur() {
		
		setCartesALaMain(new ArrayList<CarteAction>());
		// comment distribuer divinite
		// carteDivinite = new Divinite();
		setPointActionJour(0);
		setPointActionNeant(0);
		setPointActionNuit(0);
		nbPriere = 0;
		this.divinite = CartesDivinite.getInstance().returnDivinite();
		
	}
	// obtenir pierre

	public abstract void choisirUneOperation();
	

	public void completerMain() {
		// test
		Cartes cartes = Cartes.getInstance();
		System.out.println("completerMain");

		while (cartesALaMain.size() < 7) {
			cartesALaMain.add(cartes.retirerCarte());// nouveaux
		}
	}

	public abstract void choisirDefausse();

	public void sacrifier() {
		// test
		System.out.println("sacrifier");
		
	}
	public abstract void utiliser();

	public void mettreAFinTonPhase() {
		// test
		System.out.println("mettreAFinTonPhase");
		Tour t = Partie.getInstance().getTour();
		t.terminerPhase(this);
	}

	// autres methods
	public final int lancerDe() {
		// test
		System.out.println("lancerDE");
		Random random = new Random();
		return random.nextInt(3);
	}

	public void phase() {
		// test
		System.out.println("PHASE COMMENCE");
		
		this.showCarteDeposes();
		this.choisirDefausse();
		this.completerMain();
		this.choisirUneOperation();
	}
	
	public void showCarteDeposes() {
		if(CartesSurTable.getInstance().getCroyantDeposes().size()==0) {
			System.out.println("Il n'y a pas de croyant depose");
		}else {
			for (int i = 0; i < CartesSurTable.getInstance().getCroyantDeposes().size(); i++) {
				System.out.println("Croyants deposes sur la table :");
				System.out.print(i + ".");
				System.out.println(CartesSurTable.getInstance().getCroyantDeposes().get(i).toString());
			}
		}
		
		if(this.getGuideSpirituels().size()==0) {
			System.out.println("Vous n'avez pas encore pose une guide");
		}else {
			for (int i = 0; i < this.getGuideSpirituels().size(); i++) {
				System.out.println("Votre guide posee :");
				System.out.print(i + ".");
				System.out.println(this.getGuideSpirituels().get(i).toString());
				if(this.getGuideSpirituels().get(i).getCroyants().size()==0) {
					System.out.println("Cette carte n'a pas de croyant rattacher");
				}else {
					for(int j=0; j < this.getGuideSpirituels().get(i).getCroyants().size(); j++) {
						System.out.print(i + ".");
						System.out.println(this.getGuideSpirituels().get(i).getCroyants().get(j).toString());
					}
				}
			}
		}
	}
	
	public void showPointAction() {
		System.out.println(this.getDivinite());
		System.out.println("Jour:"+ this.getPointActionJour());
		System.out.println("Nuit:"+this.getPointActionNuit());
		System.out.println("Neant:"+this.getPointActionNeant());	
	}
	
	public void poserCroyant(Croyant cc) {
		switch(cc.getOrigine()) {
		case Carte.JOUR:
			if(this.pointActionJour >= 1) {
				CartesSurTable.getInstance().getCroyantDeposes().add(cc);
				this.pointActionJour -= 1;
				System.out.println("Poser croyant reussis");
			}else {
				System.out.println("PointAction manque");
				cartesALaMain.add(cc);
			}
			break;
		case Carte.NEANT:
			if(this.pointActionNeant >= 1) {
				CartesSurTable.getInstance().getCroyantDeposes().add(cc);
				this.pointActionNeant -= 1;
				System.out.println("Poser croyant reussis");
			}else {
				System.out.println("PointAction manque");
				cartesALaMain.add(cc);
			}
			break;
		
		case Carte.NUIT:
			if(this.pointActionNuit >= 1) {
				CartesSurTable.getInstance().getCroyantDeposes().add(cc);
				this.pointActionNuit -= 1;
				System.out.println("Poser croyant reussis");
			}else {
				System.out.println("PointAction manque");
				cartesALaMain.add(cc);
			}
			break;
		default :
			break;
		}
}
	
	public void rattacherCroyant(GuideSpirituel gs) {
		for(int j=0;j<CartesSurTable.getInstance().getCroyantDeposes().size();j++) {
			for(int k=0;k<CartesSurTable.getInstance().getCroyantDeposes().get(j).getDogmes().length;k++) {
				for(int m=0;m<gs.getDogmes().length;m++) {
					if(gs.getDogmes()[m]==CartesSurTable.getInstance().getCroyantDeposes().get(j).getDogmes()[k]) {
						Croyant c =(Croyant) CartesSurTable.getInstance().getCroyantDeposes().remove(j);
						gs.getCroyants().add(c);
						gs.setNbCroyantSontRattache(gs.getNbCroyantSontRattache() + 1);
						this.setCroyants(c);
						System.out.println("Rattacher croyant reussi£¡");
						
				}else {
					break;
				}
			}
		}
	}
		
	}
	public void poserGuide(int index) {
		// TODO Auto-generated method stub
		
	}
	
	public void compterPointAction(CarteAction carteAction) {
		switch(carteAction.getOrigine()) {
			case "jour":
				this.setPointActionJour(this.getPointActionJour()-1);
				return;
			case "nuit":
				this.setPointActionNuit(this.getPointActionNuit()-1);
				return;
			case "neant":
				if(this.getPointActionNeant()>=1) {
					this.setPointActionNeant(this.getPointActionNeant()-1);
					return;
				}else if(this.getPointActionJour()>=2) {
					this.setPointActionJour(this.getPointActionJour()-2);
					return;
				}else if(this.getPointActionNuit()>=2) {
					this.setPointActionNuit(this.getPointActionNuit()-2);
					return;
				}
			default:
			return;			
		}
	}
	
	// herite des methodes du joueur

	public int getNumJoueur() {
		return numJoueur;
	}

	public void setNumJoueur(int numJoueur) {
		this.numJoueur = numJoueur;
	}

	public ArrayList<CarteAction> getCartesALaMain() {
		return cartesALaMain;
	}

	public void setCartesALaMain(ArrayList<CarteAction> cartes) {
		this.cartesALaMain = cartes;
	}

	public String getDivinite() {
		return divinite.toString();
	}

	public String getOrigine() {
		return divinite.getOrigine();
	}

//	public void setDivinite(Divinite divinite) {
//		this.divinite = divinite;
//	}

	public int getPointActionJour() {
		return pointActionJour;
	}

	public void setPointActionJour(int pointActionJour) {
		this.pointActionJour = pointActionJour;
	}

	public int getPointActionNuit() {
		return pointActionNuit;
	}

	public void setPointActionNuit(int poinActionNuit) {
		this.pointActionNuit = poinActionNuit;
	}

	public int getPointActionNeant() {
		return pointActionNeant;
	}

	public void setPointActionNeant(int pointActionNeant) {
		this.pointActionNeant = pointActionNeant;
	}

	public List<Croyant> getCroyants() {
		return croyants;
	}

	public void setCroyants(Croyant c) {
		this.croyants.add(c);
	}

	public List<GuideSpirituel> getGuideSpirituels() {
		return guideSpirituels;
	}

	public void setGuideSpirituels(GuideSpirituel gs) {
		this.guideSpirituels.add(gs);
	}

	public int getNbPriere() {
		return nbPriere;
	}

	public void showCartes() {
		// TODO Auto-generated method stub		
	}

	public Tour getTour() {
		return tour;
	}

	public void setEnableSacrifier(boolean b) {
		// TODO Auto-generated method stub
		this.enableSacrifier=b;
	}
	
}
