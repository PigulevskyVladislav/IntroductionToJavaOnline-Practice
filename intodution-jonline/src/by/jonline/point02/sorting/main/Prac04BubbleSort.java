package by.jonline.point02.sorting.main;

public class Prac04BubbleSort {

	public static void main(String args[]) {
		
		//
		// no sense to sort this sequence
		//
		
		int[] a = {5, 9, 12, 16, 21, 35, 36, 38, 50, 99};
		int val;
		
		System.out.println("Original: ");
		for(int i = 0; i < a.length; i++) {
			
			System.out.print(" " + a[i]);
		}
		System.out.println();
		for(int j = 0; j < a.length; j++) {
			
			for(int i = 0; i < a.length - 1; i++) {
			
				if(a[i] < a[i + 1]) {
					
					val = a[i];
					a[i] = a[i + 1];
					a[i + 1] = val;
				}
			}
		}
		System.out.println("Result: ");
		for(int i = 0; i < a.length; i++) {
			
			System.out.print(" " + a[i]);
		}
		System.out.println();
	}
}
