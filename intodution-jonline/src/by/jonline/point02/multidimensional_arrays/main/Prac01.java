package by.jonline.point02.multidimensional_arrays.main;

public class Prac01 {
	
	public static void main(String args[]) {
		
		int[][] a = {{1, 7, 3, 2, 7}, 
					 {4, 5, 6, 7, 1}, 
					 {7, 8, 9, 1, 3}};
		boolean[] print_column_array = new boolean[a[0].length];
		
		for(int i = 1; i < a[0].length; i += 2) {
			
			if(a[0][i] > a[a.length - 1][i]) {
			
				print_column_array[i] = true;
			}
		}
		
		System.out.println("Result: ");
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 1; j < a[0].length; j += 2) {
				
				if(print_column_array[j]) {
					
					System.out.print(" " + a[i][j]);
				}
			}
			System.out.println();
		}
	}
}
