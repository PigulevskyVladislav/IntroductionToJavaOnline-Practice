package by.jonline.point03.string_as_sbuilder.main;

public class Prac09 {

	public static void main(String args[]) {
		
		String text = "Русские буквы. English charactersSsSs. "
				+ "()()(21343#$%61!|/| engLLLS";
		StringBuilder sb = new StringBuilder(text);
		int lcase = 0, ucase = 0;
		char val;
		
		System.out.println("Original: ");
		System.out.println(text);
		for(int i = 0; i < sb.length(); i++) {
			
			val = sb.charAt(i);
			if((val >= 'A' && val <= 'Z')) {
				
				ucase++;
			} else if(val >= 'a' && val <= 'z') {
				
				lcase++;
			}
		}
		System.out.println("Result: ");
		System.out.println(" upperCase: " + ucase);
		System.out.println(" lowerCase: " + lcase);
	}
}
