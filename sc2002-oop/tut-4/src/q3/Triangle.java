package q3;

import q3.Polygon.KindofPolygon;

public class Triangle extends Polygon{
	
	public Triangle(String theName, float theWidth, float theHeight) {
		super(theName, theWidth, theHeight);
		super.polytype = KindofPolygon.POLY_RECT;
	}
}
