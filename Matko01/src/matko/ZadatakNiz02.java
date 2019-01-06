package matko;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ZadatakNiz02 {

	public static void main(String[] args) {
		//Program prima 4 broja 
		//ispisuje zadnji broj

//unos četiri broja		
		int i = Integer.parseInt(JOptionPane.showInputDialog("Prvi broj:"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("Drugi broj:"));
		int k = Integer.parseInt(JOptionPane.showInputDialog("Treći broj:"));
		int l = Integer.parseInt(JOptionPane.showInputDialog("Četvrti broj:"));

//formiranje niza
		int niz [] = {i,j,k,l};
		
System.out.println(niz[3]);
	
	}

}
