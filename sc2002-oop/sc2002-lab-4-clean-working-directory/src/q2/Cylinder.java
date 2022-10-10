package q2;

public class Cylinder extends Shape {
	
	private Circle cir;
	private double h;
	
	public Cylinder() {
		this(0, 0);
	}
	
	public Cylinder(double r, double h) {
		cir = new Circle(r);
		this.h = h;
	}
	
	public double getVolume() {
		return cir.getArea() * this.h;
	}
}
