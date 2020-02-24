package by.jonline.point02.decomposition.main;

import java.util.Scanner;

public class Prac14 {

	public static void main(String args[]) {
		
		int k;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter K: ");
		k = s.nextInt();
		s.close();
		
		System.out.println("Result: ");
		for(int i = 1; i < k; i++) {
			
			if(IsArmstgNum(i)) {
				
				System.out.print(" " + i);
			}
		}
		System.out.println();
	}
	
	private static boolean IsArmstgNum(int k) {
		
		int sum = 0;
		char[] ch_nums;
		
		ch_nums = (Integer.toString(k)).toCharArray();
		for(int i = 0; i < ch_nums.length; i++) {
			
			sum += Character.getNumericValue(ch_nums[i]);
		}
		
		return k == Math.pow(sum, ch_nums.length);
	}
}
