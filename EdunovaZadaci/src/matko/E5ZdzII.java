package matko;

import javax.swing.JOptionPane;

public class E5ZdzII {

	public static void main(String[] args) {
		
// 		CIKLIČNA TABLICA
//		POČETAK NA [1][1] SUPROTNO OD SMJERA KAZALJKE
		
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
		int j=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));

		int tablica [][]=new int [i][j];
		
		int ZR = i-1;
		int PR = 0;
		int ZS = j-1;
		int PS = 0;
		
		int X = 1;
		
		while (X<=(i*j)) {
			
			for (int a=PR; a<=ZR; a++) {
				tablica[a][PS]=X++;
			}
			
			for (int a=PS+1; a<=ZS; a++) {
				tablica[ZR][a]=X++;
			}
			
			for (int a=ZR-1; a>=PR; a--) {
				tablica[a][ZS]=X++;
			}
			
			for (int a=ZS-1; a>=PS+1; a--) {
				tablica[PR][a]=X++;
			}
			
			
			ZR--;
			PR++;
			ZS--;
			PS++;
		}
		
		for (int k=0; k<i; k++) {
			for (int l=0; l<j; l++) {
				System.out.print(tablica[k][l] + "   ");
			}
		System.out.println();
		}
		
	}

}