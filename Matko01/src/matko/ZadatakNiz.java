package matko;

import java.util.Arrays;

public class ZadatakNiz {

	public static void main(String[] args) {

		int niz [] = {1,2,4,5,2};
		int [] nit = {5,6,8};
		
		Arrays.sort(niz);
		Arrays.sort(nit);
		
		System.out.println(Arrays.toString(niz));
		System.out.println(Arrays.toString(nit));

	}

}
