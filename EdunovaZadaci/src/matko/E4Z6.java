package matko;

import javax.swing.JOptionPane;

public class E4Z6 {

	public static void main(String[] args) {
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("Prvi broj"));
		int j=Integer.parseInt(JOptionPane.showInputDialog("Drugi broj"));
		
		System.out.println("Zbroj - " + (i+j));
		System.out.println("Razlika - " + (i-j));
		System.out.println("Produkt - " + (i*j));
		System.out.println("Kvocijent - " + (i/j));
		System.out.println("Aritmetička sredina - " + (i+j)/2);
		System.out.println("Zbroj kvadrata - " + (i*i+j*j));

	}

}
