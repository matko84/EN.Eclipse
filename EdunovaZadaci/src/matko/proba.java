package matko;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class proba {

	public static void main(String[] args) {
		int x=1;
		int y=10;

		int b=0;
		int niz []=new int [b];
		
				
	while (x<y) {
			
			int sum=0;

			
			for ( int i=2; i<=x; i++ ) {
				if (x%i==0) {
					sum=sum+i;
					}
			}
				
			if (sum==x) {
					System.out.println(x);
				} 
			x++;
			
		}
		
	
		
		

	}

}
