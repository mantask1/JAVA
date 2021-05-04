package imone;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Administracija {

	public static void main(String[] args) {
		Random pasirinkimas = new Random();
		
		Darbuotojas darb1 = new Darbuotojas ("Mantas", "Kazkas", "38904256987");
		darb1.setPozicija("inzinierius");
		darb1.setDarboStazas((byte) pasirinkimas.nextInt(20));
	
		Darbuotojas darb2= new Darbuotojas ("Jonas", "Jonaitis", "36404256987");
		darb2.setPozicija("direktorius");
		darb2.setDarboStazas((byte) pasirinkimas.nextInt(20));
	
		Darbuotojas darb3 = new Darbuotojas ("Maryte", "Mare", "47004256987");
		darb3.setPozicija("sekretore");
		darb3.setDarboStazas((byte) pasirinkimas.nextInt(20));
		
		Darbuotojas darb4 = new Darbuotojas ("Paulina", "Pauliene", "48404256987");
		darb4.setPozicija("vadove");
		darb4.setDarboStazas((byte) pasirinkimas.nextInt(20));
		
		Darbuotojas darb5 = new Darbuotojas ("Matas", "Sachas", "37504256987");
		darb5.setPozicija("specialistas");
		darb5.setDarboStazas((byte) pasirinkimas.nextInt(20));
		
		Darbuotojas darb6 = new Darbuotojas ("Kamile", "Kami", "48804256987");
		darb6.setPozicija("buhaltere");
		darb6.setDarboStazas((byte) pasirinkimas.nextInt(20));
	
		Imone imone = new Imone("Mik", 2004);
		
		imone.pridekDarbuotoja(darb1);
		imone.pridekDarbuotoja(darb2);
		imone.pridekDarbuotoja(darb3);
		
		imone.pridekDarbuotoja(darb4);
		imone.pridekDarbuotoja(darb5);
		imone.pridekDarbuotoja(darb6);
		
		List<Darbuotojas> mikDarb = imone.getDarbuotojai();
		
		for (Darbuotojas darb : mikDarb) {
			if (darb.getDarboStazas() >= 5) {
				System.out.println(darb.getVardasPavarde());
				System.out.println(darb.getAmzius() + " metu ");
				System.out.println("yra " + darb.getPozicija() + " jau " + darb.getDarboStazas() + " metu");
				System.out.println();
				
			}
		}
	}

}
