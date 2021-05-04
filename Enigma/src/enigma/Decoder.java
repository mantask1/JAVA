package enigma;

public class Decoder {
	private String plainText; 
	private String cypher;
	
	public Decoder(String message) {
		this.cypher = message;
	}
	
	public void atkoduok() {
		String tekstas = "";
		for (int i = 2; i < cypher.length() - 2; i += 2) {
			tekstas += cypher.charAt(i);
//			substring butu galima naudoti
	}														
		this.plainText = tekstas;
		
}

	public String getPlainText() {
		return plainText;
	}
	
}