package com.yupeirun.carte.guidespirituel;

import com.yupeirun.carte.Carte;
import com.yupeirun.carte.GuideSpirituel;

public class Ascete extends GuideSpirituel {
	public Ascete() {
		super();
		this.nom="Ascete";
		this.dogmes=new String[] {Carte.HUMAIN,Carte.SYMBOLES};
		this.origine=Carte.NUIT;
		this.nbCroyantMax=1;
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
}
