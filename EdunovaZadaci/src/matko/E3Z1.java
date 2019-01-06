package matko;

import javax.swing.JOptionPane;

public class E3Z1 {

	public static void main(String[] args) {

		int i=Integer.parseInt(JOptionPane.showInputDialog("molim prvi broj "));
		int j=Integer.parseInt(JOptionPane.showInputDialog("drugi broj "));
		
		System.out.println(i>j ? "ok" : "nije ok");

	}

}
