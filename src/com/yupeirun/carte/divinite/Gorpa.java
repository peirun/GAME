package com.yupeirun.carte.divinite;

import com.yupeirun.carte.Carte;
import com.yupeirun.carte.Divinite;

public class Gorpa extends Divinite {
	public Gorpa() {
		this.origine = Carte.CREPUSCULE;
		this.nom = "Gorpa";
		this.description = "";
		this.dogmes = new String[]{Carte.HUMAIN,Carte.CHAOS,Carte.SYMBOLES};
	}
	
	public void capacite() {
	
	}
}
