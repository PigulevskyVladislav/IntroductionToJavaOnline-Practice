package by.jonline.point01.linear.main;

import java.util.Scanner;

public class prac02 {
	
	public static void main(String args[]) {
		
		double a, b, c, z;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		a = s.nextDouble();
		System.out.println("Enter b: ");
		b = s.nextDouble();
		System.out.println("Enter c: ");
		c = s.nextDouble();
		s.close();
		
		z = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a
				- (Math.pow(a, 3) * c + Math.pow(b, -2));
		System.out.println("Result: " + z);
	}

}
