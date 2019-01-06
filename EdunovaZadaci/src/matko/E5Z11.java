package matko;

import java.sql.Array;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class E5Z11 {

	public static void main(String[] args) {
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("Koliko brojeva želiš upisati?"));
		
		
		int niz [] = new int [i];
		for (int j=0;j<i;j++) {
			
			niz [j]=Integer.parseInt(JOptionPane.showInputDialog("Molim unesite " + (j+1) + ". broj"));
			}
		
		
		Arrays.sort(niz);
		
			
		for (int k=i-1; k>-1; --k) {
			System.out.println(niz[k]);
		}
			
	}

}
