package matko;

import javax.swing.JOptionPane;

public class E10z1pomocno {

	private String ime;

	public static int imenovanje() {
		int imea = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		JOptionPane.showMessageDialog(null, "Upisali ste broj " + imea);
		return imea;
	}

	public E10z1pomocno() {
		super();
	}

	public E10z1pomocno(String ime) {
		super();
		this.ime = ime;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

}
