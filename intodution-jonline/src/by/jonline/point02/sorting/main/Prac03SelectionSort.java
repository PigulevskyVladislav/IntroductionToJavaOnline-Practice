package by.jonline.point02.sorting.main;

public class Prac03SelectionSort {

	public static void main(String args[]) {
		
		int[] a = {5, 9, 12, 16, 21, 35, 36, 38, 50, 99};
		int val, max_index = 0, max = -Integer.MAX_VALUE;
		System.out.println("Original: ");
		for(int i = 0; i < a.length; i++) {
			
			System.out.print(" " + a[i]);
		}
		System.out.println();
		
		for(int j = 0; j < a.length; j++) {
			
			for(int i = j; i < a.length; i++) {
				
				if(a[i] > max) {
					
					max = a[i];
					max_index = i;
				}
			}
			val = a[j];
			a[j] = max;
			a[max_index] = val;
			
			max_index = 0;
			max = -Integer.MAX_VALUE;
		}
		
		System.out.println("Result: ");
		for(int i = 0; i < a.length; i++) {
			
			System.out.print(" " + a[i]);
		}
		System.out.println();
	}
}
