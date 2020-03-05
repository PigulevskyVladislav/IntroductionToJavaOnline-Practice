package by.jonline.point03.string_as_array.main;

import java.util.Arrays;

public class Prac01 {

	public static void main(String args[]) {
		
		String[] varNames = {"BigBoy", "TurnOn", "TurnOff", "IsBig", "IsCategoryA"};
		
		System.out.println("Original: ");
		System.out.println(Arrays.toString(varNames));
		
		System.out.println("Result: ");
		for(int i = 0; i < varNames.length; i++) {
			
			varNames[i] = ToSnakeCase(varNames[i]);
		}
		System.out.println(Arrays.toString(varNames));
	}
	
	private static String ToSnakeCase(String str) {
		
		char[] ch_str = str.toCharArray();
		char[] result;
		int lng = str.length();
		
		for(int i = 1; i < ch_str.length; i++) {
			
			if(Character.isUpperCase(ch_str[i]))
				lng++;
		}
		
		result = new char[lng];
		int j = 1;
		
		result[0] = Character.toLowerCase(ch_str[0]);
		for(int i = 1; i < ch_str.length; i++, j++) {
			
			if(Character.isUpperCase(ch_str[i])) {
				
				result[j] = '_';
				j++;
				result[j] = Character.toLowerCase(ch_str[i]);
			} else {
				
				result[j] = ch_str[i];
			}
		}
		str = new String(result);
		
		return str;
	}
}
