package by.jonline.point02.sorting.main;

import java.util.Scanner;

public class Prac02 {
	
	public static void main(String args[]) {
		 
		int[] a, b;
		int n, m, i_a, i_b, lim;
		Scanner s = new Scanner(System.in);
		
		//min_lng = n < m ? n : m;
		System.out.println("Enter length of the first array:");
		n = s.nextInt();
		System.out.println("Enter length of the second array:");
		m = s.nextInt();
		i_a = n - 1;
		i_b = m - 1;
		a = new int[m + n];
		b = new int[m];
		lim = m > n ? n : m;
		lim = a.length - 1 - lim * 2;
		System.out.println("Enter first array:");
		for(int i = 0; i < n; i++) {
			
			System.out.println("Enter " + (i + 1) + " element: ");
			a[i] = s.nextInt();
		}
		System.out.println("Enter second array:");
		for(int i = 0; i < b.length; i++) {
			
			System.out.println("Enter " + (i + 1) + " element: ");
			b[i] = s.nextInt();
		}
		s.close();
		
		for(int i = a.length - 1; i >= 0; i--) {
			
			if(i_a >= 0 && i_b >= 0) {
				
				if(a[i_a] > b[i_b]) {
					
					a[i] = a[i_a];
					i_a--;
				} else {
					
					a[i] = b[i_b];
					i_b--;
				}
			} else if(i_a < 0) {
				
				a[i] = b[i_b];
				i_b--;
			} else {
				
				a[i] = a[i_a];
				i_a--;
			}
			
		}
		System.out.println("Result: ");
		for(int i = 0; i < a.length; i++) {
			
			System.out.print(" " + a[i]);
		}
	}
}
