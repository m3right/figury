public class Romb extends Figura {
	private double a, h;

	public Romb(Punkt p, double na, double nh) {
		super(p);
		a = na;
		h = nh;
	}

	public double pole() {
		return a * h;
	}

	public void powieksz(double ile) {
		a *= ile;
		h *= ile;
	}
	
	public String toString() {
		return "Romb(" + a + ", " + h + ")" + super.toString();
	}
}
