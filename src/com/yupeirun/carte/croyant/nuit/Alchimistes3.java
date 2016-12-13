package com.yupeirun.carte.croyant.nuit;
import com.yupeirun.carte.Croyant;
import com.yupeirun.controle.joueur.Joueur;

public class Alchimistes3 extends Croyant{
	public Alchimistes3() {
	
		this.nom="Alchimiste";
		this.origine=Croyant.NUIT;
		this.dogmes = new String[] {Croyant.MYSTIQUE,Croyant.HUMAIN,Croyant.CHAOS};
		this.description="Vous piochez deux cartes au hasard dans la main d'une autre Divinit¨¦.";
		this.nbPierre=2;
		
	}
	
	public void sacrifier(Joueur joueur){
//		this.joueur.mainDuJoueur.add(joueur.mainDuJoueur.get(0));
//		this.joueur.mainDuJoueur.add(joueur.mainDuJoueur.get(1));
//		joueur.mainDuJoueur.remove(0);
//		joueur.mainDuJoueur.remove(1);
		
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}

}
