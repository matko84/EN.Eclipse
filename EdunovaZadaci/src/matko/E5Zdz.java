package matko;

import javax.swing.JOptionPane;

public class E5Zdz {

	public static void main(String[] args) {
		
		int m=Integer.parseInt(JOptionPane.showInputDialog("Zadaj broj redaka"));
		int n=Integer.parseInt(JOptionPane.showInputDialog("Zadaj broj stupaca"));
		
		
		int TABLICA [] [] = new int [m] [n];
		
		int maxRED = m-1;
		int minRED = 0;
		
		int maxSTUP = n-1;
		int minSTUP = 0;
		
		int BROJ=1;
		
		while (BROJ <= (m*n)) {
			
			
			for (int j=maxSTUP; j>=minSTUP; j--) {
				TABLICA[maxRED][j]=BROJ++;
			}
			
//		if(BROJ>(m*n)) {
//				break;
//			}
			
			for (int i=maxRED-1; i>=minRED; i--) {
				TABLICA[i][minSTUP]=BROJ++;
			}
			
//			if(BROJ>(m*n)) {
//				break;
//			}
			
			for (int j=minSTUP+1; j<=maxSTUP; j++) {
				TABLICA[minRED][j]=BROJ++;
			}
			
//			if(BROJ>(m*n)) {
//				break;
//			}
			
			for (int i=minRED+1; i<maxRED; i++) {
				TABLICA[i][maxSTUP]=BROJ++;
			}
			
//			if(BROJ>(m*n)) {
//				break;
//			}
			
			maxRED--;
			minRED++;
			maxSTUP--;
			minSTUP++;
		}
		
		
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(TABLICA[i][j] + "   ");
			}
			
			System.out.println();
		}
		
		
		
//		for(int i=0;i<m;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(tablica[i][j]+ "	");
//				
//			}
//		System.out.println();
//		
//		}
		
			
//		int[][] tablica= new int [m][n];
//		
//		int minStup = 0;
//		int maxStup = n-1;
//		int minRed = 0;
//		int maxRed = m-1;
//	    int broj=1;    
//		
//	    while(broj<=(m*n)){
//			for (int i = maxStup; i >= minStup; i--){
//				tablica[maxRed][i] = broj++;
//				}
//			if(broj>(m*n)) {
//				break;
//			}
//			for (int i = maxRed-1; i >= minRed; i--) {
//				tablica[i][minStup] = broj++;
//				}
//			if(broj>(m*n)) {
//				break;
//			}
//			for (int i = minStup+1; i <= maxStup; i++){
//				tablica[minRed][i] = broj++;
//				}
//			if(broj>(m*n)) {
//				break;
//			}
//			for (int i = minRed+1; i <= maxRed-1; i++){
//				tablica[i][maxStup] = broj++;
//				}
//			if(broj>(m*n)) {
//				break;
//			}
//			
//			minStup++;
//			minRed++;
//			maxStup--;
//			maxRed--;
//		        }
//		
//		for(int i=0;i<m;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(tablica[i][j]+ "	");
//				
//			}
//		System.out.println();
//		}
//		
	}
}
			
