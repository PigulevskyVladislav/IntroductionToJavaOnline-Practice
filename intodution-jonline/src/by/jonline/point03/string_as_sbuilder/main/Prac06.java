package by.jonline.point03.string_as_sbuilder.main;

public class Prac06 {

	public static void main(String args[]) {
		
		String text = "Ах, какой сегодня прекрасный день!";
		
		System.out.println("Original: " );
		System.out.println(text);
		System.out.println("Result: " );
		System.out.println(GetDoubleString(text));
	}
	
	private static String GetDoubleString(String text) {
		
		StringBuilder sb = new StringBuilder(text);
		char val;
		
		for(int i = 0; i < sb.length(); i += 2) {
			
			val = sb.charAt(i);
			sb.insert(i + 1, val);
		}
		
		return new String(sb);
	}
}
