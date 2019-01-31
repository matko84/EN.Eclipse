package matko;

import java.math.BigDecimal;

public class Vozac {

	private int sifra;
	private String ime;
	private String prezime;
	private Double placa;

	public Vozac(int sifra, String ime, String prezime, Double placa) {
		super();
		this.sifra = sifra;
		this.ime = ime;
		this.prezime = prezime;
		this.placa = placa;
	}

	public void setPlaca(Double placa) {
		this.placa = placa;
	}

	@Override
	public String toString() {
		return "Vozac [sifra=" + sifra + ", ime=" + ime + ", prezime=" + prezime + ", placa=" + placa + "]";
	}

	public Vozac() {
		super();
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

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

	public Double getPlaca() {
		return placa;
	}
	
	

	

}
