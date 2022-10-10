package q2;

public class Shape {
	private double h, w;
	
	public Shape() {
		this(0, 0);
	}
	
	public Shape(double h, double w) {
		this.h = h;
		this.w = w;
	}
	
	public void setH(double h) {
		this.h = h;
	}
	
	public void setW(double w) {
		this.w = w;
	}
	
	public double getH() {
		return this.h;
	}
	
	public double getW() {
		return this.w;
	}
	
	public double getArea() {
		return -1;
	}

	public double getVolume() {
		return -1;
	}

}
