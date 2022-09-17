package q3;

public class Rectangle extends Polygon{
	
	public Rectangle(String theName, float theWidth, float theHeight) {
		super(theName, theWidth, theHeight);
		super.polytype = KindofPolygon.POLY_RECT;
	}
	
	
}
