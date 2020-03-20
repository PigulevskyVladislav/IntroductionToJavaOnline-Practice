package by.jonline.point04.composition.main.prac03;

import java.util.ArrayList;
import java.util.Iterator;

public class City implements Iterable<Area> {

	private final ArrayList<Area> areas;
	private String name;
	private int square;
	
	{
		areas = new ArrayList<>();
		square = 0;
	}
	
	public City(String name) {
		
		this.name = name;
	}
	
	@Override
	
	public Iterator<Area> iterator() {
		
		return areas.iterator();
	}
	
	public void add(Area area) {
		
		areas.add(area);
		square += area.getSquare();
	}
	
	public String getName() {
		
		return name;
	}
	
	public int gerSquare() {
		
		return square;
	}
}
