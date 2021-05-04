package mokykla;

import java.util.ArrayList;
import java.util.List;

public class Mokykla {

	private static String pavadinimas = "VCS";
	
	public static String getPavadinimas() {return pavadinimas;
	}
	private List<Mokinys> mokiniai = new ArrayList<Mokinys>();
	
	public void skaiciuokVisusVidurkius() {
		
		for (Mokinys mok : this.mokiniai) {
			mok.skaiciuokVidurki(mok.getPazymiai());
		}
	}


	public void spausdinkMokiniuinfo() {
		for(Mokinys mk : this.mokiniai) {
			System.out.println("Mokyklos " + Mokykla.pavadinimas 
					+ " mokinys " 
		+ mk.getVardasPavarde() + 
					" turi vidurki " + mk.getVidurkis());
		
		}
	}

	public List<Mokinys> getMokiniai() {
		return mokiniai;
	}}