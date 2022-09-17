
public class Point {
	int x, y;
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(int a, int b) {
		this.x = a;
		this.y = b;
	}
	
	public void setPoint(int a, int b) {
		this.x = a;
		this.y = b;
	}
	
	public static String toString(int x, int y) {
		return("[ " + x + ", " + y + " ]");
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	
}
