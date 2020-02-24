package by.jonline.point02.decomposition.main;

import java.util.Scanner;

public class Prac04 {

	public static void main(String args[]) {
		
		int[] a, pop;
		int n;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter n:");
		n = s.nextInt();
		a = new int[2 * n];
		pop = new int[4];
		for(int i = 0; i < a.length; i += 2) {
			
			System.out.println("Enter x" + (i / 2 + 1));
			a[i] = s.nextInt();
			System.out.println("Enter y" + (i / 2 + 1));
			a[i + 1] = s.nextInt();
		}
		s.close();
		
		pop = GetPairOfMaxDist(a, n);
		
		System.out.println("Max distance between point (" + pop[0] + "," + pop[1] + ")"
				+ " and point (" + pop[2] + "," + pop[3] + ")");
	}
	
	private static int[] GetPairOfMaxDist(int[] a, int n) {
		
		double val, max = -Double.MAX_VALUE;
		int[] pair = new int[4];
		
		for(int i = 0; i < a.length; i += 2) {
			
			for(int j = 0; j < a.length; j += 2) {
				
				val = Math.sqrt(Math.pow(a[j] - a[i], 2) + Math.pow(a[j + 1] - a[i + 1], 2));
				if(val > max) {
					
					max = val;
					pair[0] = a[i];
					pair[1] = a[i + 1];
					pair[2] = a[j];
					pair[3] = a[j + 1];
				}
			}
		}
		
		return pair;
	}
}
