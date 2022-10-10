package q2;

public class Triangle extends Shape {
	
	public Triangle() {
		this(0, 0);
	}
	
	public Triangle(double h, double w) {
		super(h, w);
	}
	
	public double getArea() {
		double h = super.getH();
		double w = super.getW();
		return h * w * 0.5;
	}

}
