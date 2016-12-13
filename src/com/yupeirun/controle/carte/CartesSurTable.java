package com.yupeirun.controle.carte;

import java.util.ArrayList;
import java.util.HashMap;

import com.yupeirun.carte.CarteAction;
import com.yupeirun.carte.Croyant;
import com.yupeirun.carte.Divinite;
import com.yupeirun.controle.joueur.Joueur;

public class CartesSurTable {
	private static CartesSurTable instance = null;
	private ArrayList<Croyant> croyantDeposes = new ArrayList<Croyant>();
	private ArrayList<Divinite> divinites;
	private HashMap<Joueur, ArrayList<CarteAction>> croyantRattaches;
	private HashMap<Joueur, ArrayList<CarteAction>> guidesUtilises;
	private CartesSurTable() {
		this.croyantDeposes = new ArrayList<Croyant>();
		this.guidesUtilises = new HashMap<Joueur, ArrayList<CarteAction>>();
		this.croyantRattaches = new HashMap<Joueur, ArrayList<CarteAction>>();
		this.divinites = new ArrayList<Divinite>();
	}

	public static CartesSurTable getInstance() {
		if (instance == null) {
			instance = new CartesSurTable();
		}
		return instance;
	}


	public ArrayList<Croyant> getCroyantDeposes() {
		return croyantDeposes;
	}

	public void setCroyantDeposes(Croyant c) {
		croyantDeposes.add(c);
	}

	public ArrayList<CarteAction> getGuidesUtilises(Joueur j) {
		return guidesUtilises.get(j);
	}

	public void setGuidesUtilises(HashMap<Joueur, ArrayList<CarteAction>> guidesUtilises) {
		this.guidesUtilises = guidesUtilises;
	}

	public ArrayList<CarteAction> getCroyantRattaches(Joueur j) {
		return croyantRattaches.get(j);
	}

	public void setCroyantRattaches(HashMap<Joueur, ArrayList<CarteAction>> croyantRattaches) {
		this.croyantRattaches = croyantRattaches;
	}

	public ArrayList<Divinite> getDivinites() {
		return divinites;
	}

	public void setDivinites(ArrayList<Divinite> divinites) {
		this.divinites = divinites;
	}

}
