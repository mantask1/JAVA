package biblioteka;

public class Autorius {
	private String vardasPavarde;
	private int gimimoMetai;
	
	public Autorius (String vardas, String pavarde, int gim) {
		this.vardasPavarde = vardas + " " + pavarde;
		this.gimimoMetai = gim;
	}
	public String getVardasPavarde() {
		return vardasPavarde;
	}

	public int getGimimoMetai() {
		return gimimoMetai;
	}
	public String getAutoriusInfo(){
		return "Knygos autorius "
				+ this.vardasPavarde + ", gim." + this.gimimoMetai 
				+ " metais.";
	
}

}