package q2;

import java.util.Scanner;

public class Shape2DApp {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of shapes: ");
        int shapeNum = sc.nextInt();
        Shape[] shapes = new Shape[shapeNum];

        for (int i = 0; i < shapeNum; i++) {
            System.out.print("Choose a shape:\n1.Square\n2.Rectangle\n3.Circle\n4.Triangle:");
            int width, height, side, radius, base, shape = sc.nextInt();

            switch (shape) {
                case 1:
                    
                    System.out.print("Enter the length of side of the square: ");
                    side = sc.nextInt();
                    Square sq = new Square(side);
                    shapes[i] = sq;
                    break;

                case 2:
                    System.out.print("Enter the width of the rectangle: ");
                    width = sc.nextInt();
                    System.out.print("Enter the height of the rectangle: ");
                    height = sc.nextInt();
                    Rectangle rect = new Rectangle(height, width);
                    shapes[i] = rect;
                    break;

                case 3:
                    System.out.print("Enter the radius of the circle: ");
                    radius = sc.nextInt();
                    Circle c = new Circle(radius);
                    shapes[i] = c;
                    break;

                case 4:
                    System.out.print("Enter the base of the triangle: ");
                    base = sc.nextInt();
                    System.out.print("Enter the height of the triangle: ");
                    height = sc.nextInt();
                    Triangle tri = new Triangle(height, base);
                    shapes[i] = tri;
                    break;

                default:
                    System.out.println("Invalid choice, try again...");
                    i--;
                    break;
            }
        }

        double totalArea = 0;

        for (int i = 0; i < shapeNum; i++) {
            totalArea += shapes[i].getArea();
        }

        System.out.format("Total area of shapes is %.2f\n", totalArea);
        sc.close();
    }
}
