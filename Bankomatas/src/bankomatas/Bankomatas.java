package bankomatas;

import java.util.Scanner;

public class Bankomatas {
		
	private int likutisATM = 500;
	
	private void baikDarba() {
		System.out.println("Darbas baigtas");
		}
	private void isgryninkPinigus( ) {
		Scanner myScanner = new Scanner(System.in);
		int ivestaPiniguKiekis = 0;
		boolean arIsgrynino = true;
		
		do {
			System.out.println("Bankomate yra " + this.likutisATM + " pinigu");
			System.out.println("Kiek norite isgryninti?");
			
			ivestaPiniguKiekis = myScanner.nextInt();
			
			if (ivestaPiniguKiekis <= 0) {
				System.out.println("Neteisingas ivestas pinigu kiekis");
				arIsgrynino = false;
				
			}else { this.likutisATM -= ivestaPiniguKiekis;
			System.out.println("Isgryninta " + ivestaPiniguKiekis + " pinigu");
			arIsgrynino = true;
			
			}
		}
		while (!arIsgrynino);
		pasirinkVeiksma();
	
	}


	private void pasirinkVeiksma() {
		
		Scanner myScanner = new Scanner(System.in);
		boolean arVeikia = true;
		int pasirinkimas = 0;
		
		if (this.likutisATM > 0) {
			do {
				System.out.println("Pasirinkite veiksma: ");
				System.out.println("1 - Pinigu isemimas");
				System.out.println("2 - Baigti darba");
				
				pasirinkimas = myScanner.nextInt();
				
				if (pasirinkimas == 1) {
					isgryninkPinigus();
					arVeikia = true;
					
				}
				else if (pasirinkimas == 2) {
					baikDarba();
					arVeikia = true;
				}
				else {
					System.out.println("Tokia operacija negalima");
					arVeikia = false;
					
				}
			}
			while (!arVeikia);
			
		}
		else {
			System.out.println("Bankomate pinigu nera");
			baikDarba();
		}
		
	}
	public void pradekDarba() {
		Naudotojas naudotojas = new Naudotojas();
		if (naudotojas.tikrinkPin() < 3) {
			pasirinkVeiksma();
			
		}
		else {
			System.out.println("Atsiprasome,bet jusu saskaita uzblokuota");
			baikDarba();
		}
	}
}
