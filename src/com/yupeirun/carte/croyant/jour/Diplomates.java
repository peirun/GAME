package com.yupeirun.carte.croyant.jour;
import com.yupeirun.carte.Carte;
import com.yupeirun.carte.Croyant;
import com.yupeirun.controle.joueur.Joueur;

public class Diplomates extends Croyant{
	
	
	public Diplomates() {
		
		this.nom="Diplomates";
		this.origine="jour";
		this.description="Relancez le d¨¦ de Cosmogonie. "
				+ "Le tour se finit normalement sous la nouvelle influence.";
		this.nbPierre=4;
		this.dogmes=new String[] {Carte.SYMBOLES,Carte.HUMAIN,Carte.CHAOS};
	}


	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
	
	public void sacrifier(Joueur joueur) {
	
		
	}


}
