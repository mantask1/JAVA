package telefonas;

public class Mobilus extends Telefonas {			//mboilus(subklase) paveldi is supercklases Telefonas

	private String simNr;
	private int nuotraukuSk;
	
	public Mobilus(String nr, String sim) {				// konstruktorius
		super(nr);
		this.simNr = sim;
		this.nuotraukuSk = 0;	
	}			
		
	public void fotografuok( ) {						//sukureme metoda
		this.nuotraukuSk++;
	}

	public String getSimNr() {
		return simNr;
	}

	public int getNuotraukuSk() {
		return nuotraukuSk;
	}
		
}
