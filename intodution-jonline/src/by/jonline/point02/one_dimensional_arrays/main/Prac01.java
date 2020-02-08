package by.jonline.point02.one_dimensional_arrays.main;

import java.util.Scanner;

public class Prac01 {

	public static void main(String args[]) {
		
		int a[];
		int k, n, sum = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter N: ");
		n = s.nextInt();
		a = new int[n];
		System.out.println("Enter K: ");
		k = s.nextInt();
		for (int i = 0; i < n; i++) {
			
			System.out.println("Enter a[" + (i + 1) + "] element: ");
			a[i] = s.nextInt();
		}
		s.close();
		
		for (int i = 0; i < n; i++) { 
			
			if (a[i] % k == 0) {
				
				sum += a[i];
			}
		}
		
		System.out.println("Sums of elements of multiples of K equal: " + sum);
	}
}
