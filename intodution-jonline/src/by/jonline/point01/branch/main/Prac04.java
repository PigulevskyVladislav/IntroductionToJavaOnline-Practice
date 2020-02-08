package by.jonline.point01.branch.main;

import java.util.Scanner;

public class Prac04 {

	public static void main(String args[]) {
		
		int x, y, z, a, b;
		boolean res = false;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter x: ");
		x = s.nextInt();
		System.out.println("Enter y: ");
		y = s.nextInt();
		System.out.println("Enter z: ");
		z = s.nextInt();
		System.out.println("Enter A: ");
		a = s.nextInt();
		System.out.println("Enter B: ");
		b = s.nextInt();
		s.close();
		
		if ( 	   (x <= a && y <= b) || (y <= a && x <= b)
				|| (x <= a && z <= b) || (z <= a && x <= b)
				|| (y <= a && z <= b) || (z <= a && y <= b)) {
			
			res = true;
		}
		System.out.println("Result: " + res);
	}
}
