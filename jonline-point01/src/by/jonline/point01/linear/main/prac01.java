package by.jonline.point01.linear.main;

import java.util.Scanner;

public class prac01 {
	
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
		
		z =((a - 3) * b / 2) + c;
		System.out.println("Answer: z = " + z);
	}
}
