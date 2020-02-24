package by.jonline.point02.decomposition.main;

import java.util.Scanner;

public class Prac17 {

	public static void main(String args[]) {
		
		int n, cnt = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter N: ");
		n = s.nextInt();
		s.close();
		
		cnt = ComeGetNum(n, cnt);
		System.out.println("Result: " + cnt);
	}
	
	private static int ComeGetNum(int num, int cnt) {
		
		char[] ch_nums;
		
		ch_nums = (Integer.toString(num)).toCharArray();
		for(int i = 0; i < ch_nums.length; i++) {
			
			num -= Character.getNumericValue(ch_nums[i]);
		}
		cnt++;
		if(num != 0) {
			
			cnt = ComeGetNum(num, cnt);
		}
		
		return cnt;
	}
}
