package by.jonline.point03.string_as_sbuilder.main;

public class Prac02 {

	public static void main(String args[]) {
		
		String text = "acd ad a";
		StringBuilder sb = new StringBuilder(text);
		
		System.out.println("Original: ");
		System.out.println(sb);
		
		for(int i = 0; i < sb.length(); i++) {
			
			if(sb.charAt(i) == 'a') {
				
				sb.insert(i + 1, 'b');
			}
		}
		System.out.println("Result: ");
		System.out.println(sb);
	}
}
