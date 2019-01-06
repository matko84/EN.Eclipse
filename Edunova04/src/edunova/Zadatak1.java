package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Zadatak1 {
	
	//Program učitava 4 cijela broja i ispisuje ih od najmanjeg prema najvećem
	
	public static void main(String[] args) {
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("1. broj:"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("2. broj:"));
		int c=Integer.parseInt(JOptionPane.showInputDialog("3. broj:"));
		int d=Integer.parseInt(JOptionPane.showInputDialog("4. broj:"));
		
		int niz [] = {a,b,c,d};
		
		Arrays.sort(niz);
		
		System.out.println(Arrays.toString(niz));
		
	}

}
