package by.jonline.point04.simple_classes.main.prac01;

public class Test1 {

	private int val1 = 0;
	private int val2;
	
	public void PrintVals() {
		
		System.out.println("First value is equal: " + val1);
		System.out.println("Second value is equal: " + val2);
	}
	
	public void SetFirstVal(int val) {
		
		val1 = val;
	}
	
	public void SetSecondVal(int val) {
		
		val2 = val;
	}
	
	public int GetSum() {
		
		return val1 + val2;
	}
	
	public int GetMax() {
		
		return val1 > val2 ? val1 : val2;
	}
}
