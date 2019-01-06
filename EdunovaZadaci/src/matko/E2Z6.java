package matko;

import javax.swing.JOptionPane;

public class E2Z6 {

	public static void main(String[] args) {
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("Molimo unesite prvi cijeli broj "));
		int j=Integer.parseInt(JOptionPane.showInputDialog("Molimo unesite drugi cijeli broj "));
		double k=Double.parseDouble(JOptionPane.showInputDialog("Unesite DECIMALNI broj "));
		
		System.out.println(k + ", " + (i-j));

	}

}
