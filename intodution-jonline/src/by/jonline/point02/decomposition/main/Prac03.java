package by.jonline.point02.decomposition.main;

import java.util.Scanner;

public class Prac03 {
	
	public static void main(String args[]) {
		
		int a;
		double area;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the side of triangle:");
		a = s.nextInt();
		s.close();
		
		area = CalcAreaOfEqTriangle(a);
		System.out.printf("Area: %.3f %n", area);
	}
	
	private static double CalcAreaOfEqTriangle(int side) {
		
		return Math.sqrt(3) / 4 * Math.pow(side, 2);
	}
}
