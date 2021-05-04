package enigma;


public class MyEnigma {

	public static void main(String[] args) {
		InputOutputManager io = new InputOutputManager();
		io.pasirinkVeiksma();
		if (io.getAction() == 1 ) {
			io.issaugokSms();
			
			Encoder encoderis = new Encoder(io.getInputMessage());
			encoderis.uzkoduok();
			io.spausdinkSms(encoderis.getCypher());
		}
		else if(io.getAction()==2) {
			io.issaugokSms();
			Decoder decoderis = new Decoder(io.getInputMessage());
			decoderis.atkoduok();
			io.spausdinkSms(decoderis.getPlainText());
		}
		else {
			System.out.println("Negaliu");
			
		}
		
	}

}
