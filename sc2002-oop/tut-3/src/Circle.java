
public class Circle extends Point {
	int r;
	
	public void setRadius(int a) {
		this.r = a;
	}
	
	public int getRadius() {
		return this.r;
	}
	public double area() {
		return 3.14156*this.r;
	}
	
}
