package saskaitos;

import java.math.BigDecimal;

public class Debetine extends Saskaita {

	public Debetine(Bankas bank, String nr) {
		super(bank, nr);
	}
	@Override
	protected void nuskaiciuok(BigDecimal suma) {
		if (this.getLikutis().compareTo(suma) >= 0) {
			super.nuskaiciuok(suma); 
			System.out.println("Debetine" + this.toString());
			System.out.println("Nuskaiciuota suma " + suma);	
		}
		else {
			System.out.println("Debetine" + this.toString());
			System.out.println("Neuztenka pinigu");
		}	
	}
}
