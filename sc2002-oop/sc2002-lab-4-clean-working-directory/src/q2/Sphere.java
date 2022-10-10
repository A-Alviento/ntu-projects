package q2;

public class Sphere extends Shape{
	
	private Circle cir;
	
	public Sphere() {
		this(0);
	}
	
	public Sphere(double r) {
		cir = new Circle(r);
	}
	
	public double getVolume() {
		return cir.getArea() * cir.getR() * 4 / 3;
	}
}