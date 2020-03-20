package by.jonline.point04.simple_classes.main.prac02;

public class Test2 {

	private int val1;
	private int val2;
	
	public Test2() {
		
		val1 = 1;
		val2 = 2;
	}
	
	public Test2(int val1, int val2) {
		
		this.val1 = val1;
		this.val2 = val2;
	}
	
	public void setFirstValue(int val) {
		
		val1 = val;
	}
	
	public void setSecondValue(int val) {
		
		val2 = val;
	}
	
	public int getFirstValue() {
		
		return val1;
	}
	
	public int getSecondValue() {
		
		return val2;
	}
}
