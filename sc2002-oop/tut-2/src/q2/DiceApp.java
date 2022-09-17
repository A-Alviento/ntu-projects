package q2;
import java.util.Scanner;
import java.util.Random;

public class DiceApp {
	
	public static void main (String[] args) {
		
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int d1, d2, total;
		
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		Random random = new Random();
		
		while (count <2) {
			System.out.println("Enter '1' to roll first dice");
			sc.nextInt();
			d1 = random.nextInt(1,7);
			dice1.setDiceValue(d1);
			dice1.printDiceValue();
			System.out.println("Enter '2' to roll first dice");
			sc.nextInt();
			d2 = random.nextInt(1,7);
			dice2.setDiceValue(d2);
			dice2.printDiceValue();
			total = d1+d2;
			System.out.println("Your total number is "+ total);
		}
		
	}
	

	
}
