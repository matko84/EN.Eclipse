package edunova;

import javax.swing.JOptionPane;

public class Zadatak10 {

	//Napiši program koji pročita jedan broj. 
	//Nakon toga ako je broj veći od 10 program 
	//izračuna površinu kruga i ispiše rezultat. 
	//U suprotno program izračuna opseg kruga i ispiše ga. 
	//U oba slučaja radijus je jednak upisanom broju.

	public static void main(String[] args) {
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Jedan broj"));
		
		System.out.println(a>10 ? "površina kruga je:" + a*a*Math.PI : "opseg kruga je" + 2*a*Math.PI);
		
		
	}
	
}
