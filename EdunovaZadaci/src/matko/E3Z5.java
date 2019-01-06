package matko;

import javax.swing.JOptionPane;

public class E3Z5 {

	public static void main(String[] args) {
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj: "));
		
//		if (i%2==0) {
//			System.out.println("Broj je paran");
//		}else {
//			System.out.println("Broj je neparan");
//		}

		
		System.out.println(i%2==0 ? "Broje je paran" : "Broj je neparan");
		
	}

}
