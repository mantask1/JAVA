package enigma;

import java.util.Scanner;

public class InputOutputManager {
		private int action;
		private String inputMessage;
		
		public void pasirinkVeiksma() {
			Scanner myScanner = new Scanner (System.in);// in yra statinis kintamasasis
			
			System.out.println("Jei nori uzkoduoti spausk 1");
			System.out.println("Jei nori atkoduoti spausk 2");
			this.action = myScanner.nextInt();
		}
		
		public void issaugokSms() {
		Scanner myScanner = new Scanner (System.in);// in yra statinis kintamasasis
		System.out.println("Iveskite slapta zinute");
		this.inputMessage = myScanner.nextLine();
	}
		public int getAction() {
			return action;
		}
		public String getInputMessage() {
			return inputMessage;
		}
		public void spausdinkSms (String zinute) {
			System.out.println("Jusu slapta zinute " + zinute);
		
		}
		
}



