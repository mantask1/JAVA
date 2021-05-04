package biblioteka;
import java.util.ArrayList;
import java.util.List;

public class Bibliotekaa {
		
		private ArrayList<Knyga> knygos; 
		
		public Bibliotekaa() {
			this.knygos = new ArrayList<Knyga>();
		}
		
		public void prideKnyga(Knyga knyga)
		 {
		this.knygos.add(knyga);
		 }
		
		public void spausdinkKnyguInfo() {
			for (Knyga book : this.knygos) {
				System.out.println(book.getKnygosInfo());
				System.out.println();
				
		}
	}

}
