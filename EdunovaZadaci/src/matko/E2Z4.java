package matko;

import javax.swing.JOptionPane;

public class E2Z4 {

	public static void main(String[] args) {

		int i=Integer.parseInt(JOptionPane.showInputDialog("Molim unesite prvi broj: "));
		int j=Integer.parseInt(JOptionPane.showInputDialog("Molim unesite drugi broj: "));
		
		boolean k=i>j;
		boolean l=i<j;
		boolean m=i>=j;
		boolean n=i<=j;
		boolean o=i!=j;
		boolean p=i==j;
		
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(p);
		
		
	}

}
