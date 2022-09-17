package q1;

public class Circle {
	private double radius;
	private static final double PI = 3.14159;
	
	// constructor
	public Circle(double rad) {
		radius = rad;
	}
	
	// mutator method 
	public void setRadius (double rad) {
		radius = rad;
	}
	
	// accessor method
	public double getRadius() {
		return this.radius;
	}
	
	// calculate area
	public double area() {
		double area = PI*this.radius*this.radius;
		return area;
	}
	
	// calculate circumference
	public double circumference() {
		double circ = 2*PI*this.radius;
		return circ;
	}
	
	// print area
	public void printArea() {
		double area = this.area();
		System.out.println("The area is " + area);
	}
	
	// print circumference
	public void printCircumference() {
		double circ = this.circumference();
		System.out.println("The circumference is " + circ);
	}
	
}
