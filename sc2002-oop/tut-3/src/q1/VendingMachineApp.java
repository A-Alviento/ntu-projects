package q1;
import java.util.Scanner;

public class VendingMachineApp extends VendingMachine{
	
	public static void main (String[] args) {
		VendingMachine v1 = new VendingMachine();
		String newLine = System.getProperty("line.separator");
		Scanner sc = new Scanner(System.in);
		
		
		double cost = v1.selectDrink();
		double inp = 0;
		
		
		System.out.println("Enter '1' for ten cents input" + newLine 
				+ "Enter '2' for twenty cents input" + newLine 
				+ "Enter '3' for fifty cents input" + newLine 
				+ "Enter '4' for a dollar input");
		
		
		
		while (inp < cost) {
			int i = sc.nextInt();
			switch(i){
				case 1:
					v1.insertCoins(0.10);
					inp += 0.10;
					break;
				case 2:
					v1.insertCoins(0.20);
					inp += 0.20;
					break;
				case 3:
					v1.insertCoins(0.50);
					inp += 0.50;
					break;
				case 4:
					v1.insertCoins(1.00);
					inp += 1.00;
					break;
			}
		}
		
		v1.checkChange(inp, cost);
		v1.printReceipt();
	}

}
