package by.jonline.point04.composition.main.prac02;

public class Car {

	private Wheel front_left_wheel;
	private Wheel front_right_wheel;
	private Wheel back_left_wheel;
	private Wheel back_right_wheel;
	private Engine engine;
	private String brand;
	private boolean ready_to_go;
	private boolean on_the_way;
	
	{
		ready_to_go = false;
		on_the_way = false;
	}
	
	public Car(String brd, Wheel flw, Wheel frw, 
			Wheel blw, Wheel brw, Engine eng) {
		
		front_left_wheel = flw;
		front_right_wheel = frw;
		back_left_wheel = blw;
		back_right_wheel = brw;
		engine = eng;
		brand = brd;
	}
	
	public String getBrand() {
		
		return brand;
	}
	
	public String Go() {
		
		if(ready_to_go && !on_the_way) {
			
			on_the_way = true;
			return "The car starts to move.";
		} else {
			
			return GetInfo();
		}
	}
	
	public String Stop() {
		
		if(on_the_way) {
			
			ready_to_go = false;
			on_the_way = false;
			return "The car stopped.";
		} else {
			
			return GetInfo();
		}
	}
	
	public String ChangeWheel(Wheel wheel, String position) {
		
		if(!on_the_way) {
			
			switch(position) {
				case "left front": {
				
					front_left_wheel = wheel;
				} break;
				case "right front": {
				
					front_right_wheel = wheel;
				} break;
				case "left back": {
					
					back_left_wheel = wheel;
				} break;
				case "right back": {
					
					back_right_wheel = wheel;
				} break;
			}
			return position + " wheel was changed!";
		} else {
			
			return GetInfo();
		}
	}
	
	public String Fill() {
		
		if(!on_the_way && !ready_to_go) {
			
			ready_to_go = true;
			return "The car was filled";
		} else {
			
			return GetInfo();
		}
	}
	
	public String getCharasteristic() {
		
		return "Left front wheel: " + front_left_wheel.getName() 
					+ "\nRight front wheel: " + front_right_wheel.getName()
					+ "\nLeft back wheel: " + back_left_wheel.getName()
					+ "\nRight back wheel: " + back_right_wheel.getName()
					+ "\nEngine: " + engine.getName();
		
	}
	
	private String GetInfo() {
		
		String info = "Error! Info:";
		
		info += ready_to_go ? "\nThe car is refueled." : "\nNeed to refuel!";
		info += on_the_way ? "\nCar rides." : "\nCar isn't on the road.";
		
		return info + "\n";
	}
}
