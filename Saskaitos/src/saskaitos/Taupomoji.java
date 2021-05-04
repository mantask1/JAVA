package saskaitos;

import java.math.BigDecimal;

public class Taupomoji extends Saskaita {

	public Taupomoji(Bankas bank, String nr) {
		super(bank, nr);
		
	}

private boolean papildyta;


	@Override
	protected void papildyk(BigDecimal suma) {
		if (!papildyta)
	{
			super.papildyk(suma);
			papildyta = true;
			System.out.println(this.toString());
			System.out.println("Taupomoji, " + " operacija sekmingai ivykdyta " + suma);
}
		else{
			System.out.println(this.toString());
			System.out.println("Taupomoji, saskaita galima papildyti tik viena karta ");
		}
		}
	
	@Override
	protected void nuskaiciuok(BigDecimal suma) {
			
				System.out.println(this.toString());
				System.out.println("Taupomoji, saskaita galima papildyti tik viena karta"
				+ suma);	
			}
			
		}
