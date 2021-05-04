package figura;

import java.util.Scanner;

public class IvestisIsvestis {
	private int pasirinktaFigura;
	private	float krastine1;
	private	float krastine2;
	
	public int getPasirinktaFigura() {
		return pasirinktaFigura;
	}
	public float getKrastine1() {
		return krastine1;
	}
	public float getKrastine2() {
		return krastine2;
	}
	
	public void suzinokFigura() {
		
		Scanner myScanner = new Scanner (System.in);
		System.out.println(" Jei norite skaiciuoti kvadrato plota iveskite 1 ");
		System.out.println(" Jei norite skaiciuoti trikampio plota iveskite 2 ");
		System.out.println(" Jei norite skaiciuoti skritulio plota iveskite 3 ");
		this.pasirinktaFigura = myScanner.nextInt();
		
		
	}
	public void suzinokKrastines( ) {						//neuzbaigtas metodas
		Scanner myScanner = new Scanner (System.in);
		
		if (pasirinktaFigura == 1) {
			System.out.println(" Iveskite krastines ilgi ");
			krastine1 = myScanner.nextFloat();}
		
		else if (pasirinktaFigura == 2) {
			System.out.println(" Iveskite pirmo statinio ilgi ");
			krastine1 = myScanner.nextFloat();
			System.out.println(" Iveskite antro statinio ilgi ");
			krastine2 = myScanner.nextFloat();	
			
}
		else if (pasirinktaFigura == 3) {
			System.out.println(" Iveskite spindulio ilgi ");
			krastine1 = myScanner.nextFloat();}
		
			else {
			System.out.println(" Tokio veiksmo atlikti nemoku ");
		}
		
	}
	public void spausdinkPlota(String str){
		System.out.println(str);
	}
	
}
