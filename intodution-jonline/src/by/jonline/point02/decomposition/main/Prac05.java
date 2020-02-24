package by.jonline.point02.decomposition.main;

import java.util.Scanner;

public class Prac05 {

	public static void main(String args[]) {
		
		int[] a;
		int n, premax, max;
		Scanner s = new Scanner(System.in);
		
		premax = max = -Integer.MAX_VALUE;
		System.out.println("Enter N: ");
		n = s.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			
			System.out.println("Enter A[" + (i + 1) + "] element: ");
			a[i] = s.nextInt();
			
			if(a[i] > max) {
				
				premax = max;
				max = a[i];
			} 
		}
		s.close();
		
		System.out.println("Inserted array: ");
		for (int i = 0; i < n; i++) {
			
			System.out.print(" " + a[i]);
		}
		System.out.println();
		System.out.println("Premaximal element: " + premax);
	}
}
