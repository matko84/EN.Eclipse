package edunova;

import javax.swing.JOptionPane;

public class Zadatak3 {
	
	//Program prima broj i ispisuje taj broj uvećan za 10

	public static void main(String[] args) {
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Broj"));
		System.out.println(a+10);
		
	}
}
