package by.jonline.point02.decomposition.main;

import java.util.Scanner;

public class Prac09 {

	public static void main(String args[]) {
		
		int x, y, t, z;
		double sq;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter X:");
		x = s.nextInt();
		System.out.println("Enter Y:");
		y = s.nextInt();
		System.out.println("Enter Z:");
		z = s.nextInt();
		System.out.println("Enter T:");
		t = s.nextInt();
		s.close();
		
		sq = GetSquare(x, y, z, t);
		System.out.printf("Square = %.0f %n", sq);
	}
	
	private static double GetSquare(int x, int y, int z, int t) {
		
		double hp, sq;
		hp = (x + y + z + t) / 2;
		sq = Math.sqrt((hp - x) * (hp - y) * (hp - z) * (hp - t));
		
		return sq;
	}
}
