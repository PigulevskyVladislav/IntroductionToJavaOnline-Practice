package by.jonline.point02.multidimensional_arrays.main;

public class Prac16 {

	
	public static void main(String args[]) {
		
		int[][] a = {{ 1,  2,  3,  4}, 
	         	 	 { 5,  6,  7,  8},
	         	 	 { 9, 10, 11, 12},
	         	 	 {13, 14, 15, 16}};
		int val, lng = a.length - 1;
		
		System.out.println("Original matrix: ");
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[0].length; j++) {
				
				if(a[i][j] < 10) {
					
					System.out.print(" ");
				}
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Magic square 4x4: ");
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[0].length; j++) {
				
				if(i < a.length / 2 && i != j && i + j != lng) {
					
					val = a[i][j];
					a[i][j] = a[lng - i][lng - j];
					a[lng - i][lng - j] = val;
				}
				
				if(a[i][j] < 10) {
					
					System.out.print(" ");
				}
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
	}
}
