package com.yupeirun.carte.croyant.neant;
import java.util.LinkedList;

import com.yupeirun.carte.Croyant;
import com.yupeirun.controle.joueur.Joueur;

public class Nihillistes extends Croyant{
	public Nihillistes() {
		
		this.nom="Nihillistes";
		this.origine=Croyant.NEANT;
		this.dogmes = new String[] {Croyant.SYMBOLES,Croyant.MYSTIQUE,Croyant.CHAOS};
		this.description="Jusqu'a la fin du tour, plus aucune Divinite ne recoit ";
		this.nbPierre=4;
		
	}
	
	public void sacrifier(LinkedList<Joueur> joueurs){
//		for (int i = 0; i < joueurs.size(); i++) {
//			joueurs.get(i).setPeutRecoirPA(false);
//		}
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}

}
