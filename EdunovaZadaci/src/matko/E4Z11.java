package matko;

import javax.swing.JOptionPane;

public class E4Z11 {

	public static void main(String[] args) {

		int i=Integer.parseInt(JOptionPane.showInputDialog("Prvi broj"));
		int j=Integer.parseInt(JOptionPane.showInputDialog("Drugi broj"));
		int k=Integer.parseInt(JOptionPane.showInputDialog("Treći broj"));
		int l=Integer.parseInt(JOptionPane.showInputDialog("Četvrti broj"));
		
		int zbrojParnih = 0;
		
		if (i%2==0) {
			zbrojParnih=zbrojParnih + i;
		} else {
			zbrojParnih=zbrojParnih;
		}

		if (j%2==0) {
			zbrojParnih=zbrojParnih + j;
		} else {
			zbrojParnih=zbrojParnih;
		}
		
		if (k%2==0) {
			zbrojParnih=zbrojParnih + k;
		} else {
			zbrojParnih=zbrojParnih;
		}
		
		if (l%2==0) {
			zbrojParnih=zbrojParnih + l;
		} else {
			zbrojParnih=zbrojParnih;
		}
		
		
		System.out.println(zbrojParnih);
		
	}

}
