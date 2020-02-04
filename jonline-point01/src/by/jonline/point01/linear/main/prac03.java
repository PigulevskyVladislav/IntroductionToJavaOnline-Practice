package by.jonline.point01.linear.main;

import java.util.Scanner;

public class prac03 {

	public static void main(String args[]) {
		
		double x, y, z;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter x: ");
		x = s.nextDouble();
		System.out.println("Enter y: ");
		y = s.nextDouble();
		s.close();
		
		z = (Math.sin(x) + Math.acos(y)) / (Math.acos(x) - Math.asin(y))
				* Math.tan(x * y);
		System.out.println("Result: " + z);
	}
}
