package by.jonline.point02.one_dimensional_arrays.main;

import java.util.Scanner;

public class Prac10 {

	public static void main(String args[]) {
		
		int a[];
		int n;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the length of array: ");
		n = s.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			
			System.out.println("Enter a[" + (i + 1) + "] element: ");
			a[i] = s.nextInt();
			a[i] = i % 2 != 0 ? 0 : a[i];
		}
		s.close();
		
		System.out.print("Result: ");
		for (int i = 0; i < n; i++) {
			
			System.out.print(a[i] + " ");
		}
	}
}
