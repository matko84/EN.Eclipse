package matko;

import javax.swing.JOptionPane;

public class E3Z7 {

	public static void main(String[] args) {
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("Prvi broj ?"));
		int j=Integer.parseInt(JOptionPane.showInputDialog("Drugi broj ?"));
		int k=Integer.parseInt(JOptionPane.showInputDialog("Treći broj ?"));
		
		if (j>=i & i<=k) {
			System.out.println(i);
		} else if 
			(i>=j & j<=k) {
				System.out.println(j);
			} else if 
			(i>=k & k<=j) {
				System.out.println(k);
			}
		}	   
		

	}


