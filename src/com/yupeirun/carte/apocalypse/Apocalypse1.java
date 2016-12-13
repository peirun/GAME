package com.yupeirun.carte.apocalypse;

import com.yupeirun.carte.Apocalypse;
import com.yupeirun.controle.joueur.Joueur;
import com.yupeirun.controle.partie.Partie;

public class Apocalypse1 extends Apocalypse {
	public Apocalypse1() {
		super();
		this.origine=null;
	}
	
	public void sacrifier(Joueur j) {
		Partie.getInstance().ApocalypseProcess(j);
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
}
