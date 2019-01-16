package matko;

public abstract class E9osoba {

	public abstract void POZDRAV();
	
// 1. 
	private String ime;
	private String prezime;
	private int sifra;
	
	
// 3. CONSTRUCTORS
	
	public E9osoba() {
		super();
	}
	
		
	public E9osoba(String ime, String prezime, int sifra) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.sifra = sifra;
	}


// 2. GETTERS & SETTERS


	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	
	
	
	
	

}
