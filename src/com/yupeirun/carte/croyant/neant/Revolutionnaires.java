package com.yupeirun.carte.croyant.neant;
import java.util.ArrayList;
import java.util.Iterator;

import com.yupeirun.carte.Croyant;
import com.yupeirun.controle.joueur.Joueur;
import com.yupeirun.controle.partie.Partie;
import com.yupeirun.input.Input;

public class Revolutionnaires extends Croyant {
	public Revolutionnaires() {
	
		this.nom="Revolutionnaires";
		this.origine=Croyant.NEANT;
		this.dogmes = new String[] {Croyant.SYMBOLES,Croyant.HUMAIN,Croyant.CHAOS};
		this.description="Impose le sacrifice d'un Croyant d'un autre joueur, "
				+ "qui choisit la carte La capacit�� sp��ciale du sacrifice est jou��e.";
		this.nbPierre=2;
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
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
		
}

