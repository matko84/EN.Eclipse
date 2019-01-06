package matko;

import javax.swing.JOptionPane;

public class E4Z13 {

	public static void main(String[] args) {
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("Jedan broj"));
		
		System.out.println(i%2==0 ? i*10 : i +", "+ i+", "+i+", "+i+", "+i );

	}

}
