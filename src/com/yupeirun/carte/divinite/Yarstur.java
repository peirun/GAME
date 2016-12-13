package com.yupeirun.carte.divinite;

import com.yupeirun.carte.Carte;
import com.yupeirun.carte.Divinite;

public class Yarstur extends Divinite {

	public Yarstur() {
		this.origine = Carte.JOUR;
		this.nom = "Yarstur";
		this.description = "";
		this.dogmes = new String[]{Carte.CHAOS,Carte.SYMBOLES,Carte.MYSTIQUE};
	}
	
	public void capacite() {

	}

}
