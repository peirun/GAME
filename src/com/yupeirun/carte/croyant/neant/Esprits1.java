package com.yupeirun.carte.croyant.neant;
import com.yupeirun.carte.Croyant;
import com.yupeirun.controle.joueur.Joueur;

public class Esprits1 extends Croyant {
	public Esprits1() {
		this.nom="Esprits";
		this.origine=Croyant.NEANT;
		this.dogmes = new String[] {Croyant.HUMAIN,Croyant.NATURE,Croyant.MYSTIQUE};
		this.description="Donne un point d'Action d'Origine N¨¦ant. ";
		this.nbPierre=2;
		
	}
	
	public void sacrifier(){
//		this.joueur.setPointActionNeant(this.joueur.getPointActionNeant()+1);
	}
	
	public void sacrifier(Joueur joueur){
		joueur.setPointActionNeant(joueur.getPointActionNeant()+1);
	}
		
}

