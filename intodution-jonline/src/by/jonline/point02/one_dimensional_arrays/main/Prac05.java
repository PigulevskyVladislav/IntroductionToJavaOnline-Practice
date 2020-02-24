package by.jonline.point02.one_dimensional_arrays.main;

import java.util.Scanner;

public class Prac05 {

	public static void main(String args[]) {
		
		int a[];
		int n;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the length of sequence of numbers: ");
		n = s.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			
			System.out.println("Enter a[" + (i + 1) + "] element: ");
			a[i] = s.nextInt();
		}
		s.close();
		
		System.out.print("Output: ");
		for (int i = 0; i < n; i++) {
			
			if(a[i] > i + 1) {
				
				System.out.print(a[i] + " ");
			}
		}
		System.out.println();
	}
}
