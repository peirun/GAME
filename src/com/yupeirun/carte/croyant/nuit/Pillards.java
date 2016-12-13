package com.yupeirun.carte.croyant.nuit;
import com.yupeirun.carte.Croyant;
import com.yupeirun.controle.joueur.Joueur;

public class Pillards extends Croyant {
	
	public Pillards() {
	
		this.nom="Pillards";
		this.origine=Croyant.NUIT;
		this.dogmes = new String[] {Croyant.MYSTIQUE,Croyant.NATURE,Croyant.SYMBOLES};
		this.description="R¨¦cup¨¦rez les points d'Action d'une Divinit¨¦ n'ayant pas "
				+ "encore jou¨¦ durant ce tour. Les points d'Action "
				+ "gardent leur Origine. La Divinit¨¦ perd ses points.";
		this.nbPierre=4;
	}
	
	public void sacrifier(Joueur joueur){
//		this.joueur.setPointActionJour(joueur.getPointActionJour());
//		this.joueur.setPointActionNuit(joueur.getPointActionNuit());
//		this.joueur.setPointActionNeant(joueur.getPointActionNeant());
//		joueur.setPointActionJour(0);
//		joueur.setPointActionNuit(0);
//		joueur.setPointActionNeant(0);
//		
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
		
}

