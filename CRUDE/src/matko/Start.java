package matko;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Iterator;

import javax.print.attribute.standard.PrinterMessageFromOperator;
import javax.swing.JOptionPane;
import javax.swing.plaf.SliderUI;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Start implements Comparable<Vozac> {

	private List<Vozac> vozaci;

	public Start() {
		vozaci = new ArrayList<>();
		odabir();
	}

	private int izbornik() {
		int i = Integer
				.parseInt(JOptionPane.showInputDialog("IZBORNIK \n" + "1: Unos vozaca \n" + "2: Pregled vozaca \n"
						+ "3: Izmjena vozaca \n" + "4: Brisanje vozaca \n" + "5: Brisanje parne šifre \n" + "6: Najveće primanje \n"
						+ "7: Prosjek primanja \n" + "8: Slučajne vrijednosti \n" + "9: IZLAZ"));
		return i;
	}

	private void odabir() {
		switch (izbornik()) {
		case 1:
			unosVozaca();
			break;
		case 2:
			pregledVozaca();
			break;
		case 3:
			izmjenaVozaca();
			break;
		case 4:
			brisanjeVozaca();
			break;
		case 5:
			brisanjeParneSifre();
			break;
		case 6:
			najvecePrimanje();
			break;
		case 7:
			prosjekPrimanja();
			break;
		case 8:
			slucajneVrijednosti();
			break;
		case 9:
			return
			;

		default:
			break;
		}
		odabir();
	}

	private void brisanjeParneSifre() {
		if (vozaci.size() == 0) {
			return;
		} else {

			for (int i = vozaci.size() - 1; i >= 0; i--) {
//					pregledava sve vozače u listi

				Vozac A = vozaci.get(i);
				int j = A.getSifra();
				if (j % 2 != 0) {
//						System.out.println("Neparna šifra ->" + A.getSifra());
				} else {

//						System.out.println("Parna šifra ->" + A.getSifra());
//						System.out.println("Brišem šifru " + A.getSifra());
					vozaci.remove(A);

				}

			}

		}

	}

	private Vozac slucajneVrijednosti() {
		while (true) {
			try {
				int i = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj osoba za upis"));
				for (int j = 0; j < i; j++) {
					Vozac A = new Vozac();
					A.setIme(Pomocno.randomTekst("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
					A.setPrezime(Pomocno.randomTekst("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
					A.setPlaca(Pomocno.randomDouble(3) * 10000);
					A.setSifra(Pomocno.randomInt(i + 100));
					vozaci.add(A);
				}
				return null;
			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null, "Molim upišite cijeli broj");
			}
		}

	}

	private void prosjekPrimanja() {
		Double prosjek = vozaci.stream().mapToDouble(Vozac::getPlaca).average().getAsDouble();
		JOptionPane.showMessageDialog(null, "Prosjek primanja iznosi :" + prosjek);
	}

	private void najvecePrimanje() {
		Optional<Vozac> A = vozaci.stream().max(Comparator.comparing(Vozac::getPrezime));
		JOptionPane.showMessageDialog(null, A);
	}

	private void brisanjeVozaca() {
		if (vozaci.size() == 0) {
			return;
		} else {
			for (int i = 0; i < vozaci.size(); i++) {
				System.out.println((i + 1) + ". " + vozaci.get(i));

			}
		}

		int index = Pomocno.upisiBroj("Upisi redni broj vozača za izmjenu", 0, vozaci.size());
		Vozac A = vozaci.remove(index - 1);

	}

	private void izmjenaVozaca() {
		if (vozaci.size() == 0) {
			return;
		} else {
			for (int i = 0; i < vozaci.size(); i++) {
				System.out.println((i + 1) + ". " + vozaci.get(i));

			}
		}

		int index = Pomocno.upisiBroj("Upisi redni broj vozača za izmjenu", 0, vozaci.size());
		Vozac A = vozaci.get(index - 1);
		A = postaviVrijednosti(A);
		vozaci.set((index - 1), A);

	}

	private void pregledVozaca() {
		for (Vozac A : vozaci) {
			System.out.println(A + " \n");

			;

		}

	}

	private void unosVozaca() {
		Vozac A = new Vozac();
		A = postaviVrijednosti(A);
		vozaci.add(A);

	}

	private Vozac postaviVrijednosti(Vozac A) {
		A.setSifra(sifra(Pomocno.upisiBroj("Upiši šifru", 0, Integer.MAX_VALUE)));
		A.setIme(Pomocno.upisiTekst("Upiši ime vozača"));
		A.setPrezime(Pomocno.upisiTekst("Upiši prezime vozača"));
		A.setPlaca(Pomocno.upisiDecimal("Unesi iznos plaće", Double.MIN_NORMAL));

		return A;

	}

	private int sifra(int X) {
		if (vozaci.size() != 0) {
			for (Vozac A : vozaci) {
				if (A.getSifra() != X) {
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Navedena šifra već postoji, unesite drugi broj");

				}

			}
		}
		return X;
	}

	public static void main(String[] args) {
		new Start();

	}

	@Override
	public int compareTo(Vozac arg0) {
		return 0;
	}

}
