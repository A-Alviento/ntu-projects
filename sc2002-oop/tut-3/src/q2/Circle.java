package q2;

public class Circle extends Point {
	int r;
	
	public Circle(){
		super();
		r = 0;
	}
	
	public void setRadius(int a) {
		this.r = a;
	}
	
	public int getRadius() {
		return this.r;
	}
	public double area() {
		return 3.14151*this.r;
	}
	
}
