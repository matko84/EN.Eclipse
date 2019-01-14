package matko;

public class E8Z3kvadrat {

	
		int stranicaA;
		int stranicaB;
		
		
		public E8Z3kvadrat(int stranicaA, int stranicaB) {
			this.stranicaA = stranicaA;
			this.stranicaB = stranicaB;
		}


		public int getStranicaA() {
			return stranicaA;
		}


		public void setStranicaA(int stranicaA) {
			this.stranicaA = stranicaA;
		}


		public int getStranicaB() {
			return stranicaB;
		}


		public void setStranicaB(int stranicaB) {
			this.stranicaB = stranicaB;
		}
		
		public int getOpseg() {
			return 2*stranicaA+2*stranicaB;
		}
		
		
}
