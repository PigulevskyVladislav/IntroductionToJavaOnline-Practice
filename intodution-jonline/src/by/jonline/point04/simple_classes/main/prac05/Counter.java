package by.jonline.point04.simple_classes.main.prac05;

import java.util.Random;

public class Counter {

	private int value;
	private int upper_lim;
	private int lower_lim;
	
	public Counter(boolean isRand, int low_lim, int up_lim) {
		
		upper_lim = up_lim;
		lower_lim = low_lim > up_lim ? up_lim - 1 : low_lim;
		if(isRand) {
			
			Random r = new Random();
			value = r.nextInt(upper_lim - lower_lim) + lower_lim;
		} else {
			
			value = lower_lim;
		}
	}
	
	public void Increase() {
		
		value += value == upper_lim ? 0 : 1;
	}
	
	public void Reduce() {
		
		value -= value == lower_lim ? 0 : 1;
	}
	
	public int getState() {
		
		return value;
	}
	
	
}
