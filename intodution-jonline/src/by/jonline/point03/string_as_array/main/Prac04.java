package by.jonline.point03.string_as_array.main;

public class Prac04 {

	public static void main(String args[]) {
		
		String value = "There are some numbers: 8319273."
				+ " Also there: 3123.";
		char[] ch_val = value.toCharArray();
		int num_val, cnt = 0;
		
		for(int i = 0; i < ch_val.length; i++) {
			
			num_val = Character.getNumericValue(ch_val[i]);
			if(num_val >= 0 && num_val <= 9) {
				
				cnt++;
				while(num_val >= 0 && num_val <= 9 && i < ch_val.length) {
					
					num_val = Character.getNumericValue(ch_val[i]);
				}
			}
		}
		
		System.out.println("Result: " + cnt);
	}
}
