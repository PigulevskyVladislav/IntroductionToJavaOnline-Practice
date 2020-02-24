package by.jonline.point02.multidimensional_arrays.main;

import java.util.Scanner;
import java.util.Random;

public class Prac14 {

	public static void main(String args[]) {
		
		int[][] a;
		int[] cnt_of_ones_left;
		int m, n;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter M: ");
		m = s.nextInt();
		System.out.println("Enter N: ");
		n = s.nextInt();
		a = new int[m][n];
		cnt_of_ones_left = new int[n];
		s.close();
		
		if(m < n) {
			
			System.out.println("M must be less than or equal to N");
		} else {
			
			for(int i = 0; i < n; i++) {
				
				cnt_of_ones_left[i] = i + 1;
			}
			
			for(int i = 0; i < a.length; i++) {
				
				for(int j = 0; j < a[0].length; j++) {
					
					if(cnt_of_ones_left[j] > 0) {
						
						if(n + (m - n) - i == cnt_of_ones_left[j]) {
							
							a[i][j] = 1;
						} else {
							
							a[i][j] = new Random().nextInt(2);
						}
						if(a[i][j] == 1) cnt_of_ones_left[j]--;
					}
					System.out.print(" " + a[i][j]);
				}
				System.out.println();
			}
		}
	}
}
