package matko;

public class E11z1vozac {

//		1.

	private String ime;
	private String prezime;
	private String tvrtka;

//	 	3.

	public E11z1vozac() {
		super();
	}

	public E11z1vozac(String ime, String prezime, String tvrtka) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.tvrtka = tvrtka;
	}

//		2. 

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

	public String getTvrtka() {
		return tvrtka;
	}

	public void setTvrtka(String tvrtka) {
		this.tvrtka = tvrtka;
	}

}
