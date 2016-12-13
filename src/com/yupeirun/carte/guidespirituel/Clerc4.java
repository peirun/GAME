package com.yupeirun.carte.guidespirituel;

import com.yupeirun.carte.Carte;
import com.yupeirun.carte.GuideSpirituel;

public class Clerc4 extends GuideSpirituel {
	public Clerc4() {
		super();
		this.nom="Clerc4";
		this.dogmes=new String[] {Carte.CHAOS,Carte.MYSTIQUE};
		this.origine=Carte.JOUR;
		this.nbCroyantMax=2;
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
}
