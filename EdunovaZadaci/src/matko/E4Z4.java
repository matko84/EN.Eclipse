package matko;

import javax.swing.JOptionPane;

public class E4Z4 {

	public static void main(String[] args) {

		int i=Integer.parseInt(JOptionPane.showInputDialog("1. broj"));
		int j=Integer.parseInt(JOptionPane.showInputDialog("2. broj"));
		
		System.out.println(i>j ? i-j : (i-j)*(-1));

	}

}
