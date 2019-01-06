package matko;

import javax.swing.JOptionPane;

public class E2Z3 {

	public static void main(String[] args) {
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("Molim unesite prvi broj: "));
		int j=Integer.parseInt(JOptionPane.showInputDialog("Molim unesite drugi broj: "));
		
		System.out.println("Rezultat cjelobrojnog dijeljenja iznosi " + i%j);

	}

}
