 package mokykla;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Mokinys {
	
	private String vardasPavarde;
	private int[] pazymiai = new int[3];
	private float vidurkis;
	
	public Mokinys (String vardas, String pavarde) {
		this.vardasPavarde = vardas + " " + pavarde;//uzsetinom reiksme. SEt
		
	}
	

	public int[] getPazymiai() {
		return pazymiai;
	}

	public String getVardasPavarde() {
		return this.vardasPavarde;
		
	}
	
	public float getVidurkis() {
		return this.vidurkis;
	}
	
	public void setPazymiai(int pazJava, int pazC, int pazWeb) {
		this.pazymiai[0] = pazJava;
		this.pazymiai[1] = pazC;
		this.pazymiai[2] = pazWeb;
	}
public void skaiciuokVidurki(int[] mokinioPazymiai) {
	
	float suma = 0;
	
	for(int i = 0; i < mokinioPazymiai.length;
 i++) { suma += mokinioPazymiai[i];
	}
	float vid = suma / mokinioPazymiai.length;
		BigDecimal vidurk = new BigDecimal(vid);
		vidurk = vidurk.setScale(2, RoundingMode.UP);
		
		this.vidurkis = vidurk.floatValue();//kastinimas
		
	}


	
}
