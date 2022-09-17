package q1;
import java.util.Scanner;

public class CircleApp {
	public static void main(String[] args) {
		System.out.println("1. Create a new circle");
		System.out.println("2. Print Area");
		System.out.println("3. Print Circumference");
		System.out.println("4. Quit");
		System.out.println("Choose option:");
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		Circle c1 = new Circle(0);
		double rad = 0;
		while (i<4) {
			switch(i) {
			case 1:
				System.out.println("Enter the radius: ");
				rad = sc.nextDouble();
				c1.setRadius(rad);
				System.out.println("A new circle is created");
				break;
			case 2:
				System.out.println("Area of circle");
				System.out.println("Radius" + rad);
				System.out.println("Area: " + c1.area());
				break;
			case 3:
				System.out.println("Circumference of circle");
				System.out.println("Radius: " + rad);
				System.out.println("Circumference: " + c1.circumference());
				break;
			default:
				System.out.println("Thank you!!");
			}
			System.out.println("Choose option (1-3):");
			i = sc.nextInt();
		}
		
		
	}
}
