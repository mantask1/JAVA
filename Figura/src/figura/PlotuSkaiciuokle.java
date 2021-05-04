package figura;

public class PlotuSkaiciuokle {

	public static void main(String[] args) {
		IvestisIsvestis io = new IvestisIsvestis();
		io.suzinokFigura();
		io.suzinokKrastines();
		
		if(io.getPasirinktaFigura() == 1) {
			Kvadratas kvadratas = new Kvadratas(io.getKrastine1());
			kvadratas.skaiciuokPlota();
			io.spausdinkPlota(kvadratas.toString());
			
		}
		if(io.getPasirinktaFigura() == 2)
		{
		Trikampis trikampis = new Trikampis(io.getKrastine1(),io.getKrastine2());
		trikampis.skaiciuokPlota();
		io.spausdinkPlota(trikampis.toString());
		}
		if(io.getPasirinktaFigura() == 3) {
		Skritulys skritulys = new Skritulys(io.getKrastine1());
		skritulys.skaiciuokPlota();
		io.spausdinkPlota(skritulys.toString());
		}
		
	}
}
