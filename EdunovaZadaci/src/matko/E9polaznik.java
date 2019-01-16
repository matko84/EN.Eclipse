package matko;

public class E9polaznik extends E9osoba{

	private String brojUgovora;
	
	
	
	
	
	public E9polaznik() {
		super();
		
	}

	public E9polaznik(String ime, String prezime, int sifra, String brojUgovora) {
	super(ime, prezime, sifra);
	this.brojUgovora = brojUgovora;
	}


	
	
	public String getBrojUgovora() {
		return brojUgovora;
	}

	public void setBrojUgovora(String brojUgovora) {
		this.brojUgovora = brojUgovora;
	}
	
	
	public void POZDRAV () {
		System.out.println("pozdrav polazniče" + getIme());
	}
	
}
