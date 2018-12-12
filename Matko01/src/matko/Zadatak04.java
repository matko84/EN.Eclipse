package matko;

import javax.swing.JOptionPane;

public class Zadatak04 {

	public static void main(String[] args) {


		//Napišite program za provjeru parnosti broja
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("Molim unesi broj"));

		//  1. način
		
//		int j;
//		j=i%2;
//		
//		if (j==1) {
//			System.out.println("Broj je neparan");
//		}else {
//			System.out.println("broj je paran");
//		}

		
		// 2. način
		
		System.out.println(i%2==1 ? "Broj je neparan" : "Broj je paran");
		
	}

}
