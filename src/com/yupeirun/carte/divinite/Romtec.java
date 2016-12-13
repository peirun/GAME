package com.yupeirun.carte.divinite;

import com.yupeirun.carte.Carte;
import com.yupeirun.carte.Divinite;

public class Romtec extends Divinite {
	public Romtec() {
		this.origine = Carte.CREPUSCULE;
		this.nom = "Romtec";
		this.description = "";
		this.dogmes = new String[]{Carte.NATURE,Carte.HUMAIN,Carte.CHAOS};
	}
	
	public void capacite() {
	
	}
}
