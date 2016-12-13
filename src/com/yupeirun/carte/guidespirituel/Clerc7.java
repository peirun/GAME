package com.yupeirun.carte.guidespirituel;

import com.yupeirun.carte.Carte;
import com.yupeirun.carte.GuideSpirituel;

public class Clerc7 extends GuideSpirituel {
	public Clerc7() {
		super();
		this.nom="Clerc7";
		this.dogmes=new String[] {Carte.CHAOS,Carte.NATURE};
		this.origine=Carte.JOUR;
		this.nbCroyantMax=2;
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
}
