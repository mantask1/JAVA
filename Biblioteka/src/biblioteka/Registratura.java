package biblioteka;

public class Registratura {

	public static void main(String[] args) {
		
		 Autorius aut1 = new Autorius("Jurga", "Ivanauskaite", 1961);
	     Autorius aut2 = new Autorius("Arturas", "Klarkas", 1917);
	     Autorius aut3 = new Autorius("Dzonas", "Tolkinas", 1892);
	     Autorius aut4 = new Autorius("Ruta", "Sepetys", 1967);
	     Autorius aut5 = new Autorius("G.D.", "Roberts", 1952);
	     Autorius aut6 = new Autorius("George", "Orwell", 1903);

	        Knyga kny1 = new Knyga(" Ragana ir lietus", aut1, 1993);
	        Knyga kny2 = new Knyga(" 2001 m. Kosmine Odiseja", aut2, 1968);
	        Knyga kny3 = new Knyga(" Hobitas", aut3, 1937);
	        Knyga kny4 = new Knyga(" Tarp pilku debesu", aut4, 2011);
	        Knyga kny5 = new Knyga(" Santaramas", aut5, 2003);
	        Knyga kny6 = new Knyga(" Gyvuliu ukis", aut6, 1945);

	        Bibliotekaa biblioteka = new Bibliotekaa();

	        biblioteka.prideKnyga(kny1);
	        biblioteka.prideKnyga(kny2);
	        biblioteka.prideKnyga(kny3);
	        biblioteka.prideKnyga(kny4);
	        biblioteka.prideKnyga(kny5);
	        biblioteka.prideKnyga(kny6);

	        biblioteka.spausdinkKnyguInfo();
	}

}
