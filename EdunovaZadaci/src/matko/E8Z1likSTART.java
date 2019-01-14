package matko;

public class E8Z1likSTART {

	public static void main(String[] args) {

		E8Z1lik OSOBA = new E8Z1lik();
		OSOBA.setDob(33);
		OSOBA.setIme("Marko");
		OSOBA.setPrezime("Perić");
		
		
		E8Z1mjesto mjesto = new E8Z1mjesto();
		mjesto.setNaziv("Našice");
		mjesto.setDrzava("Hrvatska");
		
		OSOBA.setMjesto(mjesto);
		
		System.out.println(OSOBA.getMjesto().getNaziv() + " " + OSOBA.getMjesto().getDrzava());
		
		
		System.out.println(OSOBA.getIme() + " " + OSOBA.getPrezime() + " starosti " + OSOBA.getDob() + " godine ");

	}

}
