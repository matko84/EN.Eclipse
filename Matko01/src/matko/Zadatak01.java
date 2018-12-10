package matko;

import javax.swing.JOptionPane;

public class Zadatak01 {

	public static void main(String[] args) {
		
		//napisati program koji za tri unesena decimalna broja ispisuje
		// zbroj prva dva umanjen za treći broj
		
		
				double a=Double.parseDouble(JOptionPane.showInputDialog("Unesi prvi broj"));
				double b=Double.parseDouble(JOptionPane.showInputDialog("Daj drugi broj"));
				double c=Double.parseDouble(JOptionPane.showInputDialog("Daj treći broj"));
				double d=a+b-c;
				System.out.println(d);
	}

}
