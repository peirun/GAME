package com.yupeirun.carte.guidespirituel;

import com.yupeirun.carte.Carte;
import com.yupeirun.carte.GuideSpirituel;

public class Clerc1 extends GuideSpirituel {
	public Clerc1() {
		super();
		this.nom="Clerc1";
		this.dogmes=new String[] {Carte.MYSTIQUE,Carte.SYMBOLES};
		this.origine=Carte.NUIT;
		this.nbCroyantMax=2;
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
}
