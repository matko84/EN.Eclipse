package matko;

import javax.swing.JOptionPane;

public class E2Z5 {

	public static void main(String[] args) {
		
		double i=Double.parseDouble(JOptionPane.showInputDialog("Molim unesite prvi decimalni broj: "));
		double j=Double.parseDouble(JOptionPane.showInputDialog("Molim unesite prvi decimalni broj: "));
		double k=Double.parseDouble(JOptionPane.showInputDialog("Molim unesite prvi decimalni broj: "));

		System.out.println(i+j-k);
	}

}
