package matko;

import javax.swing.JOptionPane;

public class Zadatak06 {

	public static void main(String[] args) {

		//Program učitava 4 broja.
		//u slučaju da je prvi jednak zadnjem broju ispisuje
		//zbroj drugog i trećeg broja
		//inače ispisuje sljedno brojeve od najmanjeg prema najvećem
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj:"));
		int j=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj:"));
		int k=Integer.parseInt(JOptionPane.showInputDialog("Unesi treći broj:"));
		int l=Integer.parseInt(JOptionPane.showInputDialog("Unesi četvrti broj:"));
		
		if 			(i<j && j<k && k<l) {
			System.out.println(i + ", " + j + ", " + k + ", " + l);
		}else if 	(i<j && j<l && l<k) {
			System.out.println(i + ", " + j + ", " + l + ", " + k);
		}else if 	(i<k && k<l && l<j) {
			System.out.println(i + ", " + k + ", " + l + ", " + j);
		}else if 	(i<k && k<j && j<l) {
			System.out.println(i + ", " + k + ", " + j + ", " + l);
		}else if 	(i<l && l<k && k<j) {
			System.out.println(i + ", " + l + ", " + k + ", " + j);
		}else if 	(i<l && l<j && j<k) {
			System.out.println(i + ", " + l + ", " + j + ", " + k);
		}else if 	(j<i && i<k && k<l) {
			System.out.println(j + ", " + i + ", " + k + ", " + l);
		}else if 	(j<i && i<l && l<k) {
			System.out.println(j + ", " + i + ", " + l + ", " + k);
		}else if 	(j<k && k<i && i<l) {
			System.out.println(j + ", " + k + ", " + i + ", " + l);
		}else if 	(j<k && k<l && l<i) {
			System.out.println(j + ", " + k + ", " + l + ", " + i);
		}else if 	(j<l && l<k && k<i) {
			System.out.println(j + ", " + l + ", " + k + ", " + i);
		}else if 	(j<l && l<i && i<k) {
			System.out.println(j + ", " + l + ", " + i + ", " + k);
		}else if 	(k<i && i<j && j<l) {
			System.out.println(k + ", " + i + ", " + j + ", " + l);
		}else if 	(k<i && i<l && l<j) {
			System.out.println(k + ", " + i + ", " + l + ", " + j);
		}else if 	(k<j && j<i && i<l) {
			System.out.println(k + ", " + j + ", " + i + ", " + l);
		}else if 	(k<j && j<l && l<i) {
			System.out.println(k + ", " + j + ", " + l + ", " + i);
		}else if 	(k<l && l<i && i<j) {
			System.out.println(k + ", " + l + ", " + i + ", " + j);
		}else if 	(k<l && l<j && j<i) {
			System.out.println(k + ", " + l + ", " + j + ", " + i);
		}else if 	(l<i && i<j && j<k) {
			System.out.println(l + ", " + i + ", " + j + ", " + k);
		}else if 	(l<i && i<k && k<j) {
			System.out.println(l + ", " + i + ", " + k + ", " + j);
		}else if 	(l<j && j<i && i<k) {
			System.out.println(l + ", " + j + ", " + i + ", " + k);
		}else if 	(l<j && j<k && k<i) {
			System.out.println(l + ", " + j + ", " + k + ", " + i);
		}else if 	(l<k && k<j && j<i) {
			System.out.println(l + ", " + k + ", " + j + ", " + i);
		}else {
			System.out.println(l + ", " + k + ", " + i + ", " + j);
		}
		
		
		
	}

}
