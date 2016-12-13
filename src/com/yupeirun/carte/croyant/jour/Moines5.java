package com.yupeirun.carte.croyant.jour;
import com.yupeirun.carte.Carte;
import com.yupeirun.carte.Croyant;
import com.yupeirun.controle.joueur.Joueur;

public class Moines5 extends Croyant {
	public Moines5() {
	
		this.nom="Moines";
		this.origine=Croyant.JOUR;
		this.description="Donne un point d'Action d'Origine Jour. ";
		this.nbPierre=2;
		this.dogmes=new String[] {Carte.SYMBOLES,Carte.NATURE,Carte.MYSTIQUE};
	}
	
	public void sacrifier(){
//		this.joueur.setPointActionJour(this.joueur.getPointActionJour()+1);
	}
	
	public void sacrifier(Joueur joueur){
		joueur.setPointActionJour(joueur.getPointActionJour()+1);
	}
		
}

