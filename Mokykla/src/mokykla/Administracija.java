package mokykla;

public class Administracija {
	
	
	public static void main(String[] args) {
	
	Mokinys mok1 = new Mokinys("Mantas", "Kazo");
	Mokinys mok2 = new Mokinys("Ieva", "Upe");
	Mokinys mok3 = new Mokinys("Matas", "Razutis");
	Mokinys mok4 = new Mokinys("Jonas", "Vytautas");
	
	
	
	mok1.setPazymiai(9, 8, 10);
	mok2.setPazymiai(5, 6, 7);
	mok3.setPazymiai(10, 9, 9);
	mok4.setPazymiai(10, 10, 6);
	
	Mokykla mokykla = new Mokykla();
	
	mokykla.getMokiniai().add(mok1);
	mokykla.getMokiniai().add(mok2);
	mokykla.getMokiniai().add(mok3);
	mokykla.getMokiniai().add(mok4);
	
	mokykla.skaiciuokVisusVidurkius();
	
	mokykla.spausdinkMokiniuinfo();
	
//	System.out.println(Mokykla.getPavadinimas());//system yra klase o out yra klases kintamasis
	

	
//	System.out.println(mok1.getVardasPavarde());
	}
	}
