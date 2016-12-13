package com.yupeirun.carte.apocalypse;

import com.yupeirun.carte.Apocalypse;
import com.yupeirun.carte.Carte;
import com.yupeirun.controle.joueur.Joueur;
import com.yupeirun.controle.partie.Partie;

public class Apocalypse3 extends Apocalypse {
	public Apocalypse3() {
		super();
		this.origine=Carte.NEANT;
	}
	
	public void sacrifier() {}
	
	public void sacrifier(Joueur j) {
		Partie.getInstance().ApocalypseProcess(j);
	}
}
