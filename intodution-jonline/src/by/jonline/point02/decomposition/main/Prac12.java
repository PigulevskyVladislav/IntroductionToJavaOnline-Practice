package by.jonline.point02.decomposition.main;

import java.util.Scanner;

public class Prac12 {

	public static void main(String args[]) {
		
		int n, k;
		int[] a;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter K:");
		k = s.nextInt();
		System.out.println("Enter N:");
		n = s.nextInt();
		s.close();
		
		a = new int[GetArrLngth(n, k)];
		FillArr(a, n, k);
		System.out.println("Final array: ");
		for(int i = 0; i < a.length; i++) {
			
			System.out.print(" " + a[i]);
		}
		System.out.println();
	}
	
	private static int GetArrLngth(int n, int k) {
		
		int lng = 0, sum = 0;
		boolean isEqualN = false;
		
		for(int i = 0; sum < k; i++) {
			
			if(i + 1 > n) {
				
				isEqualN = true;
				break;
			}
			sum += i + 1;
			lng++;
		}
		if(isEqualN) {
			
			lng += (k - sum) / n;
		}
		lng++;
		
		return lng;
	}
	
	private static void FillArr(int[] a, int n, int k) {
		
		int i, sum = 0;
		boolean isEqualN = false;
		
		for(i = 0; sum < k; i++) {
			
			if(i + 1 > n) {
				
				isEqualN = true;
				break;
			}
			sum += i + 1;
			a[i] = i + 1;
		}
		if(isEqualN) {
			
			int cnt_n;
			
			cnt_n = (k - sum) / n;
			for(int j = 0; j < cnt_n; i++, j++) {
				
				sum += n;
				a[i] = n;
			}
		}
		a[i] = k - sum;
	}
}
