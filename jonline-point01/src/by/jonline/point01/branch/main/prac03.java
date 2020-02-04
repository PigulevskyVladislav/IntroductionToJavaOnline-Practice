package by.jonline.point01.branch.main;

import java.util.Scanner;

public class prac03 {

	public static void main(String args[]) {
		
		int x1, x2, x3, y1, y2, y3;
		boolean res = false;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter x1: ");
		x1 = s.nextInt();
		System.out.println("Enter y1: ");
		y1 = s.nextInt();
		System.out.println("Enter x2: ");
		x2 = s.nextInt();
		System.out.println("Enter y2: ");
		y2 = s.nextInt();
		System.out.println("Enter x3: ");
		x3 = s.nextInt();
		System.out.println("Enter y3: ");
		y3 = s.nextInt();
		s.close();
		
		if( ((x1 - x3)*(y2 - y3) - (x2 - x3)*(y1 - y3)) == 0 ) {
			
			res = true;
		}
		System.out.println("Result: " + res);
	}
}
