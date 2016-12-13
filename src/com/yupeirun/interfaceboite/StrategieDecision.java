package com.yupeirun.interfaceboite;

import com.yupeirun.controle.joueur.Joueur;

public interface StrategieDecision {
	public void choisirDefausse();
	public void utiliser();
	public void choisirUneOperation();
	public void setJoueur(Joueur joueur);
}
