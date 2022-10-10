package q2;

public class Cuboid extends Shape{
	
	private Rectangle rec;
	private double h;
	
	public Cuboid() {
		this(0, 0, 0);
	}
	
	public Cuboid(double h, double w, double h1) {
		rec = new Rectangle(h, w);
		this.h = h1;
	}
	
	public double getVolume() {
		return rec.getArea() * this.h;
	}
}