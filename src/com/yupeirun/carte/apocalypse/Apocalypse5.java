package com.yupeirun.carte.apocalypse;

import com.yupeirun.carte.Apocalypse;
import com.yupeirun.controle.joueur.Joueur;
import com.yupeirun.controle.partie.Partie;

public class Apocalypse5 extends Apocalypse {
	public Apocalypse5() {
		super();
		this.origine=null;
	}
	
	public void sacrifier() {}
	
	public void sacrifier(Joueur j) {
		Partie.getInstance().ApocalypseProcess(j);
	}
}
