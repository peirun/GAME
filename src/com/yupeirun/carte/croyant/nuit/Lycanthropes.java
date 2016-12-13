package com.yupeirun.carte.croyant.nuit;
import java.util.ArrayList;
import java.util.Iterator;

import com.yupeirun.carte.CarteAction;
import com.yupeirun.carte.Croyant;
import com.yupeirun.carte.GuideSpirituel;
import com.yupeirun.controle.carte.CartesSurTable;
import com.yupeirun.controle.joueur.Joueur;
import com.yupeirun.controle.partie.Partie;
import com.yupeirun.input.Input;

public class Lycanthropes extends Croyant {

	public Lycanthropes() {
		this.nom="Lycanthropes";
		this.origine=CarteAction.NUIT;
		this.dogmes = new String[] {CarteAction.HUMAIN,CarteAction.NATURE,CarteAction.CHAOS};
		this.description="Retirez... ";
		this.nbPierre=4;
		
	}
	
	public void sacrifier(){
		
	}
	
	public void sacrifier(Joueur joueur) {
		ArrayList<Joueur> js = Partie.getInstance().getJoueurs();
		Iterator<Joueur> it = js.iterator();
		System.out.print("choisir un joueur: ");
		while(it.hasNext()) {
			Joueur j = it.next();
			if(j.getGuideSpirituels().size() != 0) {
				System.out.println("Joueur" + j.getNumJoueur());
			}
		
		}
		int i = Input.getInt();
		ArrayList<GuideSpirituel> gs = (ArrayList<GuideSpirituel> )js.get(i).getGuideSpirituels();
		Iterator<GuideSpirituel> ig = gs.iterator();
		while(ig.hasNext()) {
			System.out.println(ig.next().toString());
		}
		System.out.println("Choisi une guide£º");
		int n = Input.getInt();
		ArrayList<Croyant> cs = (ArrayList<Croyant>)gs.get(n).getCroyants();
		int index = 0;
		while(index < cs.size()) {
			CartesSurTable.getInstance().getCroyantDeposes().add(cs.remove(index));
			index++;
		}
		gs.remove(n);
		
		
	}

		
}

