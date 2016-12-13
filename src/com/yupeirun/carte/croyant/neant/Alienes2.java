package com.yupeirun.carte.croyant.neant;
import java.util.ArrayList;
import java.util.Iterator;

import com.yupeirun.carte.Carte;
import com.yupeirun.carte.Croyant;
import com.yupeirun.controle.joueur.Joueur;
import com.yupeirun.controle.partie.Partie;
import com.yupeirun.input.Input;

public class Alienes2 extends Croyant{
	private String[] dogemesDivinite={"Chaos","Mistique"};
	public Alienes2() {
		this.nom="Alienes";
		this.origine=Croyant.NEANT;
		this.dogmes = new String[] {Croyant.HUMAIN,Croyant.NATURE,Croyant.SYMBOLES};
		this.description="Emp¨ºche une Divinit¨¦ poss¨¦dant le Dogme Chaos ou Mystique "
				+ "de sacrifier une de ses cartes de Guides Spirituels durant ce tour. ";
		this.nbPierre=2;
		
	}
	
	public void sacrifier(Joueur joueur) {
		ArrayList<Joueur> js = Partie.getInstance().getJoueurs();
		ArrayList<Joueur> jsPourChoisir = new ArrayList<Joueur>();
		
		Iterator<Joueur> it = js.iterator();		
		while(it.hasNext()) {
			Joueur j = it.next();
			String origine = j.getOrigine();
			if(origine == Carte.NATURE
					 || origine == Carte.MYSTIQUE) {
				jsPourChoisir.add(j);
				System.out.println("Joueurs qui sont peut-etre choisi£º" + j.getNumJoueur());
			}
		}
		
		System.out.println("Choisi un joueur£º");
		while(true) {
			int i = Input.getInt();
			boolean isExist = false;
			for(int j = 0; j < jsPourChoisir.size(); j++) {
				if(i == jsPourChoisir.get(j).getNumJoueur()) {
					isExist = true;
				}
			}
			if(isExist == true) {
				js.get(i).setEnableSacrifier(false);
				break;
			}else {
				System.out.println("£¡");
			}
		}
	}

	public String[] getDogemesDivinite() {
		return dogemesDivinite;
	}

	public void setDogemesDivinite(String[] dogemesDivinite) {
		this.dogemesDivinite = dogemesDivinite;
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
}
