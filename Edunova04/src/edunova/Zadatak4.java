package edunova;

import javax.swing.JOptionPane;

public class Zadatak4 {
	
	// Za dva unesena broja ispiši njihovu razliku u apsolutnoj vrijednosti

	public static void main(String[] args) {
		int i = Integer.parseInt(JOptionPane.showInputDialog("1"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("1"));
		
		System.out.println(i-j<0 ? (i-j)*(-1) : i-j);
	}
	
		
		
	}

