package com.yupeirun.carte.croyant.jour;
import java.util.ArrayList;
import java.util.Iterator;

import com.yupeirun.carte.Carte;
import com.yupeirun.carte.Croyant;
import com.yupeirun.controle.joueur.Joueur;
import com.yupeirun.controle.partie.Partie;
import com.yupeirun.input.Input;

public class Integristes extends Croyant {
	public Integristes() {
	
		this.nom="Integristes";
		this.origine=Croyant.JOUR;
		this.description="Impose le sacrifice d'un Guide Spirituel d'un "
				+ "autre joueur,qui choisit la carte La capacit¨¦ sp¨¦ciale du sacrifice est jou¨¦e.";
		this.nbPierre=1;
		this.dogmes=new String[] {Carte.SYMBOLES,Carte.HUMAIN,Carte.CHAOS};
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
	
	public void sacrifier(Joueur joueur) {
		ArrayList<Joueur> js = Partie.getInstance().getJoueurs();
		Iterator<Joueur> it = js.iterator();
		System.out.print("choisir un joueur: ");
		while(it.hasNext()) {
			System.out.println("NumJoueur" + it.next().getNumJoueur());
		}
		int i = Input.getInt();
		js.get(i).sacrifier();
		//manquer que c'est oblicatoire sacrifier un guidespirituel
	}
		
}

