package com.yupeirun.carte.croyant.nuit;
import com.yupeirun.carte.CarteAction;
import com.yupeirun.carte.Croyant;
import com.yupeirun.controle.joueur.Joueur;

public class Demons4 extends Croyant {

	public Demons4() {
		this.nom="Demon";
		this.origine=CarteAction.NUIT;
		this.dogmes = new String[] {CarteAction.MYSTIQUE,CarteAction.NATURE,CarteAction.SYMBOLES};
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

