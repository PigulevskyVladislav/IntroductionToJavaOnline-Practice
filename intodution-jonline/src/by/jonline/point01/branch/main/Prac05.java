package by.jonline.point01.branch.main;

import java.util.Scanner;

public class Prac05 {

	public static void main(String args[]) {
		
		double x, res;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter x: ");
		x = s.nextDouble();
		s.close();
		
		if(x > 3) {
			
			res = 1 / (Math.pow(x, 3) + 6);
		} else {
			
			res = Math.pow(x, 2) - 3*x + 9;
		}
		System.out.println("Result: " + res);
	}
}
