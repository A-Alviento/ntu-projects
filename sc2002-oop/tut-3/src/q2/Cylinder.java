package q2;

public class Cylinder extends Circle{
	int h;
	
	public Cylinder() {
		super();
		h = 0;
	}
	
	public void setHeight(int a) {
		this.h = a;
	}
	
	public int getHeight(int a) {
		return this.h;
	}
	
	public double area() {
		return super.area()*2+3.14151*2*super.r*this.h;
	}
	
	public double volume() {
		return super.area()*this.h;
	}
}
