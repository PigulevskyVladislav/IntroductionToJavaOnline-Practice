package by.jonline.point02.sorting.main;

public class Prac05InsertionSort {

	public static void main(String args[]) {
		
		//
		// no sense to sort this sequence
		//
		
		int[] a = {5, 9, 12, 16, 21, 35, 36, 38, 50, 99};
		int[] b = new int[a.length];
		
		System.out.println("Original: ");
		for(int i = 0; i < a.length; i++) {
			
			System.out.print(" " + a[i]);
		}
		System.out.println();
		b[0] = a[0];
		for(int i = 1; i < a.length; i++) {
			
			BinarySearch_Swap(b, a[i], i - 1);
		}
		System.out.println("Result: ");
		for(int i = 0; i < b.length; i++) {
			
			System.out.print(" " + b[i]);
		}
		System.out.println();
	}
	
	private static void BinarySearch_Swap(int[] arr, int val, int end) {
		
		int start_lim = 0;
		int end_lim = end;
		while (val < arr[end_lim] && val > arr[start_lim]) {
			
			end_lim--;
			start_lim++;
		}
		if(val > arr[end]) {
			
			if(end_lim == end) {
				
				arr[end + 1] = val;
			} else {
				
				for(int i = end; i >= end_lim; i--) {
					
					arr[i + 1] = arr[i];
				}
				while(end_lim > 0 && val < arr[end_lim - 1]) {
					
					arr[end_lim] = arr[end_lim - 1];
					end_lim--;
				}
				arr[end_lim] = val;
			}
		} else {
			
			for(int i = end; i >= start_lim; i--) {
				
				arr[i + 1] = arr[i];
			}
			arr[start_lim] = val;
		}
	}
}
