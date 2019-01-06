package matko;

import javax.swing.JOptionPane;

public class Zadatak05 {

	public static void main(String[] args) {
		
		// za primljena dva broja ispiši veći

		
		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi 1. broj"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("Unesi 2. broj"));
		
		if(i>j) {
			System.out.println(i);
		}else if (j>i) {
			System.out.println(j);
		}else {
			System.out.println("Isti su");
		}
	}
 
}
