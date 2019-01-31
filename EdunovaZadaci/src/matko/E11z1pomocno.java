package matko;

import javax.swing.JOptionPane;

import edunova.Osoba;

public class E11z1pomocno {
	
	public static String Tekst(String poruka) {
		String unos=JOptionPane.showInputDialog(poruka);
		System.out.println(unos);
		return unos;
	}

	public static void odabir() {
		switch (E11z1start.Izbor()) {
		case 1:
			dodajVozaca();
			break;
		case 2:
			JOptionPane.showConfirmDialog(null, "Izabrali ste 2");
			break;
		case 3:
			tablica();
			break;
		case 4:
			JOptionPane.showConfirmDialog(null, "Izabrali ste 4");
			break;
		case 5:
			JOptionPane.showConfirmDialog(null, "Izabrali ste 5");
			break;

		default:
			break;
		}
	}

	private static void tablica() {
		for(E11z1vozac x: vozaci) {
			System.out.println(x);
		}
		
	}


	private static E11z1vozac postaviSvojstva(E11z1vozac x) {
		x.setIme(Tekst("Ime vozaca"));
		x.setPrezime(Tekst("Prezime vozaca"));
		x.setTvrtka(Tekst("Tvrtka"));
		return x;
	}

	private static String unosVozaca() {

		return null;

	}

}
