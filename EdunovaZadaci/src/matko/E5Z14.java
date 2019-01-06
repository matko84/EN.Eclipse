package matko;

import javax.swing.JOptionPane;

public class E5Z14 {

	public static void main(String[] args) {
		
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		
		int zbroj=0;
		
		for (int x=2;x<=i;x++) {
			if (i%x==0) {
				zbroj=zbroj+x;
			}
		}
			System.out.println(zbroj==i ? "PRIM BROJ !!!!" : "Broj nije prim");
		
		
	}

}

