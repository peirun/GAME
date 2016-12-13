package com.yupeirun.carte.croyant.jour;
import com.yupeirun.carte.Croyant;
import com.yupeirun.controle.joueur.Joueur;

public class Moines2 extends Croyant {
	
	public Moines2() {
	
		this.nom="Moines";
		this.origine=Croyant.JOUR;
		this.dogmes = new String[] {Croyant.MYSTIQUE,Croyant.HUMAIN,Croyant.CHAOS};
		this.description="Donne un point d'Action d'Origine Jour. ";
		this.nbPierre=2;
	}
	
	public void sacrifier(){
//		this.joueur.setPointActionJour(this.joueur.getPointActionJour()+1);
		
	}
	
	public void sacrifier(Joueur joueur){
		joueur.setPointActionJour(joueur.getPointActionJour()+1);
	}
		
}

