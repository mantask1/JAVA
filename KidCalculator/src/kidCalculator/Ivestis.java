package kidCalculator;

import java.util.Scanner;

public class Ivestis {

public int iveskSkaiciu() {
		
		Scanner myScanner = new Scanner(System.in);
		
		int ivestasSkaicius;
		boolean skaiciusTeisingas = true;
		
		do {
			System.out.println("Iveskite skaiciu nuo 1 iki 9");
			ivestasSkaicius = myScanner.nextInt();
			skaiciusTeisingas = tikrinkSkaiciu(ivestasSkaicius); 
		}
		while(!skaiciusTeisingas);
		
		System.out.println("Ivestas skaicius" + ivestasSkaicius);
		
		return ivestasSkaicius;
	}


	private boolean tikrinkSkaiciu (int x) {
		return (x > 0 && x <10 );		
	}

}
