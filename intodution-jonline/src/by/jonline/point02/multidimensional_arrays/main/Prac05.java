package by.jonline.point02.multidimensional_arrays.main;

import java.util.Scanner;

public class Prac05 {

	public static void main(String args[]) {
		
		int a[][];
		int n;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter even N: ");
		n = s.nextInt();
		a = new int[n][n];
		s.close();
		
		if(n % 2 == 0) {
			
			for(int i = 0; i < n; i++) {
				
				for(int j = 0; j < n - i; j++) {
					
					a[i][j] = i + 1;
				}
			}
			
			System.out.println("Result: ");
			for(int i = 0; i < n; i++) {
				
				for(int j = 0; j < n; j++) {
					
					System.out.print(" " + a[i][j]);
				}
				System.out.println();
			}
		} else {
			
			System.out.println("N isn't even.");
		}
	}
}
