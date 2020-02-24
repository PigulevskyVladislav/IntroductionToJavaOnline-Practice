package by.jonline.point02.multidimensional_arrays.main;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Prac07 {

	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	public static void main(String args[]) {
		
		double a[][];
		int n;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter N: ");
		n = s.nextInt();
		a = new double[n][n];
		s.close();
		
		for(int i = 0; i < n; i++) {
			
			for(int j = 0; j < n; j++) {
				
				a[i][j] = Math.sin(n/( (Math.pow(i, 2) - Math.pow(j, 2) )));
			}
		}
		
		System.out.println("Result: ");
		for(int i = 0; i < n; i++) {
			
			for(int j = 0; j < n; j++) {
				
				System.out.print(" " + df2.format(a[i][j]));
			}
			System.out.println();
		}
	}
}
