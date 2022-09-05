import java.util.Scanner;

public class t1q3Improved {
	
	public static void bubble(int[] a, int n) {
		int i, j, k;
		for (i=n-2;i>=0;i--) {
			for (j=0;j<=i;j++) {
				if (a[j]>a[j+1]) {
					k = a[j];
					a[j] = a[j+1];
					a[j+1] = k;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = new int[10];
		int i, n;
		System.out.println("Enter number of Integer elements to be sorted: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for (i=0; i<n;i++) {
			System.out.println("Enter integer value for element number" + i+1 + ": ");
			a[i] = sc.nextInt();
		}
		
		bubble(a,n);
		
		System.out.print("Finally sorted array is: ");
		for (i=0; i<n; i++){
			System.out.print(a[i] + " ");
		}
	}
}