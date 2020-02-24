package by.jonline.point02.multidimensional_arrays.main;

public class Prac15 {
	
	public static void main(String args[]) {
		
		int[][] a = {{1, 7, 3, -2, 7}, 
		         	 {4, -5, 6, 7, 1},
		         	 {-4, 5, 6, 7, 4},
		         	 {4, 5, 6, -8, 1},
		         	 {7, 8, 9, -1, 3}};
		int max = -Integer.MAX_VALUE;
		
		System.out.println("Original matrix: ");
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[0].length; j++) {
				
				if(a[i][j] >= 0) {
					
					System.out.print(" ");
				}
				System.out.print(" " + a[i][j]);
				
				max = a[i][j] > max ? a[i][j]: max;
			}
			System.out.println();
		}
		System.out.println("Final matrix: ");
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[0].length; j++) {
				
				if(max != a[i][j] && a[i][j] % 2 != 0) {
					
					a[i][j] = max;
				}
				
				if(a[i][j] >= 0) {
					
					System.out.print(" ");
				}
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
	}
}
