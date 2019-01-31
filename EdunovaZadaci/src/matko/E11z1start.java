package matko;


import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class E11z1start {
	
	public List <E11z1vozac> vozaci;
	
	public E11z1start() {
		vozaci = new ArrayList<>();
	}
	
	
	
	public static int Izbor () {
		int i=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj željene radnje \n "
				+ "1: unos vozača \n"
				+ "2: izmjena podataka \n"
				+ "3: prikaz unesenih podataka \n"
				+ "4: brisanje podataka \n"
				+ "5: izlaz iz programa"));
			return i;
	}

	private static void dodajVozaca() {
		E11z1vozac X = new E11z1vozac();
		X= postaviSvojstva(X);
		.add (X);
		
	}

		
	
	
// 		main	
	public static void main(String[] args) {
		E11z1pomocno.odabir();
		
	}
}
