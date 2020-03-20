package by.jonline.point04.simple_classes.main.prac03;

public class Student {

	private String full_name;
	private int group_num;
	private int[] perform;
	
	public Student(String name, int gr_num, int[] perfm) {
		
		full_name = name;
		group_num = gr_num;
		perform = perfm;
	}
	
	public int[] getPerform() {
		
		return perform;
	}
	
	@Override
	public String toString() {
		
		return "Full name: " + full_name
			+ "\nGroup: " + group_num;	
	}
}
