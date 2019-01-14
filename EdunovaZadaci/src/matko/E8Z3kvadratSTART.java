package matko;

import javax.swing.JOptionPane;

public class E8Z3kvadratSTART {

	public static void main(String[] args) {
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("prvi broj"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("drugi broj"));
		
		E8Z3kvadrat LIK = new E8Z3kvadrat(a,b);
		
		System.out.println(LIK.getOpseg());
		
		

	}

}
