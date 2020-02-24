package by.jonline.point02.one_dimensional_arrays.main;

import java.util.Scanner;

//
//	Task condition isn't correct
//

public class Prac07 {

	public static void main(String args[]) {
		
		double a[];
		double item, max = -Double.MAX_VALUE;
		int n;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the length of sequence of numbers: ");
		n = s.nextInt();
		a = new double[2 * n];
		for (int i = 0; i < n; i++) {
			
			System.out.println("Enter a[" + (i + 1) + "] element: ");
			a[i] = s.nextDouble();
		}
		for (int i = 0; i < n; i++) {
			
			System.out.println("Enter a[n + " + (i + 1) + "] element: ");
			a[i + n] = s.nextDouble();
		}
		s.close();
		
		for (int i = 0; i < n; i++) {
			
			item = a[i] + a[i + n];
			max = max < item ? item : max;
		}
		
		System.out.println("Result: " + max);
	}
}
