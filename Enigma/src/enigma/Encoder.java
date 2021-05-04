package enigma;

import java.util.Random;

class Encoder {					//sukurta klase
	private String plainText; 	//sukurta du kintamieji
	private String cypher;

	public Encoder (String message) {
		this.plainText = message;
	}								//modifikavom konstruktoriu.duodame zinute.ir uzsetinome(priskirti) reiksme- plainText.
	
	private char generuok() {
		Random rndm = new Random();
		char simbolis = (char) rndm.nextInt(128);//char yra simbolis turinti atitinkama int koda.
		return simbolis;// grazinam 
	}
	public String getCypher() {
		return cypher;}	
//								//shift+alt+s               j 
	public void uzkoduok() {
		String sifras = "" + generuok() + generuok();//concat yra naudojamas Stringui
		for (int i = 0; i < plainText.length(); i ++) {
			sifras += plainText.charAt(i);
			sifras += generuok();
			
		}
		
	sifras += generuok();
	this.cypher = sifras;//uzsetinom-priskiriam reiksme
		
	}
	
	
	
	
	
	
}

