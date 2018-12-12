package matko;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ZadatakOperatori {

	public static void main(String[] args) {
//		+
//		-
//		/
//		*
		
		double i=Double.parseDouble(JOptionPane.showInputDialog("Molim unesite prvi broj :"));
		double j=Double.parseDouble(JOptionPane.showInputDialog("Molim unesite drugi broj :"));
		
		double k=i+j;
		double l=i*k;
		double m=i/k;
		double n=i-k;
		
		System.out.println(k + ", " + l + ", " + m + ", " + n);

	}

}
