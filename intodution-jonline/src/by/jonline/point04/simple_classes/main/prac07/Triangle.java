package by.jonline.point04.simple_classes.main.prac07;

public class Triangle {

	private int ax;
	private int ay;
	private int bx;
	private int by;
	private int cx;
	private int cy;
	
	public Triangle(int ax, int ay, int bx,
			int by, int cx, int cy) {
		
		this.ax = ax;
		this.ay = ay;
		this.bx = bx;
		this.by = by;
		this.cx = cx;
		this.cy = cy;
	}
	
	public Triangle() {
		
		this.ax = 1;
		this.ay = 1;
		this.bx = 2;
		this.by = 3;
		this.cx = 3;
		this.cy = 2;
	}
	
	public double Perimeter() {
		
		return getSideLength(ax, ay, bx, by)
				+ getSideLength(bx, by, cx, cy)
				+ getSideLength(cx, cy, ax, ay);
	}
	
	public double Area() {
		
		return Math.abs((((ax - cx) * (by - cy)) - ((bx - cx) * (ay - cy))) / 2);
	}
	
	public int[] IntrPointMedians() {
		
		int[] result = new int[2];
		
		//Get x
		result[0] = (ax + bx + cx) / 3;
		//Get y
		result[1] = (ay + by + cy) / 3;
		
		return result;
	}
	
	private double getSideLength(int ax, 
			int ay, int bx, int by) {
		
		return Math.sqrt(Math.pow(bx - ax, 2) + Math.pow(by - by, 2));
	}
}
