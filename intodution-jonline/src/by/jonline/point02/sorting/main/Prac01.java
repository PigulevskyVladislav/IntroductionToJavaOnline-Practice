package by.jonline.point02.sorting.main;

import java.util.Scanner;

public class Prac01 {

	public static void main(String args[]) {
		
		int[] a1, a2;
		int n, m, k;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter length of the first array:");
		n = s.nextInt();
		System.out.println("Enter length of the second array:");
		m = s.nextInt();
		a1 = new int[m + n];
		a2 = new int[m];
		for(int i = 0; i < n; i++) {
			
			System.out.println("Enter first array:");
			System.out.println("Enter " + (i + 1) + " element: ");
			a1[i] = s.nextInt();
		}
		for(int i = 0; i < a2.length; i++) {
			
			System.out.println("Enter second array:");
			System.out.println("Enter " + (i + 1) + " element: ");
			a2[i] = s.nextInt();
		}
		System.out.println("Enter k:");
		k = s.nextInt();
		s.close();
		
		for(int i = n - 1; i >= k; i--) {
			
			a1[i + m] = a1[i];
		}
		for(int i = 0; i < m; i++) {
			
			a1[i + k] = a2[i];
		}
		System.out.println("Final array:");
		for(int i = 0; i < a1.length; i++) {
			
			System.out.print(" " + a1[i]);
		}
	}
}
