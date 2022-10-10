package q2;

public class Rectangle extends Shape {
	
	public Rectangle() {
		this(0,0);
	}
	
	public Rectangle(double h, double w) {
		super(h, w);
	}
	
	public double getArea() {
		double h = super.getH();
		double w = super.getW();
		return h * w;
	}

}
