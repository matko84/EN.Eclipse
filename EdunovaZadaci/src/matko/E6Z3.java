package matko;

import javax.swing.JOptionPane;

public class E6Z3 {

	public static void main(String[] args) {
		
				ISPIS(PRIMkontrola(BROJ()));
		
		
	}
	
	static int BROJ () {
		int i=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		return i;
	}
	
	
	static int PRIMkontrola (int a) {
		
		int SUM=0;
		
		for (int i=2; i<=a; i++) {
			if (a%i==0) {
				SUM=SUM+i;
			}
		}
		
				
		if (SUM==a) {
			return 1;
		}else {
			return 0;
		}
		
	

	}
	
	static void ISPIS (int a) {
		if (a==1) {
			System.out.println("PRIM BROJ");
		} else {
			System.out.println("Nije prim broj");
		}
	}
	
}
	


