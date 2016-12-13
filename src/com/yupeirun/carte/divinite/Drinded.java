package com.yupeirun.carte.divinite;

import com.yupeirun.carte.Carte;
import com.yupeirun.carte.Divinite;



public class Drinded extends Divinite {
	public Drinded() {
		this.origine = Carte.JOUR;
		this.nom = "Drinded";
		this.description = "";
		this.dogmes = new String[]{Carte.NATURE,Carte.HUMAIN,Carte.SYMBOLES};
	}
	
	public void capacite() {

	}
}
