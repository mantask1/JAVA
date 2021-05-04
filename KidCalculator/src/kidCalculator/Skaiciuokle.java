package kidCalculator;

public class Skaiciuokle {

	public void sudek(int a, int b) {
		int suma = a + b;
		System.out.println(a + " + " + b + " = " + suma);
	}
	
	public void atimk(int x, int y) {
		int rez = x - y;
		System.out.println(x + " - " + y + " = " + rez);		
	}
	public void raskDidz(int d, int f, int g) {
		String atsakymas = "";
		
		if (d > f && d > g) { 
			atsakymas += "Didziausias skaicius yra " + d;
		}
		else if (f > d && f > g) {
			atsakymas += "Didziausias skaicius yra" + f;
		}
		else if (g > d && g > f) {
			atsakymas += "Didziausias skaicius yra" + g;
			
		}
		else { atsakymas += "Didziausio skaiciaus nera"; }
		System.out.println(atsakymas);	
	}
} 
