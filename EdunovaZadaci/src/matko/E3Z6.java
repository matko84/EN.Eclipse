package matko;

import javax.swing.JOptionPane;

public class E3Z6 {

	public static void main(String[] args) {

		int i=Integer.parseInt(JOptionPane.showInputDialog("Unesi 1. broj: "));
		int j=Integer.parseInt(JOptionPane.showInputDialog("Unesi 2. broj: "));
		
		System.out.println(i>j ? i : j);
		
	}

}
