package matko;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ZadatakNiz01 {

	public static void main(String[] args) {
		
		//Program učitava 4 cijela broja i ispisuje ih od najmanjeg prema najvećem

//unos četiri broja		
		int i = Integer.parseInt(JOptionPane.showInputDialog("Prvi broj:"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("Drugi broj:"));
		int k = Integer.parseInt(JOptionPane.showInputDialog("Treći broj:"));
		int l = Integer.parseInt(JOptionPane.showInputDialog("Četvrti broj:"));

//formiranje niza
		int niz [] = {i,j,k,l};

//sortiranje, formiranje niza
		Arrays.sort(niz);

//ispis niza
		System.out.println(Arrays.toString(niz));
				
	}

}
