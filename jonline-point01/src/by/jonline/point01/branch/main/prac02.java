package by.jonline.point01.branch.main;

import java.util.Scanner;

public class prac02 {

	public static void main(String args[]) {
		
		int a, b, c, d, min_ab, min_cd, res;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a:");
		a = s.nextInt();
		System.out.println("Enter b: ");
		b = s.nextInt();
		System.out.println("Enter c: ");
		c = s.nextInt();
		System.out.println("Enter d: ");
		d = s.nextInt();
		s.close();
		
		min_ab = a < b ? a : b;
		min_cd = c < d ? c : d;
		res = min_ab > min_cd ? min_ab : min_cd;
		System.out.println("Result: " + res);
	}
}
