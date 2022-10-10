package q2;

import java.util.Scanner;

public class Shape3DApp {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of shapes: ");
        int shapeNum = sc.nextInt();
        Shape[] shapes = new Shape[shapeNum];

        for (int i = 0; i < shapeNum; i++) {
            System.out.print("Choose a shape:\n1.Cuboid\n2.Sphere\n3.Pyramid\n4.Cone\n5.Cylinder:");
            int width, height, height1, radius, base, shape = sc.nextInt();

            switch (shape) {
                case 1:
                    System.out.print("Enter the width of the rectangle base: ");
                    width = sc.nextInt();
                    System.out.print("Enter the height of the rectangle base: ");
                    height = sc.nextInt();
                    System.out.print("Enter the height of the cuboid: ");
                    height1 = sc.nextInt();
                    Cuboid cub = new Cuboid(height, width, height1);
                    shapes[i] = cub;
                    break;

                case 2:
                    System.out.print("Enter the radius of the circle: ");
                    radius = sc.nextInt();
                    Sphere s = new Sphere(radius);
                    shapes[i] = s;
                    break;

                case 3:
                    System.out.print("Enter the length of the square base: ");
                    base = sc.nextInt();
                    System.out.print("Enter the height of the pyramid: ");
                    height = sc.nextInt();
                    SquarePyramid sp = new SquarePyramid(base, height);
                    shapes[i] = sp;
                    break;
                 
                case 4:
                	System.out.print("Enter the radius of the circular base: ");
                	radius = sc.nextInt();
                	System.out.print("Enter the height of the cone: ");
                	height = sc.nextInt();
                	Cone c = new Cone(radius, height);
                	shapes[i] = c;
                	break;
                
                case 5:
                	System.out.print("Enter the radius of the circular base: ");
                	radius = sc.nextInt();
                	System.out.print("Enter the height of the cylinder: ");
                	height = sc.nextInt();
                	Cylinder cy = new Cylinder(radius, height);
                	shapes[i] = cy;
                	break;

                default:
                    System.out.println("Invalid choice, try again...");
                    i--;
                    break;
            }
        }

        double totalVolume = 0;

        for (int i = 0; i < shapeNum; i++) {
            totalVolume += shapes[i].getVolume();
        }

        System.out.format("Total area of shapes is %.2f\n", totalVolume);
        sc.close();
    }
}
