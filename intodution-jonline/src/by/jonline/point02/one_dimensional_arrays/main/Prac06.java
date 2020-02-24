package by.jonline.point02.one_dimensional_arrays.main;

import java.util.Scanner;

public class Prac06 {

	public static void main(String args[]) {
		
		double a[];
		int n, sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of sequence of numbers: ");
		n = s.nextInt();
		a = new double[n];
		for (int i = 0; i < n; i++) {
			
			System.out.println("Enter a[" + i + "] element: ");
			a[i] = s.nextDouble();
			
			if(IsSimple(i)) {
				
				sum += i;
			}
		}
		s.close();
		
		System.out.println("The sum of numbers: " + sum);
	}
	
	private static boolean IsSimple(int i) {
		
		if(i < 2) {
			
			return false;
		} else if(i > 10) {
			
			for(int j = 2; j < Math.sqrt(i) + 1; j++) {
				
				//boolean check = true;
				if(i % j == 0) {
					
					return false;
				}
			}
			return true;
		} else {
			
			if(i == 2 || i == 3 || 
			   i == 5 || i == 7) {
						
				return true;
			} else return false;
		}
	}
}
