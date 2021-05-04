package biblioteka;

public class Knyga {
	private Autorius autorius;
	private int isleidimoMetai;
	private String pavadinimas;
	
	
	public Knyga(String name, Autorius aut, int isleista) {
		this.pavadinimas = name;
		this.autorius = aut;
		this.isleidimoMetai = isleista;
		
	}
	
	public String getKnygosInfo() {
		return "Knyga" + this.pavadinimas + " isleista " + 
	this.isleidimoMetai + " metais." + this.autorius.getAutoriusInfo();
	}
	
	
}



