package bankomatas;

import java.util.Scanner;

public class Naudotojas {
	private final String teisingasKodas = "testas";
	
	public int tikrinkPin() {
		
		Scanner myScanner = new Scanner(System.in);
		int bandymuSkaicius = 0;
		String pin = "";
		
		while (bandymuSkaicius < 3) {
			System.out.println(" Iveskite PIN");
			pin = myScanner.nextLine();
			
			if (this.teisingasKodas.equals(pin)) {
				System.out.println("PIN teisingas");
				break;
				
			}else {
				bandymuSkaicius++;
				System.out.println("PIN netesingas. Bandykite dar karta.");
			}
		}
		return bandymuSkaicius;
	}
}
