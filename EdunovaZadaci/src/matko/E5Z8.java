package matko;

import javax.swing.JOptionPane;

public class E5Z8 {

	public static void main(String[] args) {
		
		int prvi=Integer.parseInt(JOptionPane.showInputDialog("Unesi početni broj:"));
		int zadnji=Integer.parseInt(JOptionPane.showInputDialog("Unesi zadnji broj:"));
		
		
//		LOŠE ZATO ŠTO I ZA NEPARNE ZAUZIMA LINIJU
//		
//		for (int i=prvi; i<=zadnji; i++) {
//			System.out.println(i%2==0 ? i : "");
//		}

		
		for (int i=prvi; i<=zadnji; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		
	}

}
