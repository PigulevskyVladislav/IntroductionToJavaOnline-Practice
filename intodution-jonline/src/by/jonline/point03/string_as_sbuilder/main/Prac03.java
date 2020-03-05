package by.jonline.point03.string_as_sbuilder.main;

public class Prac03 {

	public static void main(String args[]) {
		
		String text = "abcdcba";
		
		IsPalindrome("original", text);
		
		text = "abcaba";

		IsPalindrome("original_2", text);
	}
	
	private static void IsPalindrome(String name, String text) {
		
		StringBuilder sb = new StringBuilder(text);
		boolean isPalindrome = true;
		
		System.out.println(name + ": ");
		System.out.println(sb);
		
		for(int i = 0; i < sb.length() / 2; i++) {
			
			if(sb.charAt(i) != sb.charAt(sb.length() - 1 - i)) {
				
				isPalindrome = false;
			}
		}
		System.out.println("Is " + name + " palindrome? ");
		System.out.println(isPalindrome + "\n");
	}
}
