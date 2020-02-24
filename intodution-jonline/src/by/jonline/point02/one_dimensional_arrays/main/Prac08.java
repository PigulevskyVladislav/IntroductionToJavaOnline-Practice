package by.jonline.point02.one_dimensional_arrays.main;

import java.util.Scanner;

public class Prac08 {

	public static void main(String args[]) {
		
		int a[], b[];
		int n, cnt = 0, cnt_min = 0, min = Integer.MAX_VALUE;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the length of sequence of numbers: ");
		n = s.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			
			System.out.println("Enter a[" + (i + 1) + "] element: ");
			a[i] = s.nextInt();
			
			if(a[i] < min) {
				
				min = a[i];
				cnt_min = 1;
			} else if(a[i] == min) {
				
				cnt_min++;
			}
		}
		s.close();
		
		b = new int[n - cnt_min];
		System.out.print("Result: ");
		for (int i = 0; i < n - cnt_min; i++) {
			
			if(a[i + cnt] != min) {
				
				b[i] = a[i + cnt];
				System.out.print(b[i] + " ");
			} else {
				
				cnt++;
				i--;
			}
		}
		
		
	}
}
