package matko;

import java.awt.Transparency;
import java.math.BigDecimal;
import java.util.Random;

import javax.swing.JOptionPane;

public class Pomocno {

	public static int upisiBroj(String poruka, int min, int max) {
		int unos = 0;
		while (true) {

			try {
				unos = Integer.parseInt(JOptionPane.showInputDialog(poruka));
				if (unos >= min && unos <= max) {
//					JOptionPane.showMessageDialog(null, "Odabrali ste :" + unos);
					break;
				} else {

					JOptionPane.showMessageDialog(null,
							"Broj koji ste upisali nije u rasponu od " + min + " do " + max);
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Niste upisali cijeli broj");
			}
		}
		return unos;
	}

	public static String upisiTekst(String poruka) {
		while (true) {
			String tekst = JOptionPane.showInputDialog(poruka);
			if (tekst.length() != 0) {
//				JOptionPane.showMessageDialog(null, "Upisali ste " + tekst);
				return tekst;

			} else {
				JOptionPane.showMessageDialog(null, "Niste upisali traženi podatak");
			}
		}

	}

	public static Double upisiDecimal(String poruka, Double min) {

		while (true) {

			try {
				Double broj = new Double(JOptionPane.showInputDialog(poruka));
				if (broj.compareTo(Double.MIN_NORMAL) > 0) {
//					JOptionPane.showMessageDialog(null, "Upisali ste " + broj);
					return broj;
				} else {
					JOptionPane.showMessageDialog(null, "Broj je manji od 0");
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Upišite ispravan broj");
			}

		}

	}

	public static String randomTekst(String slova) {

// random broj slova u teksu		
		Double d = Math.random() * 12;
		int a = d.intValue();

// random odabir slova		
		Random rand = new Random();
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < a; i++) {
			int randIndex = rand.nextInt(slova.length());
			res.append(slova.charAt(randIndex));
		}
		return res.toString();

	}

	public static int randomInt(int max) {
		Double d = Math.random() * max;
		int a = d.intValue();
		return a;
	}

	public static double randomDouble(int max) {
		Double d = Math.random() * max;
		return Math.round(d);
	}
}
