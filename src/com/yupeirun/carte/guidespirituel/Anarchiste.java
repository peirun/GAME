package com.yupeirun.carte.guidespirituel;

import com.yupeirun.carte.Carte;
import com.yupeirun.carte.GuideSpirituel;

public class Anarchiste extends GuideSpirituel {

	public Anarchiste() {
		super();
		this.nom="Anarchiste";
		this.dogmes=new String[] {Carte.HUMAIN,Carte.CHAOS};
		this.origine=Carte.NEANT;
		this.nbCroyantMax=3;
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}

}
