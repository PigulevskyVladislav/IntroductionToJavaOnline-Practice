package by.jonline.point01.loop.main;

import java.util.Scanner;

public class Prac02 {

	public static void main(String args[]) {
		
		double a, b, h;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		a = s.nextDouble();
		System.out.println("Enter b: ");
		b = s.nextDouble();
		System.out.println("Enter h: ");
		h = s.nextDouble();
		s.close();
		
		for(double i = a; i <= b; i += h) {
			
			System.out.println("Current step: " + i + " Function value: " + GetValueOfFunc(i));
		}
	}
	
	private static double GetValueOfFunc(double val) {
		
		return val > 2 ? val : -val;
	}
}
