package q2;

public class Square extends Shape {
	public Square() {
		this(0);
	}
	public Square(double l) {
		super(l, l);
	}
	public double getArea() {
		double h = super.getH();
		return h * h;
	}

}
