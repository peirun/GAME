package com.yupeirun.carte.guidespirituel;

import com.yupeirun.carte.Carte;
import com.yupeirun.carte.GuideSpirituel;

public class Messie extends GuideSpirituel {
	public Messie() {
		super();
		this.nom="Messie";
		this.dogmes=new String[] {Carte.HUMAIN,Carte.MYSTIQUE};
		this.origine=Carte.JOUR;
		this.nbCroyantMax=3;
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
}
