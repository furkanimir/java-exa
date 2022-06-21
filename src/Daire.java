
public class Daire {

	private double r;
	
	public Daire (double r) {
		this.setR(r);
	}
	
	public Daire() {
		// TODO Auto-generated constructor stub
		
	}

	public double alan(double r) {
		double k= r*r*Math.PI;
		return k;
		
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	
}
