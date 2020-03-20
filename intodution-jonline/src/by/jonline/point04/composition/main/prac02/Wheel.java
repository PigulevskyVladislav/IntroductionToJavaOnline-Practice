package by.jonline.point04.composition.main.prac02;

public class Wheel {

	private String name;
	private int diameter;
	private int bolt_cnt;
	private double width;
	
	public Wheel(String name_, int dmtr, 
			int blt_cnt, double wdth) {
		
		name = name_;
		diameter = dmtr;
		bolt_cnt = blt_cnt;
		width = wdth;
	}
	
	public String getName() {
		
		return name;
	}
	
	public int getDiameter() {
		
		return diameter;
	}
	
	public int getCountOfBolts() {
		
		return bolt_cnt;
	}
	
	public double getWidth() {
		
		return width;
	}
}
