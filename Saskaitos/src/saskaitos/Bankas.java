package saskaitos;

public class Bankas {
	private String pavadinimas;
	private String adresas;
	
	
	public Bankas (String pav, String adr){
			this.pavadinimas = pav;
			this.adresas = adr;
			
			
	}


	public String getPavadinimas() {
		return pavadinimas;
	}


	public String getAdresas() {
		return adresas;
	}
@Override//nes toString metodas priklauso Object klasei
	public String toString() {
	return "Bankas "
+ this.pavadinimas + "adresu " + this.adresas;	
		}
}
