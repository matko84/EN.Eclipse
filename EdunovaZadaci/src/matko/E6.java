package matko;

import javax.swing.JOptionPane;

public class E6 {

	public static void main(String[] args) {
		
		
		
		ISPIS(ZBROJ(UNOS(BROJunosa())));
		
		
		}
	
		
	// zatraži koliko brojeva želiš upisati
	
			static int BROJunosa () {
				int i=Integer.parseInt(JOptionPane.showInputDialog("Koliko unosa želiš"));
				return i;
			}
	
			// zbog reda sa naredbom "return" rezultat ove metode je i, bez obzira ispisala se ili ne
	
	// zatraži unos željenog broja brojeva
	
	
			static int [] UNOS (int a) {
		
				int ukupno [] = new int [a];
				for (int i=0; i<a ;i++) {
					ukupno [i]=Integer.parseInt(JOptionPane.showInputDialog("unesi " + (i+1) + ". broj"));
				}
				return ukupno;
		
			}
	
	
	// zbroji unesi unešene brojeve
	
	
			static int ZBROJ (int zbroj []) {
				int sum = 0;
				for (int i=0; i<zbroj.length;i++) {
					sum=sum+zbroj[i];
				}
				return sum;
		
			}
	
	
	// ispiši rezultat
	
	
			static void ISPIS (int x) {
				System.out.println(x);
			}
	
	
}
