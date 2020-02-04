package by.jonline.point01.loop.main;

import java.util.Scanner;

public class prac05 {
	
	public static void main(String args[]) {
	
		int n_min, n_max;
		double a, e, sum = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter minimum n: ");
		n_min = s.nextInt();
		System.out.println("Enter maximum n: ");
		n_max = s.nextInt();
		System.out.println("Enter e: ");
		e = s.nextDouble();
		s.close();
		
		for(int i = n_min; i <= n_max; i++) {
			
			a = GetA(i);
			sum += Math.abs(a) >= e ? a : 0;
		}
		System.out.println("Result: " + sum);
	}
	
	private static double GetA(int i) {
		
		return 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
	}
}
