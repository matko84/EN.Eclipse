package matko;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class E4Z1 {

	public static void main(String[] args) {


		int i=Integer.parseInt(JOptionPane.showInputDialog("prvi broj"));
		int j=Integer.parseInt(JOptionPane.showInputDialog("drugi broj"));
		int k=Integer.parseInt(JOptionPane.showInputDialog("treći broj"));
		int l=Integer.parseInt(JOptionPane.showInputDialog("četvrti broj"));
		
		int niz [] = {i,j,k,l};
		
		Arrays.sort(niz);
		
		System.out.println(Arrays.toString(niz));
		
		

	}

}
