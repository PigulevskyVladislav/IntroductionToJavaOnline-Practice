package by.jonline.point02.multidimensional_arrays.main;

public class Prac09 {

	public static void main(String args[]) {
	
		int[][] a = {{1, 7, 3, 2, 7}, 
			     	 {4, 5, 6, 7, 1}, 
			     	 {7, 8, 9, 1, 3}};
		int[] sum_a = new int[a[0].length];
		int max = -Integer.MAX_VALUE;
		
		System.out.println("Original matrix: ");
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[0].length; j++) {
				
				System.out.print(" " + a[i][j]);
				sum_a[j] += a[i][j];
			}
			System.out.println();
		}
		System.out.println("Sum of columns: ");
		for(int j = 0; j < sum_a.length; j++) {
			
			System.out.print(" " + sum_a[j]);
			max = sum_a[j] > max ? sum_a[j] : max;
		}
		System.out.println("\nMax element of sum of columns: " + max);
	}
}
