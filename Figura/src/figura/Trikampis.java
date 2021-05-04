package figura;



public class Trikampis extends Figura {

	public Trikampis(float sk1, float sk2) {
		super(sk1, sk2);
		
	}
@Override
public void skaiciuokPlota() {
super.skaiciuokPlota();

float trikPlotas = super.getPlotas() / 2;
super.setPlotas(trikPlotas);

}
}
