package q2;

public class Cone extends Shape {
	
	private Circle cir;
	private double h;
	
	public Cone() {
		this(0, 0);
	}
	
	public Cone(double r, double h) {
		cir = new Circle(r);
		this.h = h;
	}
	
	public double getVolume() {
		return cir.getArea() * this.h / 3;
	}
}
