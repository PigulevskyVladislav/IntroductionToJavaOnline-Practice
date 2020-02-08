package by.jonline.point01.loop.main;

import java.util.Scanner;

public class Prac01 {

	public static void main(String args[]) {
		
		int sum = 0, num;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter positive number: ");
		num = s.nextInt();
		s.close();
		
		for	(int i = 1; i <= num; i++) {
			
			sum += i;
		}
		System.out.println("Result: " + sum);
	}
}
