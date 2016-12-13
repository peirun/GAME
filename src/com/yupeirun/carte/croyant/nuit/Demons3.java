package com.yupeirun.carte.croyant.nuit;
import com.yupeirun.carte.CarteAction;
import com.yupeirun.carte.Croyant;
import com.yupeirun.controle.joueur.Joueur;

public class Demons3 extends Croyant {
	public Demons3() {
		this.nom="Demon";
		this.origine=CarteAction.NUIT;
		this.dogmes = new String[] {CarteAction.SYMBOLES,CarteAction.MYSTIQUE,CarteAction.CHAOS};
		this.description="Donne un point d'Action d'Origine Nuit. ";
		this.nbPierre=2;
		
	}
	
	public void sacrifier(){
//		this.joueur.setPointActionNuit(this.joueur.getPointActionNuit()+1);
	}
	
	public void sacrifier(Joueur joueur){
		joueur.setPointActionNuit(joueur.getPointActionNuit()+1);
	}
		
}

