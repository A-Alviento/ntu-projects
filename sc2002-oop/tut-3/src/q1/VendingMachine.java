package q1;
import java.util.Scanner;

public class VendingMachine {
	Scanner sc = new Scanner(System.in);
	
	public VendingMachine() {
		
	}
	
	// get drink selection and return cost of drink
	public double selectDrink() {
		System.out.println("1. Buy Beer ($3.00)");
		System.out.println("2. Buy Coke ($1.00)");
		System.out.println("3. Buy Green Tea ($5.00");
		System.out.println("Please enter selection: ");
		int price = sc.nextInt();
		switch(price) {
		case 1:
			return 3.00;
		case 2: 
			return 1.00;
		case 3:
			return 5.00;
		default:
			System.out.println("Invalid reset program");
			return 0;
		}
	}
	
	// insert coins and returns amount inserted
	public double insertCoins(double x) {
		return x;
	}
	
	// check the change and print the change on screen
	public void checkChange(double amount, double drinkCost) {
		if (amount>=drinkCost) {
			double change = amount - drinkCost;
			System.out.println("Change: " + change);
		}
		else {
			System.out.println("Innsufficient");
		}
	}
	
	// print the receipt and collect the drink
	public void printReceipt() {
		System.out.println("Please collect your drink");
		System.out.println("Thank you !!");
	}
	
	

}
