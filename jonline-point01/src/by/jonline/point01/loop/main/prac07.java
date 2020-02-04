package by.jonline.point01.loop.main;

import java.util.Scanner;

public class prac07 {
	
	public static void main(String args[]) {
		
		int n, m;
		boolean isEmpty = true;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		n = s.nextInt();
		System.out.println("Enter m: ");
		m = s.nextInt();
		s.close();
		
		for(int i = n; i <= m; i++) {
			
			System.out.print("For number " + i + " Deviders: ");
			for(int j = 2; j < i; j++) {
				
				if(i % j == 0) {
					
					System.out.print(j + " ");
					isEmpty = false;
				}
			}
			if(isEmpty) {
				
				System.out.print("-");
			}
			
			isEmpty = true;
			System.out.println();
		}
	}
}
