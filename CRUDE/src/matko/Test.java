package matko;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class Test {
	
	
	private static String randomTekst(String slova) {
	    Random rand=new Random();
	    StringBuilder res=new StringBuilder();
	    for (int i = 0; i < 5; i++) {
	       int randIndex=rand.nextInt(slova.length()); 
	       res.append(slova.charAt(randIndex));            
	    }
	    return res.toString();
	  
	}
	
	private static String petljaTekst () {
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("Broj osoba za upis"));
		for (int a=0; a<i; a++) {
			System.out.println(randomTekst("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		}
		
		
		
		return null;
	}
	
	
	
	
	public static void main(String[] args) {

		

	}

}
