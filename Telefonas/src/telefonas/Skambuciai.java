package telefonas;

import java.math.BigDecimal;

public class Skambuciai {

	public static void main(String[] args) {
		
		Telefonas telefonas = new Telefonas(" 8-5 66688899");
				
		telefonas.setSkambutis(" dzin dzin"); // reikejo Telefono klaseje perrasyti metoda
		
		System.out.println(telefonas.toString());// toString metodas. Daaznai naudojama.
		
		telefonas.paskambink("112");
		System.out.println(telefonas.getNumeris());
		System.out.println(telefonas.getSkambutis());
		
		Mobilus mobilus = new Mobilus("370 65423589", "564468");
		
		mobilus.setSkambutis(" mocartas aaa");
		
		System.out.println(mobilus.toString());
		
		mobilus.paskambink(" 111"); 
		
 		System.out.println(mobilus.getNuotraukuSk());
		
		mobilus.fotografuok();
		mobilus.fotografuok();
		mobilus.fotografuok();
		mobilus.fotografuok();
		
		System.out.println(mobilus.getNuotraukuSk());
		
	
	Taksofonas taksofonas = new Taksofonas(new BigDecimal(0.1));
	
	taksofonas.setSkambutis(" trrr");
	
	System.out.println(taksofonas.toString());
	
	System.out.println(taksofonas.getPiniguLikutis());
	
	taksofonas.paskambink(" 1234568");
	
	taksofonas.papildytiLikuti(new BigDecimal(5));	
	
	taksofonas.paskambink(" 654789");
	
	System.out.println(taksofonas.getPiniguLikutis());
	
//	Telefonas tlf1 = new Mobilus ("545465", "3554565685");
//	Telefonas tlf2 = new Taksofonas(new BigDecimal(3));
//	
//	tlf1.
	}

}
