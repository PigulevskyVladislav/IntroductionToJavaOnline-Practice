package by.jonline.point04.composition.main.prac03;

import java.util.ArrayList;
import java.util.Iterator;

public class Region implements Iterable<City> {

	private final ArrayList<City> cities;
	private City center;
	private int square;
	
	{
		cities = new ArrayList<>();
		square = 0;
	}
	
	public Region(City center) {
		
		this.center = center;
		add(center);
	}
	
	@Override
	public Iterator<City> iterator() {
		
		return cities.iterator();
	}
	
	public void add(City city) {
		
		cities.add(city);
		square += city.gerSquare();
	}
	
	public City getCenter() {
		
		return center;
	}
	
	public int getSquare() {
		
		return square;
	}
}
