package by.jonline.point03.string_as_sbuilder.main;

public class Prac04 {

	public static void main(String args[]) {
		
		String text = "тинформатика";
		String t, o, r;
		String result;
		
		System.out.println("Original: ");
		System.out.println(text);
		t = GetLetter(text, 'т');
		o = GetLetter(text, 'о');
		r = GetLetter(text, 'р');
		result = t.concat(o.concat(r.concat(t)));
		System.out.println("Result: ");
		System.out.println(result);
		
	}
	
	private static String GetLetter(String text, char ltr) {
		
		StringBuilder sb = new StringBuilder(text);
		for(int i = 0; i < sb.length(); i++) {
			
			if(sb.charAt(i) == ltr) {
				
				return String.copyValueOf(text.toCharArray(), i, 1);
			}
		}
		
		return "";
	}
}
