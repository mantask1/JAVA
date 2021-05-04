package figura;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Skritulys extends Figura {

	public Skritulys(float sk1) {
		super(sk1, sk1);
	}
	
	@Override
	public void skaiciuokPlota() {
	super.skaiciuokPlota();
	
	double skrPlotas=this.getPlotas()*Math.PI;
	BigDecimal SkrPlotas = new BigDecimal(skrPlotas).setScale(2, RoundingMode.UP);
	float skritulioPlotas = SkrPlotas.floatValue();
	
	this.setPlotas(skritulioPlotas);
}
}
