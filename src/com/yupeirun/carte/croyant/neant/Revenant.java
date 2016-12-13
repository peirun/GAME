package com.yupeirun.carte.croyant.neant;
import java.util.LinkedList;

import com.yupeirun.carte.Croyant;
import com.yupeirun.controle.joueur.Joueur;

public class Revenant extends Croyant{
	public Revenant() {
	
		this.nom="Revenant";
		this.origine=Croyant.NEANT;
		this.dogmes = new String[] {Croyant.HUMAIN,Croyant.NATURE,Croyant.MYSTIQUE};
		this.description="Relancez le d¨¦ de Cosmogonie. "
				+ "Le tour se finit normalement sous la nouvelle influence.";
		this.nbPierre=1;
		
	}
	
	public void sacrifier(LinkedList<Joueur> joueurs){
//		for (int i = 0; i < joueurs.size(); i++) {
//			joueurs.get(i).setAjoue(true);
//		}
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}

}
