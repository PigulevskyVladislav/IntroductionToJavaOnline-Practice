package by.jonline.point02.one_dimensional_arrays.main;

import java.util.Scanner;

public class Prac09 {

	public static void main(String args[]) {
		
		int a[], unique_value_array[], count_array[];
		int max_count = -Integer.MAX_VALUE, min_value = Integer.MAX_VALUE;
		int n, lngth = 1;
		boolean isNewValue = true;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the length of array: ");
		n = s.nextInt();
		a = new int[n];
		count_array = new int[n];
		unique_value_array = new int[n];
		for (int i = 0; i < n; i++) {
			
			System.out.println("Enter a[" + (i + 1) + "] element: ");
			a[i] = s.nextInt();
		}
		s.close();
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < lngth; j++) {
				
				if(a[i] == unique_value_array[j]) {
					
					count_array[j]++;
					isNewValue = false;
					break;
				}
			}
			if(isNewValue) {
				
				unique_value_array[lngth - 1] = a[i];
				count_array[lngth - 1] = 1;
				lngth++;
			} else isNewValue = true;
		}
				
		for (int i = 0; i < lngth - 1; i++) {
	
			max_count = count_array[i] > max_count ? count_array[i] : max_count;
		}
		for (int i = 0; i < lngth - 1; i++) {
			
			if(count_array[i] == max_count) {
				
				min_value = unique_value_array[i] < min_value ? unique_value_array[i] : min_value;
			}
		}
		
		System.out.println("Result: " + min_value);
	}
}
