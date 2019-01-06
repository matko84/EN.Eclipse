package matko;

import javax.swing.JOptionPane;

public class E2Z2 {

	public static void main(String[] args) {
		
		double i=Double.parseDouble(JOptionPane.showInputDialog("Molim unesite prvi broj: "));
		double j=Double.parseDouble(JOptionPane.showInputDialog("Molim unesite drugi broj: "));
		
		double k=i+j;
		double l=i-j;
		double m=i*j;
		double n=i/j;
		
		System.out.println("Zboj dva unešena broja iznosi " + k);
		System.out.println("Razlika dva unešena broja iznosi " + l);
		System.out.println("Umnožak dva unešena broja iznosi " + m);
		System.out.println("Kvocijent dva unešena broja iznosi " + n);
		
	}

}
