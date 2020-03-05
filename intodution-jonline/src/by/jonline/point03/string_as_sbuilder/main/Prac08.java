package by.jonline.point03.string_as_sbuilder.main;

import java.util.Scanner;

public class Prac08 {

	public static void main(String args[]) {
		
		String text;
		Scanner s = new Scanner(System.in);
		int result;
		
		System.out.println("Input text: ");
		text = s.nextLine();
		s.close();
		
		result = GetMaxLng(text);
		System.out.println("Result: ");
		if(result != -1) {
			
			System.out.println(result);
		} else {
			
			System.out.println("Not processed!");
		}
		
	}
	
	private static int GetMaxLng(String text) {
		
		StringBuilder sb = new StringBuilder(text);
		int lng_max = -Integer.MAX_VALUE, lng = 0;
		boolean isNotFirstMax = false;
		
		for(int i = 0; i < sb.length(); i++) {
			
			if(sb.charAt(i) != ' ') {
				
				while(i < sb.length() && sb.charAt(i) != ' ') {
					
					lng++;
					i++;
				}
				if(lng_max < lng) {
					
					lng_max = lng;
					isNotFirstMax = false;
				} else if(lng_max == lng) {
					
					isNotFirstMax = true;
				}
				lng = 0;
			}
		}
		
		return isNotFirstMax ? -1 : lng_max;
	}
}
