package imone;

import java.util.Calendar;

public class Darbuotojas {
	private String vardasPavarde;
	private String asmenskodas;
	private byte amzius;
	private byte darboStazas;
	private String pozicija;		

	public Darbuotojas (String vardas, String pavarde, String id) {
		this.vardasPavarde = vardas + " " + pavarde;//uzsetinom reiksme. SEt
		this.asmenskodas = id;
		paskaiciuokAmziu();
	}
	
	public String getVardasPavarde() {
		return this.vardasPavarde;
	}
	
	
	public String getAsmenskodas() {
		return asmenskodas;
	}

	public int getAmzius() {
		return amzius;
	}
	
	public int getDarboStazas() {
		return darboStazas;
	}

	public String getPozicija() {
		return pozicija;
	}
	
	private void paskaiciuokAmziu() {
		Calendar calendar = Calendar.getInstance();
		int einamiMetai = calendar.get(Calendar.YEAR);
		int gimimoMetai = Integer.parseInt(this.asmenskodas.substring(1, 3));
		char pirmasSimbolis = this.asmenskodas.charAt(0);
		
		if (pirmasSimbolis == '3' || pirmasSimbolis == '4'){
				gimimoMetai += 1900;
	}
	else {
		gimimoMetai += 2003;
	}
	
	this.amzius = (byte) (einamiMetai - gimimoMetai);
	
	}

	public void setDarboStazas(byte darboStazas) {
		this.darboStazas = darboStazas;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}
		
	
	
	
}
