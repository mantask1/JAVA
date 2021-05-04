package saskaitos;

import java.math.BigDecimal;

public class Bankininkyste {

	public static void main(String[] args) {

			Bankas bnk1 = new Bankas (" Caise ", " Ryto gatve 5");
			Debetine db1 = new Debetine (bnk1, 	  " LT456568445");
			Kreditine kr1 = new Kreditine (bnk1,  " LT123456789");
			Taupomoji taup1 = new Taupomoji (bnk1," LT255556555");		
			Saskaita saskaita = new Saskaita(bnk1," LT454646545");
//			
//			db1.papildyk(BigDecimal.TEN);	
//			db1.nuskaiciuok(new BigDecimal(5));
//			db1.nuskaiciuok(new BigDecimal(3));
//			db1.nuskaiciuok(new BigDecimal(20));
//			
//			kr1.nuskaiciuok(new BigDecimal(100));
//			kr1.papildyk(BigDecimal.TEN);

//			taup1.nuskaiciuok(new BigDecimal(10));
//			taup1.papildyk(new BigDecimal(10));
//			taup1.papildyk(new BigDecimal(10));
			
			saskaita.papildyk(new BigDecimal(10));
			saskaita.nuskaiciuok(new BigDecimal(10000));
	}
}
