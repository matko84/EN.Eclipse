package matko;

import javax.swing.JOptionPane;

public class E4Z10 {

	public static void main(String[] args) {
		
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("Unesi jedan broj"));
		
		System.out.println(i>10 ? ("Površina iznosi" + i*i*Math.PI) : ("Opseg iznosi" + 2*i*Math.PI));

	}

}
