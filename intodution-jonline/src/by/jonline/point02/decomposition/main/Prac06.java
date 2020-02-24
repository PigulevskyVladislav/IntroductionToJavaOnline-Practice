package by.jonline.point02.decomposition.main;

import java.util.Scanner;

public class Prac06 {

	public static void main(String args[]) {
		
		int a, b, c;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter A:");
		a = s.nextInt();
		System.out.println("Enter B:");
		b = s.nextInt();
		System.out.println("Enter C:");
		c = s.nextInt();
		s.close();
		
		if(CoprimeCheck(a, b, c)) {
			
			System.out.println("Numbers are coprime.");
		} else {
			
			System.out.println("Numbers aren't coprime.");
		}
	}
	
	private static boolean CoprimeCheck(int a, int b, int c) {
		
		int min = a < b ? a : b;
		min = c < min ? c : min;
		for(int i = min; i >= 1; i--) {
			
			if(a % i == 0 && b % i == 0 && c % i == 0) {
				
				return false;
			}
		}
		
		return true;
	}
}
