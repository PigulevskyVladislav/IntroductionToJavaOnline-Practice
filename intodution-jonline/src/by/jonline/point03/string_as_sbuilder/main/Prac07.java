package by.jonline.point03.string_as_sbuilder.main;

import java.util.Scanner;

public class Prac07 {

	public static void main(String args[]) {
		
		String text;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Input text: ");
		text = s.nextLine();
		s.close();
		
		System.out.println("Result: ");
		System.out.println(RemoveExcess(text));
	}
	
	private static String RemoveExcess(String text) {
		
		StringBuilder result = new StringBuilder();
		StringBuilder sb = new StringBuilder(text);
		char val;
		
		for(int i = 0; i < sb.length(); i++) {
			
			val = sb.charAt(i);
			if(val != ' ' && !IsConsist(result, val)) {
				
				result.insert(result.length(), val);
			}
		}
		
		return new String(result);
	}
	
	private static boolean IsConsist(StringBuilder result, char val) {
		
		for(int i = 0; i < result.length(); i++) {
			
			if(result.charAt(i) == val)
				return true;
		}
		
		return false;
	}
}
