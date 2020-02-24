package by.jonline.point02.sorting.main;

public class Prac06ShellSoet {

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
		for(int i = a.length + 1; i > 0; i--) {
			
			for(int j = i; j < a.length; j++) {
				
				if(a[j] < a[j - i]) {
					
					val = a[j];
					a[j] = a[j - i];
					a[j - i] = val;
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
