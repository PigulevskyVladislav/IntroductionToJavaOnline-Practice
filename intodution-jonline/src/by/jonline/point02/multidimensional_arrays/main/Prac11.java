package by.jonline.point02.multidimensional_arrays.main;

import java.util.Random;

public class Prac11 {

	public static void main(String args[]) {
		
		int[][] a = new int[10][20];
		int cnt = 0;
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[0].length; j++) {
				
				a[i][j] = new Random().nextInt(16);
				
				if(a[i][j] < 10) {
					
					System.out.print(" ");
				}
				System.out.print("  " + a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Rows, which have more than three '5' numbers: ");
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[0].length; j++) {
				
				if(a[i][j] == 5) {
					
					cnt++;
					if(cnt == 3) {
						
						System.out.print(" " + (i + 1));
					}
				}
			}
			cnt = 0;
		}
	}
}
