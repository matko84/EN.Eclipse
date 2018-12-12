package matko;

import java.util.Scanner;

public class ZadatakUvjetnoGrananje {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesi cijeli broj");
		int i=unos.nextInt();
//		System.out.println("Upisao si broj " + i);
	
//ako je broj veći od 10 ispiši OK	
// 1	
//		if (i>10) {
//			System.out.println("OK");
//		}

//2
//		if (i>10) {
//			System.out.println("OK");}
//		else {
//			System.out.println("Nije OK");
//		}
		
//		if (i>10) {
//			System.out.println("Broj je veći od 10");}
//		else if (i<10 ){ 
//			System.out.println("Broj je manji od 10");}
//		else {
//			System.out.println("Upisani broj iznosi 10");
//			
//		}
		
		if( provjeriStanje () && logiram()) {
			System.out.println("OK");
		}
		
		unos.close();
		
	}

	private static boolean logiram() {
		System.out.println("Logiram");
		return false;
	}

	private static boolean provjeriStanje() {
		System.out.println("provjeriStanje");
		return false;
	}

}
