  package telefonas;

public class Telefonas {
	private String numeris;
	private String skambutis;
	
	public Telefonas (String nr) {				//suskureme konstruktoriu
		this.numeris = nr;				 
		
	}
				
	protected String getSkambutis() {			//sukureme geteri(istraukeme reiksme) skambuciui
		return skambutis;
	}

	

	protected String getNumeris() {				//sukureme geteri(istraukeme reiksme) numeriui
		return numeris;
	}
	
	public void paskambink(String tlfnr) {			//sukureme paskmabink metoda
		System.out.println(" Abonentas" + this.numeris + " skambina abonentui" + tlfnr);
	}
	protected void setSkambutis(String skambutis) {//sub klases gali naudoti siais metodais
		this.skambutis = skambutis;					//suskureme seteri(suteikeme reiksme) skambuciui
	}
	@Override
	public String toString() {
		return "Telefono numeris yra "
+ this.numeris + " telefono melodija " + this.skambutis;	
		}
}
