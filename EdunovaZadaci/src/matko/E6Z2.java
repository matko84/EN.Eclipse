package matko;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class E6Z2 {

	public static void main(String[] args) {
		
		ISPIS(ZBROJ(UNOS()));

	}

	static int [] UNOS () {
		
		int NIZ[] = new int [5];
		
		for (int i=0; i<5; i++) {
			NIZ[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1) + ".broj"));
		}
		return NIZ;
	}
	
	static int ZBROJ (int [] brojevi) {
		
		int SUM=0;
		
		for (int i=0; i<brojevi.length; i++) {
		SUM=SUM+brojevi[i];	
		}
		return SUM;
	}
	
	static void ISPIS (int a) {
		System.out.println(a);
	}
	
}
