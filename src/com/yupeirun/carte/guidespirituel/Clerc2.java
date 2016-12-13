package com.yupeirun.carte.guidespirituel;

import com.yupeirun.carte.Carte;
import com.yupeirun.carte.GuideSpirituel;

public class Clerc2 extends GuideSpirituel {
	public Clerc2() {
		super();
		this.nom="Clerc2";
		this.dogmes=new String[] {Carte.NATURE,Carte.SYMBOLES};
		this.origine=Carte.NUIT;
		this.nbCroyantMax=2;
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
}
