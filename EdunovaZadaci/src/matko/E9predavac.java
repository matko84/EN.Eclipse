package matko;

public class E9predavac extends E9osoba {

	private String iban;

	
	
	
	
	public E9predavac() {
		super();
	}
	
	
		public E9predavac(String ime, String prezime, int sifra) {
		super(ime, prezime, sifra);
	}


		



	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}
	
	
	public void POZDRAV () {
		System.out.println("Pozdrav predavaču" + getIme());
	}
	
	
}
