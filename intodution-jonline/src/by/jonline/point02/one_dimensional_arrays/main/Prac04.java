package by.jonline.point02.one_dimensional_arrays.main;

import java.util.Scanner;

public class Prac04 {
	
	public static void main(String args[]) {
		
		double a[];
		double max = -Double.MAX_VALUE, min = Double.MAX_VALUE;
		int n, max_index = -1, min_index = -1;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the length of sequence of numbers: ");
		n = s.nextInt();
		a = new double[n];
		for (int i = 0; i < n; i++) {
			
			System.out.println("Enter a[" + (i + 1) + "] element: ");
			a[i] = s.nextDouble();
			
			if(a[i] > max) {
				
				max = a[i];
				max_index = i;
			}
			
			if(a[i] < min) {
				
				min = a[i];
				min_index = i;
			}
		}
		s.close();
		
		System.out.print("Original sequence: ");
		for (int i = 0; i < n; i++) {
			
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		a[min_index] = max;
		a[max_index] = min;
		
		System.out.print("Final sequence: ");
		for (int i = 0; i < n; i++) {
			
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
