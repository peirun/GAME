package com.yupeirun.carte.croyant.nuit;
import java.util.ArrayList;
import java.util.Iterator;

import com.yupeirun.carte.Croyant;
import com.yupeirun.controle.joueur.Joueur;
import com.yupeirun.controle.partie.Partie;
import com.yupeirun.input.Input;

public class Vampire2 extends Croyant {
	public Vampire2() {
	
		this.nom="Vampire";
		this.origine=Croyant.NUIT;
		this.dogmes = new String[] {Croyant.MYSTIQUE,Croyant.HUMAIN,Croyant.CHAOS};
		this.description="Impose le sacrifice d'un Croyant d'un autre joueur, qui choisit la carte "
				+ "La capacit¨¦ sp¨¦ciale du sacrifice est jou¨¦e.";
		this.nbPierre=1;
	}
	
	public void sacrifier(Joueur joueur) {
		ArrayList<Joueur> js = Partie.getInstance().getJoueurs();
		Iterator<Joueur> it = js.iterator();
		System.out.print("choisir un joueur: ");
		while(it.hasNext()) {
			System.out.println("Joueur" + it.next().getNumJoueur());
		}
		int i = Input.getInt();
		ArrayList<Croyant> cs = (ArrayList<Croyant>) js.get(i).getCroyants();
		Iterator<Croyant> ic = cs.iterator();
		System.out.println("choisi une croyant");
		while(ic.hasNext()) {
			System.out.println(ic.next().toString());
		}
		int n = Input.getInt();
		js.get(i).getCroyants().remove(n).sacrifier(js.get(i));
		
		//manquer un truc que remove croyant de guide
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
		
}

