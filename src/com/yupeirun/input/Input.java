package com.yupeirun.input;

import java.util.InputMismatchException;

import com.yupeirun.controle.partie.Partie;

public class Input {
	
	public static int getInt() {
		int n = -1;
		boolean FLAG = false; 
		while(!FLAG) {
			try {
				n = Partie.sc.nextInt();
				FLAG = true;
			}catch(InputMismatchException e) {
				System.out.println("Input illegal! Reessayer input");
				Partie.sc.next();
				FLAG = false;
			}
		}
		return n;
	}
	
}
