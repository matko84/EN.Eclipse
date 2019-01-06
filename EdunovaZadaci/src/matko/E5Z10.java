package matko;

import java.sql.Array;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class E5Z10 {

	public static void main(String[] args) {


		
		int niz [] = new int [5];
		for (int i=0;i<5;i++) {
			niz[i]= Integer.parseInt(JOptionPane.showInputDialog("Unesi " + (i+1) + ". broj"));
			}
		
		Arrays.sort(niz);
		System.out.println(Arrays.toString(niz));
	}

}
