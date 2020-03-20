package by.jonline.point04.composition.main;

import by.jonline.point04.composition.main.prac02.Car;
import by.jonline.point04.composition.main.prac02.Engine;
import by.jonline.point04.composition.main.prac02.Wheel;

public class Prac02 {

	public static void main(String args[]) {
		
		//Creating wheels
		Wheel w1 = new Wheel("MATADOR MPS-530", 15, 6, 195);
		Wheel w2 = new Wheel("MATADOR MPS-530", 15, 6, 195);
		Wheel w3 = new Wheel("MATADOR MPS-530", 15, 6, 195);
		Wheel w4 = new Wheel("MATADOR MPS-530", 15, 6, 195);
		
		//Creating an engie
		Engine eng = new Engine("W168");
		
		//Creating car
		Car car = new Car("Lada", w1, w2, w3, w4, eng);
		
		System.out.println("There we have a car "
				+ "which brand is '" + car.getBrand() + "'.");
		System.out.println("The car has four wheels and an engine.");
		System.out.println("Let's try to drive.");
		System.out.println(car.Go());
		System.out.println("Let's fill the car.");
		System.out.println(car.Fill());
		System.out.println("Let's fill the car again.");
		System.out.println(car.Fill());
		System.out.println("Now we can drive.");
		System.out.println(car.Go());
		System.out.println("Let's try to change the left back wheel.");
		Wheel wheel = new Wheel("MATADOR MPS-530", 15, 6, 195);
		System.out.println(car.ChangeWheel(wheel, "left back"));
		System.out.println("We need to stop so let's do it!");
		System.out.println(car.Stop());
		System.out.println("Now we can change the left back wheel.");
		System.out.println(car.ChangeWheel(wheel, "left back"));
		
	}
}
