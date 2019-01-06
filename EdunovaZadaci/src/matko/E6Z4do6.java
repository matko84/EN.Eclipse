package matko;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

import org.omg.Messaging.SyncScopeHelper;

public class E6Z4do6 {




	public static void main(String[] args) {

		
			
		ZBROJ(odNajveceg(PROVJERA(INTERVAL(GRANICE()))));
	
				
	}
	
	
// UNOSA BROJA	
	static int BROJ (String poruka) {
		int i=Integer.parseInt(JOptionPane.showInputDialog(poruka));
		return i;
	}
	
// UNOS DVA BROJA KOJI SU GRANICE INTERVALA	
	static int [] GRANICE () {
		
		int niz [] = new int [2];
		niz[0]=BROJ("unesi prvi broj");
		niz[1]=BROJ("unesi drugi broj");
		System.out.println("zadali ste provjeru intervala od broja " + niz[0] + " do broja " + niz[1]);
		return niz;
	}
	
// DEFINIRANJE INTERVALA	
	static int [] INTERVAL (int [] brojevi) {
		
		int [] niz = new int [brojevi[1]-brojevi[0]+1];
		int a=0;
		for (int i=brojevi[0]; i<=brojevi[1]; i++) {
				
			niz[a]=i;
			a++;
			
				}
		Arrays.sort(niz);
		System.out.println("Svi brojevi intervala :" + Arrays.toString(niz));
			return niz;
		}
		
	
	static ArrayList<Integer> PROVJERA (int [] interval) {
		
		int x=interval[0];
		int y=interval[interval.length-1];
		
		ArrayList<Integer> niz = new ArrayList <Integer>();
		
				while (x<y) {
			
				int sum=0;
				
			
				for ( int i=2; i<=x; i++ ) {
					if (x%i==0) {
						sum=sum+i;
						}
				}
				
				if (sum==x) {
					niz.add(x);
										} 
				x++;
				
				}
	
				System.out.println("Prim brojevi u intervalu su " + niz);
				return niz;
		
			}
	
	static int [] odNajveceg (ArrayList<Integer> niz) {
		
		
				
		int [] poredak = new int [niz.size()];
		
		int a=0;
		for (int i=niz.size()-1; i>=0; i--) {
			
			poredak[a]=niz.get(niz.size()-1-a);
			a++;
			
				}
	System.out.println("Prim projevi u intervalu od največeg prema najmanjem su: " + Arrays.toString(poredak));
		return poredak;
	}
	
	
	static int ZBROJ (int niz []) {
		
		int zbroj=0;
		for(int i=0; i<=niz.length-1; i++) {
			zbroj=zbroj+niz[i];
		}
		
		System.out.println("Zbroj svih prim brojeva u zadanom intervalu iznosi: " + zbroj);
		return zbroj;
		
	}
	
	
	
	
}
	

	
	

	


