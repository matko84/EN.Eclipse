package matko;

import javax.swing.JOptionPane;

public class E4Z8 {

	public static void main(String[] args) {


		int a=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvu stranicu kvadrata "));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugu stranicu kvadrata "));
		
		System.out.println("Površina kvadrata je " + a*b + ", a opseg iznosi " + (2*a+2*b));

	}

}
