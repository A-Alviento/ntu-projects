import java.util.Scanner;

public class t1q3 {
	
	public static void bubble(int[] a, int n) {
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

	public static void main (String[] args) {
		int[] a = new int[10];
		int n, i;
		
		System.out.println("Enter the number of Integer elements to be sorted: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for (i=0; i<n; i++) {
			System.out.println("Enter integer value for element no." + (i+1) + " : ");
			a[i] = sc.nextInt();dddddd
		}
		
		bubble(a, n);
		
		System.out.println("Finally sorted array is ");
		for (i=0; i<=n-1; i++)
			System.out.print(a[i] + " ");
		
		
	}
}
