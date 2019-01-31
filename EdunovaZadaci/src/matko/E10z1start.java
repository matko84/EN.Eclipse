package matko;

import javax.swing.JOptionPane;

public class E10z1start {

	public static void main(String[] args) {

		while (true) {

			try {
				E10z1pomocno.imenovanje();
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "nije broj");

			}

		}

	}

}
