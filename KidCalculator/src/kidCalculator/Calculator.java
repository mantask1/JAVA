package kidCalculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Ivestis iv = new Ivestis();
		
		int pirmasSk = iv.iveskSkaiciu();
		int antrasSk = iv.iveskSkaiciu();
		int treciasSk = iv.iveskSkaiciu();
		
		
		Skaiciuokle skaiciuokle = new Skaiciuokle();

		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Jeigu norite sudeti spauskite 1");
		System.out.println("Jeigu norite atimti spauskite 2");
		System.out.println("Jeigu norite rasti didziausia skaiciu spauskite 3");
		
		int pasirinkimas = scnr.nextInt();
		
		if(pasirinkimas == 1) {
			skaiciuokle.sudek(pirmasSk, antrasSk);
		}
		else if(pasirinkimas == 2) {
		
		skaiciuokle.atimk(pirmasSk, antrasSk);
		}
		else if(pasirinkimas == 3) {
		skaiciuokle.raskDidz(pirmasSk, antrasSk, treciasSk);
		}
		else {
			System.out.println("Tokio veiksmo atlikti nemoku");
		}
		
		
	}

}


