package by.jonline.point01.linear.main;

import java.util.Scanner;

public class Prac04 {
	
	public static void main(String args[]) {
		
		double val, fpart, spart;

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter real number with format nnn.ddd: ");
		val = s.nextDouble();
		s.close();
		
		fpart = Math.floor(val) / 1000;
		spart = (val - Math.floor(val)) * 1000.000;
		spart = (double) Math.round(spart * 100.0) / 100.0;
		val = fpart + spart;
		System.out.println("Result: " + val);
	}
}
