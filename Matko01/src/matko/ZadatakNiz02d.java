package matko;

import java.util.Arrays;

public class ZadatakNiz02d {

	public static void main(String[] args) {
		
		//Program prima 4 broja putem argumenata main metode
		//ispisuje zadnji broj

		//brojevi su upisani u argumente u program
		
		//ispisuje cijeli niz		
		//System.out.println(Arrays.toString(args));
		
		//poredak brojeva u nizi i ispis ???
		Arrays.sort(args);
		System.out.println(Arrays.toString(args));
		
		//ispisuje broj na zadanom indexu
		int b = Integer.parseInt(args[2]);
		System.out.println(b);
	}

}
