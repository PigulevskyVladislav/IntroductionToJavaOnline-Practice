package by.jonline.point02.one_dimensional_arrays.main;

import java.util.Scanner;

public class Prac02 {

	public static void main(String args[]) {
		
		double a[];
		double z;
		int n, counter = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the length of sequence of numbers: ");
		n = s.nextInt();
		a = new double[n];
		System.out.println("Enter Z: ");
		z = s.nextInt();
		for (int i = 0; i < n; i++) {
			
			System.out.println("Enter a[" + (i + 1) + "] element: ");
			a[i] = s.nextInt();
		}
		s.close();
		
		System.out.print("Original sequence: ");
		for (int i = 0; i < n; i++) {
			
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		System.out.print("Final sequence: ");
		for (int i = 0; i < n; i++) {
			
			if (a[i] > z) {
				
				a[i] = z;
				counter++;
			}
			
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		System.out.println("Count of changes: ");
		System.out.println(counter);
		
	}
}
