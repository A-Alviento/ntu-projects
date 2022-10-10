package q2;

public class Circle extends Shape{
	private double r;
	
	public Circle() {
		this(0);
	}
	
	public Circle(double r) {
		this.r = r;
	}
	
	public void setR(double r) {
		this.r = r;
	}
	
	public double getR() {
		return this.r;
	}
	
	public double getArea() {
		return this.getR() * this.getR() * Math.PI;
	}

}
