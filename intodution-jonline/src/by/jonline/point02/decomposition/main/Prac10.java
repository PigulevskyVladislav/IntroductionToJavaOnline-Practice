package by.jonline.point02.decomposition.main;

import java.util.Scanner;

public class Prac10 {

	public static void main(String args[]) {
		
		int n;
		int[] nums;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter N:");
		n = s.nextInt();
		s.close();
		
		nums = GetNumbers(n);
		System.out.println("Array of numbers:");
		for(int i = 0; i < nums.length; i++) {
			
			System.out.print(" " + nums[i]);
		}
		System.out.println();
	}
	
	private static int[] GetNumbers(int n) {
		
		int[] nums;
		char[] ch_nums;
		
		ch_nums = (Integer.toString(n)).toCharArray();
		nums = new int[ch_nums.length];
		for(int i = 0; i < nums.length; i++) {
			
			nums[i] = Character.getNumericValue(ch_nums[i]);
		}
		
		return nums;
	}
}
