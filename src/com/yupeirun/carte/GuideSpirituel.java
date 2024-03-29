package com.yupeirun.carte;

import java.util.ArrayList;
import java.util.List;

import com.yupeirun.controle.joueur.Joueur;
import com.yupeirun.interfaceboite.Sacrifier;

public abstract class GuideSpirituel extends CarteAction implements Sacrifier {
	protected int nbCroyantMax;
	protected int nbCroyantSontRattache;
	protected List<Croyant> croyants=new ArrayList<Croyant>();
	
	public GuideSpirituel() {
		// TODO Auto-generated constructor stub
		super();
		this.type="Guide";
		
	}
	@Override
	public void sacrifier(Joueur j) {
		// TODO Auto-generated method stub

	}

	@Override
	public void utiliser() {
		// TODO Auto-generated method stub

	}

	public int getNbCroyantMax() {
		return nbCroyantMax;
	}

	public void setNbCroyantMax(int nbCroyantMax) {
		this.nbCroyantMax = nbCroyantMax;
	}

	public int getNbCroyantSontRattache() {
		return nbCroyantSontRattache;
	}

	public void setNbCroyantSontRattache(int nbCroyantSontRattache) {
		this.nbCroyantSontRattache = nbCroyantSontRattache;
	}
	
	public List<Croyant> getCroyants(){
		return croyants;
	}

	public void setCroyants(List<Croyant> croyants) {
		this.croyants = croyants;
	}
	
	
}
