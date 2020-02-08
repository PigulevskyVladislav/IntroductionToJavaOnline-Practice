package by.jonline.point01.loop.main;

import java.util.Scanner;

public class Prac08 {
	
	public static void main(String args[]) {
		
		int a, b, index;
		boolean check[] = new boolean[10];
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		a = s.nextInt();
		System.out.println("Enter second number: ");
		b = s.nextInt();
		s.close();
		
		char chars_a[] = ("" + a).toCharArray();
		char chars_b[] = ("" + b).toCharArray();
		
		for(int i = 0; i < chars_a.length; i++) {
			
			index = GetIndex(i, chars_a);
			if(check[index] == false) {
				
				check[index] = true;
			}
		}
		
		for(int i = 0; i < chars_b.length; i++) {
			
			index = GetIndex(i, chars_b);
			if(check[index] == false) {
				
				check[index] = true;
			}
		}
		
		System.out.print("Incoming numbers: ");
		for(int i = 0; i < check.length; i++) {
			
			if(check[i]) {
				System.out.print(i + " ");
			}
		}
	}
	
	private static int GetIndex(int i, char chars[]) {
		
		return Character.getNumericValue(chars[i]);
	}
}
