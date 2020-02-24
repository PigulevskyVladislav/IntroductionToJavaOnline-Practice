package by.jonline.point02.decomposition.main;

import java.util.Scanner;

public class Prac16 {

	public static void main(String args[]) {
		
		int n, min, max, cnt_e;
		long sum;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter N: ");
		n = s.nextInt();
		s.close();
		
		min = GetMin(n);
		max = GetMax(min);
		sum = GetSumOfOdds(min, max);
		System.out.println("Sum = " + sum);
		cnt_e = GetEvenCnt(min, max);
		System.out.println("Count of even numbers: " + cnt_e);
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
	
	private static int GetEvenCnt(int min, int max) {
		
		return (max + 1 - min) / 2;
	}
	
	private static long GetSumOfOdds(int min, int max) {
		
		long sum = 0;
		min = min == 1 ? 0 : min;
		
		for(int i = min + 1; i <= max; i += 2) {
			
			sum += i;
		}
		
		return sum;
	}
}
