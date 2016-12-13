package com.yupeirun.carte.guidespirituel;

import com.yupeirun.carte.Carte;
import com.yupeirun.carte.GuideSpirituel;

public class Shaman extends GuideSpirituel {
	public Shaman() {
		super();
		this.nom="Shaman";
		this.dogmes=new String[] {Carte.SYMBOLES,Carte.NATURE};
		this.origine=Carte.NUIT;
		this.nbCroyantMax=3;
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
}
