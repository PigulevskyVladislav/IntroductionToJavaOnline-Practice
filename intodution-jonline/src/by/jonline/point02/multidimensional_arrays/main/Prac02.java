package by.jonline.point02.multidimensional_arrays.main;

public class Prac02 {

	public static void main(String args[]) {
		
		int[][] a = {{1, 7, 3, 2, 7}, 
				 	 {4, 2, 6, 7, 1}, 
				 	 {7, 8, 3, 1, 3},
				 	 {7, 8, 9, 4, 3},
				 	 {7, 8, 9, 1, 5}};
		
		System.out.println("Result: ");
		for(int i = 0; i < a.length; i++) {
			
			System.out.print(" " + a[i][i]);
		}
	}
}
