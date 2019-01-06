package matko;

import java.util.Random;

import javax.swing.JOptionPane;

public class E4Z14 {

	public static void main(String[] args) {


		int i=Integer.parseInt(JOptionPane.showInputDialog("Broj"));
		
		boolean j=i<10;
		
		System.out.println(j==true ? "Osijek" : Math.random()*49+1);
		

	}

}
