package matko;

import java.lang.Character.UnicodeScript;

import javax.swing.JOptionPane;

public class E6Z1 {

	public static void main(String[] args) {
		
		ISPIS(MNOŽENJE(unos()));
		
	}
	
	
	static int [] unos () {
		int x=Integer.parseInt(JOptionPane.showInputDialog("Koliko brojeva želiš?"));
		
		int unosi [] = new int [x];
		
		for (int i=0;i<x;i++) {
		unosi [i] = Integer.parseInt(JOptionPane.showInputDialog((i+1) + ". broj ?"));	
		}
		return unosi;
	}
	
	
	static int MNOŽENJE (int [] brojevi) {
		
		int UMNOŽAK=1;
		
		for(int i=0; i<brojevi.length;i++) {
			UMNOŽAK=UMNOŽAK * brojevi [i];
		}
		
		return UMNOŽAK;
		
	}
	
	static void ISPIS (int a) {
		System.out.println(a);
	}
	
	}
	
