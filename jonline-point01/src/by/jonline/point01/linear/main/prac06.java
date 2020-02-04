package by.jonline.point01.linear.main;

import java.util.Scanner;

public class prac06 {
	
	public static void main(String args[]) {
		
		double x, y;
		boolean res = false;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter x: ");
		x = s.nextDouble();
		System.out.println("Enter y: ");
		y = s.nextDouble();
		s.close();
		
		if((y > 0 && y <= 4 && x >= -2 && x <= 2)
				|| (y <= 0 && y >= -3 && x >= -4 && x <= 4)) {
			
			res = true;
		}
		System.out.println("Result : " + res);
	}
}
