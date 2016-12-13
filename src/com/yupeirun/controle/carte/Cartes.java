package com.yupeirun.controle.carte;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

import com.yupeirun.carte.CarteAction;
import com.yupeirun.carte.apocalypse.Apocalypse1;
import com.yupeirun.carte.apocalypse.Apocalypse2;
import com.yupeirun.carte.apocalypse.Apocalypse3;
import com.yupeirun.carte.apocalypse.Apocalypse4;
import com.yupeirun.carte.apocalypse.Apocalypse5;
import com.yupeirun.carte.croyant.jour.Diplomates;
import com.yupeirun.carte.croyant.jour.Ermite1;
import com.yupeirun.carte.croyant.jour.Ermite2;
import com.yupeirun.carte.croyant.jour.GuerriersSaints;
import com.yupeirun.carte.croyant.jour.Integristes;
import com.yupeirun.carte.croyant.jour.Moines1;
import com.yupeirun.carte.croyant.jour.Moines2;
import com.yupeirun.carte.croyant.jour.Moines3;
import com.yupeirun.carte.croyant.jour.Moines4;
import com.yupeirun.carte.croyant.jour.Moines5;
import com.yupeirun.carte.croyant.jour.Travailleurs1;
import com.yupeirun.carte.croyant.jour.Travailleurs2;
import com.yupeirun.carte.croyant.jour.Travailleurs3;
import com.yupeirun.carte.croyant.neant.Alienes1;
import com.yupeirun.carte.croyant.neant.Alienes2;
import com.yupeirun.carte.croyant.neant.Alienes3;
import com.yupeirun.carte.croyant.neant.Esprits1;
import com.yupeirun.carte.croyant.neant.Esprits2;
import com.yupeirun.carte.croyant.neant.Esprits3;
import com.yupeirun.carte.croyant.neant.Esprits4;
import com.yupeirun.carte.croyant.neant.Esprits5;
import com.yupeirun.carte.croyant.neant.Nihillistes;
import com.yupeirun.carte.croyant.neant.Revenant;
import com.yupeirun.carte.croyant.neant.Revolutionnaires;
import com.yupeirun.carte.croyant.nuit.Alchimistes1;
import com.yupeirun.carte.croyant.nuit.Alchimistes2;
import com.yupeirun.carte.croyant.nuit.Alchimistes3;
import com.yupeirun.carte.croyant.nuit.Demons1;
import com.yupeirun.carte.croyant.nuit.Demons2;
import com.yupeirun.carte.croyant.nuit.Demons3;
import com.yupeirun.carte.croyant.nuit.Demons4;
import com.yupeirun.carte.croyant.nuit.Demons5;
import com.yupeirun.carte.croyant.nuit.Illusionnistes;
import com.yupeirun.carte.croyant.nuit.Lycanthropes;
import com.yupeirun.carte.croyant.nuit.Pillards;
import com.yupeirun.carte.croyant.nuit.Vampire1;
import com.yupeirun.carte.croyant.nuit.Vampire2;
import com.yupeirun.carte.deusex.Bouleversement;
import com.yupeirun.carte.deusex.ColereDivine1;
import com.yupeirun.carte.deusex.ColereDivine2;
import com.yupeirun.carte.deusex.Concentration;
import com.yupeirun.carte.deusex.Diversion;
import com.yupeirun.carte.deusex.Fourberie;
import com.yupeirun.carte.deusex.InfluenceJour;
import com.yupeirun.carte.deusex.InfluenceNeant;
import com.yupeirun.carte.deusex.InfluenceNuit;
import com.yupeirun.carte.deusex.InfluenceNulle1;
import com.yupeirun.carte.deusex.InfluenceNulle2;
import com.yupeirun.carte.deusex.Inquisition;
import com.yupeirun.carte.deusex.Miroir;
import com.yupeirun.carte.deusex.OrdreCeleste;
import com.yupeirun.carte.deusex.Phoenix;
import com.yupeirun.carte.deusex.Stase;
import com.yupeirun.carte.deusex.Transe;
import com.yupeirun.carte.deusex.TrouNoir;
import com.yupeirun.carte.guidespirituel.Anarchiste;
import com.yupeirun.carte.guidespirituel.Ascete;
import com.yupeirun.carte.guidespirituel.Clerc1;
import com.yupeirun.carte.guidespirituel.Clerc2;
import com.yupeirun.carte.guidespirituel.Clerc3;
import com.yupeirun.carte.guidespirituel.Clerc4;
import com.yupeirun.carte.guidespirituel.Clerc5;
import com.yupeirun.carte.guidespirituel.Clerc6;
import com.yupeirun.carte.guidespirituel.Clerc7;
import com.yupeirun.carte.guidespirituel.Clerc8;
import com.yupeirun.carte.guidespirituel.Devin;
import com.yupeirun.carte.guidespirituel.Exorciste;
import com.yupeirun.carte.guidespirituel.Martyr1;
import com.yupeirun.carte.guidespirituel.Martyr2;
import com.yupeirun.carte.guidespirituel.Martyr3;
import com.yupeirun.carte.guidespirituel.Messie;
import com.yupeirun.carte.guidespirituel.Shaman;
import com.yupeirun.carte.guidespirituel.Socier;
import com.yupeirun.carte.guidespirituel.Tyran;

public class Cartes {
	private LinkedList<CarteAction> cartes;
	private static Cartes cartesPioche=null;

	private Cartes() {
		cartes = new LinkedList<CarteAction>();
		//ajouter cartes specifier [Pas finir]
		cartes.add(new Ermite1());
		cartes.add(new Ermite2());
		cartes.add(new Moines1());
		cartes.add(new Moines2());
		cartes.add(new Moines3());
		cartes.add(new Moines4());
		cartes.add(new Moines5());
		cartes.add(new Travailleurs1());
		cartes.add(new Travailleurs2());
		cartes.add(new Travailleurs3());
		
		cartes.add(new Esprits1());
		cartes.add(new Esprits2());
		cartes.add(new Esprits3());
		cartes.add(new Esprits4());
		cartes.add(new Esprits5());
		cartes.add(new Revolutionnaires());
		
		cartes.add(new Alienes1());
		cartes.add(new Alienes2());
		cartes.add(new Alienes3());
		
		cartes.add(new Vampire1());
		cartes.add(new Vampire2());
		
		cartes.add(new Demons1());
		cartes.add(new Demons2());
		cartes.add(new Demons3());
		cartes.add(new Demons4());
		cartes.add(new Demons5());
		
		cartes.add(new Integristes());
		cartes.add(new GuerriersSaints());
		cartes.add(new Lycanthropes());
		cartes.add(new Diplomates());
		cartes.add(new Revenant());
		cartes.add(new Pillards());
		cartes.add(new Illusionnistes());
		cartes.add(new Nihillistes());
		
		cartes.add(new Alchimistes1());
		cartes.add(new Alchimistes2());
		cartes.add(new Alchimistes3());
		
		//GuideSpirituel
		cartes.add(new Anarchiste());
		cartes.add(new Ascete());
		cartes.add(new Clerc1());
		cartes.add(new Clerc2());
		cartes.add(new Clerc3());
		cartes.add(new Clerc4());
		cartes.add(new Clerc5());
		cartes.add(new Clerc6());
		cartes.add(new Clerc7());
		cartes.add(new Clerc8());
		cartes.add(new Devin());
		cartes.add(new Exorciste());
		cartes.add(new Martyr1());
		cartes.add(new Martyr2());
		cartes.add(new Martyr3());
		cartes.add(new Messie());
		cartes.add(new Shaman());
		cartes.add(new Socier());
		cartes.add(new Tyran());
		
		//DeusEx
		cartes.add(new Bouleversement());
		cartes.add(new ColereDivine1());
		cartes.add(new ColereDivine2());
		cartes.add(new Concentration());
		cartes.add(new Diversion());
		cartes.add(new Fourberie());
		cartes.add(new InfluenceJour());
		cartes.add(new InfluenceNuit());
		cartes.add(new InfluenceNeant());
		cartes.add(new InfluenceNulle1());
		cartes.add(new InfluenceNulle2());
		cartes.add(new Inquisition());
		cartes.add(new Miroir());
		cartes.add(new OrdreCeleste());
		cartes.add(new Phoenix());
		cartes.add(new Stase());
		cartes.add(new Transe());
		cartes.add(new TrouNoir());
		
		//ajouter apocalypse
		cartes.add(new Apocalypse1());
		cartes.add(new Apocalypse2());
		cartes.add(new Apocalypse3());
		cartes.add(new Apocalypse4());
		cartes.add(new Apocalypse5());
		
		melanger();
	}
	
	//sigleton
	public static Cartes getInstance() {
		if(cartesPioche==null) {
			cartesPioche=new Cartes();
		}
		return cartesPioche;
	}  
	public Collection<CarteAction> getCartes() {
		return cartes;
	}
	//melanger des cartes
	public void melanger() {
		Collections.shuffle(cartes);
	}

	//nombre de cartes
	public int getNbCartes() {
		return this.cartes.size();
	}
	
	//retirer carte [comment evider des cartes ne sont pas doublon]
	public CarteAction retirerCarte() {
		return cartes.removeFirst();
	}

}
