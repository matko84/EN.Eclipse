package matko;

import javax.swing.JOptionPane;

public class E5Z9 {

	public static void main(String[] args) {
		
		int prvi=Integer.parseInt(JOptionPane.showInputDialog("Unesi početni broj:"));
		int zadnji=Integer.parseInt(JOptionPane.showInputDialog("Unesi zadnji broj:"));
		
		int j=0;
		
		for (int i=prvi; i<=zadnji; i++) {
				j=j+i;
				}
		
		System.out.println(j);
	
	}
		
	}
	





