package figura;



public class Figura {
	private float plotas;
	private float krastine1;
	private float krastine2;
	
	
	public float getKrastine1() {
		return krastine1;
	}
	public float getKrastine2() {
		return krastine2;
	}
	public float getPlotas() {
		return plotas;
	}
	public void setPlotas(float plotas) {
		this.plotas = plotas;
	}
	
	protected Figura (float sk1, float sk2) {
		this.krastine1 = sk1;
		this.krastine2 = sk2;
	}
	
	public void skaiciuokPlota() {	
	this.plotas = this.krastine1 * this.krastine2;
		}
	
@Override
	public String toString() {
	return "Jusu figuros plotas yra  " + this.plotas + " kv.cm" ;	
		}
}
	
