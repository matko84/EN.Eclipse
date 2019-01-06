package matko;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class E3Z8 {

	public static void main(String[] args) {

		int i=Integer.parseInt(JOptionPane.showInputDialog("prvi broj"));
		int j=Integer.parseInt(JOptionPane.showInputDialog("drugi broj"));
		int k=Integer.parseInt(JOptionPane.showInputDialog("treći broj"));
		int l=Integer.parseInt(JOptionPane.showInputDialog("četvrti broj"));
		
		if (i==l) {
			System.out.println(j+k);
		} else {
			int niz [] = {i,j,k,l};
			Arrays.sort(niz);
			System.out.println(Arrays.toString(niz));
			
		}

	}

}
