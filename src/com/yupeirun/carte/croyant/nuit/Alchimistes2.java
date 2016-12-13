package com.yupeirun.carte.croyant.nuit;
import com.yupeirun.carte.Croyant;
import com.yupeirun.controle.joueur.Joueur;

public class Alchimistes2 extends Croyant{
	private String[] dogemesDivinite={"Humain","Mistique"};
	
	public Alchimistes2() {
	
		this.nom="Alchimistes";
		this.origine=Croyant.NUIT;
		this.dogmes = new String[] {Croyant.MYSTIQUE,Croyant.NATURE,Croyant.CHAOS};
		this.description="Emp¨ºche une Divinit¨¦ poss¨¦dant le Dogme Humain ou Mystique "
				+ "de sacrifier une de ses cartes de Croyants durant ce tour de jeu";
		this.nbPierre=2;
		
	}
	
	public void sacrifier(Joueur joueur){
//		joueur.setPeutSacrifierCroyant(false);
	}

	public String[] getDogemesDivinite() {
		return dogemesDivinite;
	}

	public void setDogemesDivinite(String[] dogemesDivinite) {
		this.dogemesDivinite = dogemesDivinite;
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}

}
