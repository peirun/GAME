package com.yupeirun.carte.guidespirituel;

import com.yupeirun.carte.Carte;
import com.yupeirun.carte.GuideSpirituel;
import com.yupeirun.controle.joueur.Joueur;
import com.yupeirun.controle.partie.Partie;

public class Martyr3 extends GuideSpirituel {
	public Martyr3() {
		super();
		this.nom="Martyr3";
		this.dogmes=new String[] {Carte.NATURE,Carte.CHAOS};
		this.origine=Carte.NEANT;
		this.nbCroyantMax=2;
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
	
	public void sacrifier(Joueur j) {
		Partie.getInstance().ApocalypseProcess(j);
	}
}
