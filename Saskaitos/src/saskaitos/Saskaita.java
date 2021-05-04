package saskaitos;

import java.math.BigDecimal;

public class Saskaita {
		private Bankas bankas;
		private BigDecimal likutis;
		private String saskaitosNr;
		
		
		public Saskaita (Bankas bank, String nr) {			//konstruktorius visada yra public
			this.bankas = bank;
			this.saskaitosNr = nr;
			this.likutis = BigDecimal.ZERO;
			
		}


		public Bankas getBankas() {
			return bankas;
		}


		public BigDecimal getLikutis() {
			return likutis;
		}


		public String getSaskaitosNr() {
			return saskaitosNr;
		}
		
		@Override
		public String toString() {
		return "Saskaita"
				+ this.saskaitosNr + " yra banke " + this.bankas.toString() +
				" saskaitos likutis yra " + this.likutis.toString();	
			}
		protected void papildyk(BigDecimal suma) {
			this.likutis = this.likutis.add(suma);	//prideti		
			System.out.println("Saskaita papildyta");
		}
		protected void nuskaiciuok(BigDecimal suma) {
			
			this.likutis = this.likutis.subtract(suma);// atimti
		System.out.println("Pinigai nuskaiciuoti");
		}
		
}
