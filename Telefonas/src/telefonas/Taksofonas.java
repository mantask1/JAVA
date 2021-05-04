package telefonas;

import java.math.BigDecimal;   
import java.math.RoundingMode;

public class Taksofonas extends Telefonas {

	
	private BigDecimal piniguLikutis; 								// sukureme kintamaji ir panaudojom BigDecimal tipa
	final private BigDecimal skambucioKaina = new BigDecimal(0.25); // final-negalima pakeisti
	
	public Taksofonas(BigDecimal pinigai) {						//reikejo modifikuoti konstruktoriu   
		super("213-123");
		this.piniguLikutis = pinigai;	
	}
	
	public BigDecimal getPiniguLikutis() {
		return piniguLikutis.setScale(2, RoundingMode.UP);//metodas apvalinimui
	}
	
	public void papildytiLikuti(BigDecimal papildymoSuma) {
		this.piniguLikutis = piniguLikutis.add(papildymoSuma); // pridejome
	}
	@Override// reikia modifikuoti(perraryti). tinka is superklases ir galime perrasyti
	public void paskambink(String tlfnr) {   //pradzia turi buti identiska kaip ir super klaseje
		if (this.piniguLikutis.compareTo(skambucioKaina) >= 0) { //galima rasyti ir > -1
				super.paskambink(tlfnr);
				this.piniguLikutis = piniguLikutis.subtract(skambucioKaina);// atememe
		}
		else {
			System.out.println("Skambuciui neuztenka pinigu");
		}
	}
}

