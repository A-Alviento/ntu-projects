import java.util.Scanner;

public class t1q3Improved{
	
	private static void bubble(int[] a, int n) {
		
		int i, j, t;
		
		for (i=n-2; i>0; i--) {
			for (j=0; j<=i; j++) {
				if (a[j]>a[j+1]) {
					t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		int n, i;
		
		System.out.println("Enter the number of Integer elements to be sorted: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int[] a = new int[n];
		
		for(i=0; i<=n-1; i++) {
			System.out.println("Enter integer value for element no. " + (i+1) + ": ");
			a[i] = sc.nextInt();
		}
		
		bubble(a, n);
		
		System.out.print("Final sorted array is: ");
		for (i=0; i<=n-1; i++)
				System.out.print(a[i] + " ");
		
	}
}