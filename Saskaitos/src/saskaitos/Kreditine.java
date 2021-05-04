package saskaitos;

import java.math.BigDecimal;

public class Kreditine extends Saskaita {

	public Kreditine(Bankas bank, String nr) {
		super(bank, nr);
	}
	@Override
	protected void papildyk(BigDecimal suma) {
		if (this.getLikutis().compareTo(BigDecimal.ZERO) < 0) {
			super.papildyk(suma);
			System.out.println("Kreditine " + this.toString());
			System.out.println("Papildyta" + suma);
	}
		else {
			System.out.println("Kreditine " + this.toString());
			System.out.println("Saskaitos likutis yra teigiamas.Veiksmas negalimas");
		}

	
}}