package com.yupeirun.controle.carte;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.yupeirun.carte.Divinite;
import com.yupeirun.carte.divinite.Brewalen;
import com.yupeirun.carte.divinite.Drinded;
import com.yupeirun.carte.divinite.Gorpa;
import com.yupeirun.carte.divinite.Gwengbelen;
import com.yupeirun.carte.divinite.Killinstred;
import com.yupeirun.carte.divinite.Llewella;
import com.yupeirun.carte.divinite.PuiTara;
import com.yupeirun.carte.divinite.Romtec;
import com.yupeirun.carte.divinite.Sbingva;
import com.yupeirun.carte.divinite.Yarstur;

public class CartesDivinite {
	private static List<Divinite> divinitesPioche=new LinkedList<Divinite>();
	private static CartesDivinite cartesDivinite = null;
	
	public static CartesDivinite getInstance() {
		if(cartesDivinite==null) {
			cartesDivinite = new CartesDivinite();
		}
		
		return cartesDivinite;
	}
	
	private CartesDivinite() {
		divinitesPioche.add(new Brewalen());
		divinitesPioche.add(new Drinded());
		divinitesPioche.add(new Gorpa());
		divinitesPioche.add(new Gwengbelen());
		divinitesPioche.add(new Killinstred());
		divinitesPioche.add(new Llewella());
		divinitesPioche.add(new PuiTara());
		divinitesPioche.add(new Romtec());
		divinitesPioche.add(new Sbingva());
		divinitesPioche.add(new Yarstur());
		
		melanger();
	}
	
	public Divinite returnDivinite() {
		int i = new Random().nextInt(divinitesPioche.size());
		return divinitesPioche.remove(i);
	}
	
	public void melanger() {
		Collections.shuffle(divinitesPioche);
	}

	public List<Divinite> getCartesDivinite() {
		return CartesDivinite.divinitesPioche;
	}
	
	
	
	
}
