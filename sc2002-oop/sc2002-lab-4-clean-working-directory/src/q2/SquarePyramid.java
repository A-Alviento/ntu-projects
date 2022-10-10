package q2;

public class SquarePyramid extends Shape {
	
	private Square sq;
	private double h;
	
	public SquarePyramid() {
		this(0, 0);
	}
	
	public SquarePyramid(double w, double h) {
		sq = new Square(w);
		this.h = h;
	}
	
	public double getVolume() {
		return sq.getArea() * this.h / 3;
	}
}
