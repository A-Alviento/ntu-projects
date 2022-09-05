import java.util.Scanner;
import java.lang.Math;

public class Lab2p1{
	public static void mulTest() {
		int num1, num2, ans;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0; i<5; i++) {
			num1 = (int)Math.floor(Math.random()*(9-1+1)+1);
			num2 = (int)Math.floor(Math.random()*(9-1+1)+1);
			System.out.println("How much is " + num1 + " times " + num2 + "?");
			ans = sc.nextInt();
			if (ans == num1*num2)
				count++;
		}
		System.out.println(count + " answers out of 5 are correct.");
	};
	
	public static int divide(int m, int n) {
		if (n==0) {
			return -1;
		}
		int count = 0;
		while(m>0) {
			m -= n;
			if (m>=0){
				count++;
			}
		}
		return count;
	}
	
	public static int modulus(int m, int n) {
		if (n==0) {
			return -1;
		}
		int count = 0;
		while(m>0) {
			m -= n;
			if (m>=0){
				count++;
			}
		}
		if (m<0)
			return m+n;
		return m;
	}
	
	public static int countDigits(int n) {
		if (n<0) {
			System.out.println("Error input!!");
			return 0;
		}
			
		int count = 0;
		while (n>0) {
			n=n/10;
			count++;
		}
		System.out.println("count = " + count);
		return count;
	}
	
	public static int position(int n, int digit){
		int r;
		int count = 0;
		while (n>0) {
			r = n%10;
			n = n/10;
			count++;
			if (r==digit) {
				System.out.println("position = " + count);
				return count;
			}
		}
		System.out.println("position = -1");
		return -1;
	}
	
	public static int extractOddDigits(long n) {
		long r;
		int number = 0;
		int count = 0;
		while (n>0) {
			r = n%10;
			n = n/10;
	
			if (r%2==1) {
				count++;
				number += r* Math.pow(10, count-1);
			}
		}
		if (number == 0)
			return -1;
		return number;
	}
	
	public static void main (String[] args) {
		int choice, m, n;
		long a;
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("Perform the following methods:");
			System.out.println("1: multiplication test");
			System.out.println("2: quotient using division by subtraction");
			System.out.println("3: remainder using division by subtraction");
			System.out.println("4: count the number of digits");
			System.out.println("5: position of a digit");
			System.out.println("6: extract all odd digits");
			System.out.println("7: quit");
			choice = sc.nextInt();
			
			switch (choice) {
				case 1: /* add mulTest() call */
					mulTest();
					break;
				case 2: /* add divide() call */
					System.out.print("m = ");
					m = sc.nextInt();
					System.out.print("n = ");
					n = sc.nextInt();
					System.out.println("m/n = " + divide(m, n));
					break;
				case 3: /* add modulus() call */
					System.out.print("m = ");
					m = sc.nextInt();
					System.out.print("n = ");
					n = sc.nextInt();
					System.out.println("m%n = " + modulus(m, n));
					break;
				case 4: /* add countDigits() call */
					System.out.print("n: ");
					m = sc.nextInt();
					countDigits(m);
					break;
				case 5: /* add position() call */
					System.out.print("n: ");
					m = sc.nextInt();
					System.out.print("digit: ");
					n = sc.nextInt();
					position(m, n);
					break;
				case 6: /* add extractOddDigits() call */
					System.out.print("n: ");
					a = sc.nextLong();
					m = extractOddDigits(a);
					System.out.println("oddDigits = " + m);
					break; 
				case 7: System.out.println("Program terminating ….");
			} 
		}while (choice<7);
		
		
	}
}