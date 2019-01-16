package matko;

public class E9start {

	public static void main(String[] args) {
		

// KREIRANJE POLAZNIKA I PREDAVAČA
		
		E9polaznik newPolaznik = new E9polaznik ();
		E9predavac newPredavac = new E9predavac ();

// KREIRANJE NIZA OSOBA
		
		E9osoba nizOsoba [] = new E9osoba [2];

		// DEFINIRANJE NIZA OSOBA, NA KOJIM INDEKSIMA SE NALAZE PREDAVAČ I POLAZNIK
		
		newPolaznik.setIme("PERO");
		nizOsoba[0]=newPolaznik;
		
		newPredavac.setIme("GORAN");
		nizOsoba [1]=newPredavac;
		
// KREIRANJE PETLJE
		// for (int i:niz){}
		// i predstavlja vrijednost niza na navedenom indeksu
		for(E9osoba Oosoba:nizOsoba) {
			System.out.println(Oosoba.getIme());
			Oosoba.POZDRAV();
		}

	}

}
