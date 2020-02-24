package by.jonline.point02.decomposition.main;

import java.util.Scanner;

public class Prac01 {

	public static void main(String args[]) {
		
		int a, b, scf, lcm;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter A:");
		a = s.nextInt();
		System.out.println("Enter B:");
		b = s.nextInt();
		s.close();
		
		scf = GetSCF(a, b);
		if(scf != -1) {
			
			lcm = GetLCM(a, b, scf);
			System.out.print("SMF = " + scf + "\n");
			System.out.print("LCM = " + lcm + "\n");
		} else {
			
			System.out.println("SMF = 1");
		}
	}
	
	private static int GetSCF(int a, int b) {
		
		int max = a > b ? a : b;
		for(int i = max - 1; i > 1; i--) {
			
			if(a % i == 0 && b % i == 0) {
				
				return i;
			}
		}
		
		return -1;
	}
	
	private static int GetLCM(int a, int b, int smf) {
		
		return (a * b) / smf;
	}
}
