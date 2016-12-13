package com.yupeirun.carte.guidespirituel;

import com.yupeirun.carte.Carte;
import com.yupeirun.carte.GuideSpirituel;

public class Clerc5 extends GuideSpirituel {
	public Clerc5() {
		super();
		this.nom="Clerc5";
		this.dogmes=new String[] {Carte.NATURE,Carte.MYSTIQUE};
		this.origine=Carte.NEANT;
		this.nbCroyantMax=2;
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
}
