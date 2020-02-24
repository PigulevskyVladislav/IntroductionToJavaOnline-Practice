package by.jonline.point02.one_dimensional_arrays.main;

import java.util.Scanner;

public class Prac03 {
	
	public static void main(String args[]) {
		
		double a[];
		int n, cnt_zero = 0, cnt_negative = 0, cnt_positive = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter N: ");
		n = s.nextInt();
		a = new double[n];
		for (int i = 0; i < n; i++) {
			
			System.out.println("Enter a[" + (i + 1) + "] element: ");
			a[i] = s.nextDouble();
			
			if(a[i] > 0) {
				
				cnt_positive++;
			} else if(a[i] < 0) {
				
				cnt_negative++;
			} else {
				
				cnt_zero++;
			}
		}
		s.close();
		
		System.out.println("The count of numbers: ");
		System.out.println(cnt_positive + " positive;");
		System.out.println(cnt_negative + " negative;");
		System.out.println(cnt_zero + " zero.");
	}
}
