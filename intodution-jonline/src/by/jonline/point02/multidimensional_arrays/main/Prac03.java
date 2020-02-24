package by.jonline.point02.multidimensional_arrays.main;

import java.util.Scanner;

public class Prac03 {

	public static void main(String args[]) {
		
		int[][] a = {{1, 7, 3, 2, 7}, 
				     {4, 5, 6, 7, 1}, 
				     {7, 8, 9, 1, 3}};
		int p, k;
		Scanner s = new Scanner(System.in);
		
		System.out.println("There we have 3x5 matrix.");
		System.out.println("Enter p: ");
		p = s.nextInt() - 1;
		System.out.println("Enter k: ");
		k = s.nextInt() - 1;
		s.close();
		
		System.out.println("Output k row: ");
		for(int j = 0; j < a[0].length; j++) {
			
			System.out.print(" " + a[k][j]);
		}
		System.out.println("\nOutput p column: ");
		for(int j = 0; j < a.length; j++) {
			
			System.out.println(" " + a[j][p]);
		}
	}
}
