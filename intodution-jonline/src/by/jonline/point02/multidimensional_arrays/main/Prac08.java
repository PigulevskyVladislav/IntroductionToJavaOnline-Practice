package by.jonline.point02.multidimensional_arrays.main;

import java.util.Scanner;

public class Prac08 {

	public static void main(String args[]) {
		
		int[][] a = {{1, 7, 3, 2, 7}, 
			         {4, 5, 6, 7, 1}, 
			         {7, 8, 9, 1, 3}};
		int p, k, val;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Original matrix: ");
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[0].length; j++) {
				
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
		System.out.println("There we have 3x5 matrix.");
		System.out.println("Enter number of the first column: ");
		p = s.nextInt() - 1;
		System.out.println("Enter number of the second column: ");
		k = s.nextInt() - 1;
		s.close();
		
		for(int i = 0; i < a.length; i++) {
			
			val = a[i][p];
			a[i][p] = a[i][k];
			a[i][k] = val;
		}
		System.out.println("Final matrix: ");
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[0].length; j++) {
				
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
	}
}
