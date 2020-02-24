package by.jonline.point02.decomposition.main;

import java.util.Scanner;

public class Prac02 {

	public static void main(String args[]) {
		
		int a, b, c, d, scf;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter A:");
		a = s.nextInt();
		System.out.println("Enter B:");
		b = s.nextInt();
		System.out.println("Enter C:");
		c = s.nextInt();
		System.out.println("Enter D:");
		d = s.nextInt();
		s.close();
		
		scf = GetSCF(a, b, c, d);
		if(scf != -1) {
			
			System.out.print("SMF = " + scf + "\n");
		} else {
			
			System.out.println("SMF = 1");
		}
	}
	
	private static int GetSCF(int a, int b, int c, int d) {
		
		int max = a > b ? a : b;
		for(int i = max - 1; i > 1; i--) {
			
			if(a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
				
				return i;
			}
		}
		
		return -1;
	}
}
