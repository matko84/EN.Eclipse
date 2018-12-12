package matko;

import javax.swing.JOptionPane;

public class ZadatakModulo {

	public static void main(String[] args) {
		int i=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int j=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		System.out.println(i%j);

	
	}

}
