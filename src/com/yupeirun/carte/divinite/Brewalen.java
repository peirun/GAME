package com.yupeirun.carte.divinite;

import com.yupeirun.carte.Carte;
import com.yupeirun.carte.Divinite;

public class Brewalen extends Divinite {
	public Brewalen() {
		this.origine = Carte.JOUR;
		this.nom = "Brewalen";
		this.description = "";
		this.dogmes = new String[]{Carte.NATURE,Carte.HUMAIN,Carte.MYSTIQUE};
	}
	
	public void capacite() {
	
	}
}
