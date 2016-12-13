package com.yupeirun.carte.guidespirituel;

import com.yupeirun.carte.Carte;
import com.yupeirun.carte.GuideSpirituel;

public class Clerc6 extends GuideSpirituel {
	public Clerc6() {
		super();
		this.nom="Clerc6";
		this.dogmes=new String[] {Carte.SYMBOLES,Carte.CHAOS};
		this.origine=Carte.NEANT;
		this.nbCroyantMax=2;
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
}
