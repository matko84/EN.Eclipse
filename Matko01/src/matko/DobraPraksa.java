package matko;

import javax.swing.JOptionPane;

public class DobraPraksa {

	public static void main(String[] args) {
		
		//ispisši OK ako i nije jednako 3

		int i=Integer.parseInt(JOptionPane.showInputDialog("Molim jedan broj: "));
		
		if (i==3) {
			return;
		}
		
		System.out.println("Broje je različit od 3");
		
		
		
	}

}
