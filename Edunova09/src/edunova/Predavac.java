package edunova;

public class Predavac extends Osoba {

	private String iban;
	
	public Predavac() {
		super();
		System.out.println("Konstruktor predavaÄ�");
	}

	

	public Predavac(int sifra, String ime, String prezime, String email, String iban) {
		super(sifra, ime, prezime, email);
		this.iban = iban;
	}




	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}



	@Override
	public void pozdravi() {
		System.out.println("Dobar dan predavaÄ� " + getIme() );
		
	}
	
	@Override
	public String toString() {
		return "PredavaÄ� " + getIme();
	}
	
}
