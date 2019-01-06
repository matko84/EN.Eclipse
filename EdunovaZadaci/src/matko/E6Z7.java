package matko;

import javax.swing.JOptionPane;

public class E6Z7 {

	public static void main(String[] args) {

		ZBROJ();
			
	}
	
	
	static int UNOS (String poruka) {
		
		int b=Integer.parseInt(JOptionPane.showInputDialog(poruka));
		return b;
	}
	
	static int PREKID (String poruka) {
		int b=Integer.parseInt(JOptionPane.showInputDialog(poruka));
		return b;
	}
	
	static int ZBROJ () {
		
		int sum=0;
		
		int j=PREKID("Unesi broj za prekid");
		
		while (true) {
			int i=UNOS("Unesi broj");
			if(i==j) {
				break;
			}
			sum=sum+i;
		}
		
		System.out.println(sum);
		return sum;
	}

}
