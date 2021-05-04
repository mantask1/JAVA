package imone;

import java.util.ArrayList;
import java.util.*;

public class Imone {
	private String pavadinimas;
	private int ikurimoMetai;
	private List<Darbuotojas> darbuotojai;
	
	public Imone(String pavad, int ikurimas) {
        this.pavadinimas = pavad;
        this.ikurimoMetai = ikurimas;
        this.darbuotojai = new ArrayList<Darbuotojas>();
    }

	public String getPavadinimas() {
		return pavadinimas;
	}

	public int getIkurimoMetai() {
		return ikurimoMetai;
	}

	public List<Darbuotojas> getDarbuotojai() {
		return darbuotojai;
	}
	public void pridekDarbuotoja(Darbuotojas darb)
	{this.darbuotojai.add(darb);
		
	}
	

	

}
