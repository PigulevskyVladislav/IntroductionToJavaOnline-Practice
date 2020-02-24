package by.jonline.point02.decomposition.main;

import java.util.Scanner;

public class Prac13 {

	public static void main(String args[]) {
		
		int n;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter N: ");
		n = s.nextInt();
		s.close();
		
		PrintResult(n);
	}
	
	private static void PrintResult(int n) {
		
		int n_x2 = 2 * n;
		
		System.out.println("Result: ");
		for(int i = n; i <= n_x2; i += 2) {
			
			System.out.print(" " + i);
		}
		System.out.println();
	}
}
