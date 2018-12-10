package matko;

import javax.swing.JOptionPane;

public class Zadatak02 {

	public static void main(String[] args) {
		
		//Program prima dva cijela broja i jedan decimalni.
		//ispisuje prvo decimalni pa razlika primljena dva cijela broja
		
		int 	a=Integer.parseInt(JOptionPane.showInputDialog("Molim prvi broj"));
		int 	b=Integer.parseInt(JOptionPane.showInputDialog("Molim drugi broj"));
		double 	c=Double.parseDouble(JOptionPane.showInputDialog("Molim treći broj"));
		
		double 	d=a-b;
		
		System.out.print(c);System.out.print(", ");System.out.println(d);

	}

}
