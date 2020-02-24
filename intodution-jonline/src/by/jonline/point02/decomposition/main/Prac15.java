package by.jonline.point02.decomposition.main;

import java.util.Scanner;

public class Prac15 {

	public static void main(String args[]) {
		
		int n, min, max;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter N: ");
		n = s.nextInt();
		s.close();
		
		min = GetMin(n);
		max = GetMax(min);
		System.out.println("Result: ");
		for(int i = min; i <= max; i++) {
			
			if(IsIncSecNum(i)) {
				
				System.out.println(i);
			}
		}
	}
	
	private static int GetMin(int n) {
		
		int min = 1;
		
		for(int i = 1; i < n; i++) {
			
			min *= 10;
		}
		
		return min;
	}
	
	private static int GetMax(int min) {
		
		return min * 10 - 1;
	}
	
	private static boolean IsIncSecNum(int num) {
		
		char[] ch_nums;
		
		ch_nums = (Integer.toString(num)).toCharArray();
		for(int i = 1; i < ch_nums.length; i++) {
			
			if(ch_nums[i] - 1 != ch_nums[i - 1]) {
				
				return false;
			}
		}
		
		return true;
	}
}
