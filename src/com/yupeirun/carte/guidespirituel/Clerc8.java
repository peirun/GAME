package com.yupeirun.carte.guidespirituel;

import com.yupeirun.carte.Carte;
import com.yupeirun.carte.GuideSpirituel;

public class Clerc8 extends GuideSpirituel {
	public Clerc8() {
		super();
		this.nom="Clerc8";
		this.dogmes=new String[] {Carte.HUMAIN,Carte.NATURE};
		this.origine=Carte.NUIT;
		this.nbCroyantMax=2;
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
}
