package com.yupeirun.controle.joueur;

import java.util.ArrayList;

import com.yupeirun.carte.CarteAction;
import com.yupeirun.carte.Croyant;
import com.yupeirun.carte.GuideSpirituel;
import com.yupeirun.controle.carte.CartesSurTable;
import com.yupeirun.controle.partie.Partie;
import com.yupeirun.controle.partie.Tour;
import com.yupeirun.interfaceboite.StrategieDecision;

public class IAFacile implements StrategieDecision {

	public ArrayList<CarteAction> cartesALaMain;
	public int j;
	public int index;
	public ArrayList<GuideSpirituel> guideSpirituels = new ArrayList<GuideSpirituel>();
	public ArrayList<Croyant> croyants = new ArrayList<Croyant>();
	
	Joueur joueur = new JoueurVirtual(this);
	public void sacrifier() {
		System.out.println("sacrifier");
	}

	@Override
	public void choisirDefausse() {		
			ArrayList<CarteAction> cartesALaMain = joueur.cartesALaMain;
			for (int i = 0; i < cartesALaMain.size(); i++) {
				if((cartesALaMain.get(i).getOrigine()==joueur.getOrigine())||
				(cartesALaMain.get(i).getOrigine()=="neant")) {
					break;
				}else if((joueur.getOrigine()=="aube") && (cartesALaMain.get(i).getOrigine()=="jour")) {
					break;
				}else if((joueur.getOrigine()=="crepuscule") && (cartesALaMain.get(i).getOrigine()=="nuit")) {
					break;
				}
				else if(cartesALaMain.get(i).getOrigine()==null) {
					break;
				}else {
					cartesALaMain.remove(i);
					break;
				}
				
				}
				System.out.println("Joueur vituel a deja fait defausse");
				
			}

	@Override
	public void utiliser() {
		
		if(joueur.getGuideSpirituels().size()>0) {
			
			for(GuideSpirituel gs : joueur.getGuideSpirituels()) {
					
						if(gs.getNbCroyantSontRattache()<=gs.getNbCroyantMax()) {
							this.rattacherCroyant(gs);
							//utiliser guide au milieu table pour rattacher
						}
				}
			}
			
		if(this.returnGuide().size()>0) {
				this.poserGuide();				
			}
		if(this.returnCroyant().size()>0) {
				this.poserCroyant();
			}
		for(int n=0;n<joueur.cartesALaMain.size();n++) {
			if((joueur.cartesALaMain.get(n).getType()=="Apocalypse")&&(joueur.getCroyants().size()>0)) {
				Partie.getPartie().ApocalypseProcess(joueur);
			}
		}
			
			joueur.mettreAFinTonPhase();
		
		}		
	
	public void poserCroyant() {
		for(Croyant c: this.returnCroyant()) {
			if((c.getOrigine()=="jour"&&joueur.pointActionJour>=1)) {
				CartesSurTable.getInstance().setCroyantDeposes(c);
				joueur.compterPointAction(c);
				System.out.println("Joueur virtuel depose croyant reussis");
				return;
			}else if(c.getOrigine()=="nuit"&&joueur.pointActionNuit>=1){
				CartesSurTable.getInstance().setCroyantDeposes(c);
				joueur.compterPointAction(c);
				System.out.println("Joueur virtuel depose croyant reussis");
				return;
			}else if(c.getOrigine()=="neant"&&joueur.pointActionNeant>=1) {
				CartesSurTable.getInstance().setCroyantDeposes(c);
				joueur.compterPointAction(c);
				System.out.println("Joueur virtuel depose croyant reussis");
				return;
			}else if(c.getOrigine()=="neant"&&joueur.pointActionJour>=2){
				CartesSurTable.getInstance().setCroyantDeposes(c);
				joueur.compterPointAction(c);
				System.out.println("Joueur virtuel depose croyant reussis");
				return;
			}else if(c.getOrigine()=="neant"&&joueur.pointActionNuit>=2) {
				CartesSurTable.getInstance().setCroyantDeposes(c);
				joueur.compterPointAction(c);
				System.out.println("Joueur virtuel depose croyant reussis");
				return;
			}
			
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
						joueur.setCroyants(c);
						System.out.println("Rattacher croyant reussi£¡");						
				}else {
					break;
				}
			}
		}
	}
		
	}	
	public ArrayList<Croyant> returnCroyant() {
		// TODO Auto-generated method stub
		for(int i=0;i<7;i++) {
			if(joueur.cartesALaMain.get(i) instanceof Croyant) {
				croyants.add((Croyant) joueur.cartesALaMain.get(i));				
			}						
		}
		return croyants;
	}

	@Override
	public void choisirUneOperation() {
		// TODO Auto-generated method stub
		if(joueur.getPointActionJour()>0||joueur.getPointActionNeant()>0||joueur.getPointActionNuit()>0) {
				this.utiliser();			
		}
		mettreAFinTonPhase();		
	}

	
	private ArrayList<GuideSpirituel> returnGuide() {
		for(int i=0;i<7;i++) {
			if(joueur.cartesALaMain.get(i).getType()=="Guide") {
				guideSpirituels.add((GuideSpirituel) joueur.cartesALaMain.get(i));				
			}						
		}
		return guideSpirituels;
	}
	
	private void poserGuide() {
		for(GuideSpirituel g: this.returnGuide()) {
			if((g.getOrigine()=="jour"&&joueur.pointActionJour>=1)) {
				joueur.setGuideSpirituels(g);
				joueur.compterPointAction(g);
				System.out.println("Joueur virtuel poser guideSpirituel reussi");
			}else if(g.getOrigine()=="nuit"&&joueur.pointActionNuit>=1){
				joueur.setGuideSpirituels(g);
				joueur.compterPointAction(g);
				System.out.println("Joueur virtuel poser guideSpirituel reussi");
			}else if(g.getOrigine()=="neant"&&joueur.pointActionNeant>=1) {
				joueur.setGuideSpirituels(g);
				joueur.compterPointAction(g);
				System.out.println("Joueur virtuel poser guideSpirituel reussi");
			}else if(g.getOrigine()=="neant"&&joueur.pointActionJour>=2){
				joueur.setGuideSpirituels(g);
				joueur.compterPointAction(g);
				System.out.println("Joueur virtuel poser guideSpirituel reussi");
			}else if(g.getOrigine()=="neant"&&joueur.pointActionNuit>=2) {
				joueur.setGuideSpirituels(g);
				joueur.compterPointAction(g);
				System.out.println("Joueur virtuel poser guideSpirituel reussi");
			}else {
				break;
			}
		}
		
		
//		for(GuideSpirituel g: guideSpirituels) {
//			if((g.getOrigine()=="jour"&&joueur.pointActionJour>=1)||
//			(g.getOrigine()=="nuit"&&joueur.pointActionNuit>=1)||
//			(g.getOrigine()=="neant"&&joueur.pointActionNeant>=1)||
//			(g.getOrigine()=="neant"&&joueur.pointActionJour>=2)||
//			(g.getOrigine()=="neant"&&joueur.pointActionNuit>=2)) {
//				joueur.getGuideSpirituels().add(g);
//				joueur.compterPointAction(jou);
//			}
//			
//	}	
}
		
	
	public void mettreAFinTonPhase() {
		System.out.println("mettreAFinTonPhase");
		Tour t = Partie.getInstance().getTour();
		t.terminerPhase(joueur);
	}

	public Joueur getJoueur() {
		return joueur;
	}

	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}
}
