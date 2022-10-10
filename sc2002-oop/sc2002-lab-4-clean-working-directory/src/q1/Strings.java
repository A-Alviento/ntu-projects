package q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Strings
{
// --------------------------------------------
// Reads in an array of integers, sorts them,
// then prints them in sorted order.
// --------------------------------------------
public static void main (String[] args) throws IOException
{
	Comparable[] strList;
	int size;
	Scanner scan = new Scanner(System.in);
	System.out.print ("\nHow many strings do you want to sort? ");
	size = scan.nextInt();
	strList = new Comparable[size];
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println ("\nEnter the strings...");
	for (int i = 0; i < size; i++)
		strList[i] = br.readLine();
		Sorting.insertionSort(strList);
		System.out.println ("\nYour numbers in sorted order...");
	for (int i = 0; i < size; i++)
		System.out.print(strList[i] + " ");
	System.out.println ();
	}
}