package com.yupeirun.carte.guidespirituel;

import com.yupeirun.carte.Carte;
import com.yupeirun.carte.GuideSpirituel;

public class Exorciste extends GuideSpirituel {
	public Exorciste() {
		super();
		this.nom="Exorciste";
		this.dogmes=new String[] {Carte.CHAOS,Carte.MYSTIQUE};
		this.origine=Carte.JOUR;
		this.nbCroyantMax=1;
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
}
