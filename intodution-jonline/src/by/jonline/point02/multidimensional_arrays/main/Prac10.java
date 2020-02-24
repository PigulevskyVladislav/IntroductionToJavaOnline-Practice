package by.jonline.point02.multidimensional_arrays.main;

public class Prac10 {

	public static void main(String args[]) {
		
		int[][] a = {{1, 7, 3, -2, 7}, 
		         	 {4, -5, 6, 7, 1},
		         	 {-4, 5, 6, 7, 1},
		         	 {4, 5, 6, -7, 1},
		         	 {7, 8, 9, -1, 3}};
		
		System.out.println("Original matrix: ");
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[0].length; j++) {
				
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
		System.out.println("Positive members of main diagonal of matrix: ");
		for(int j = 0; j < a.length; j++) {
			
			if(a[j][j] > 0) {
				
				System.out.print(" " + a[j][j]);
			}
		}
	}
}
