package matko;

import javax.swing.JOptionPane;

public class E3Z4 {

	public static void main(String[] args) {
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj: "));
		int j=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj: "));
		
		if (i>0 & j>0) {
			System.out.println(i+j);
		}else {
			System.out.println(i + ", " + j);
		}

	}

}
