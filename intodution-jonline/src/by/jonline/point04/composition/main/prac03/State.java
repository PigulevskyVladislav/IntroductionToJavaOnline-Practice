package by.jonline.point04.composition.main.prac03;

import java.util.ArrayList;
import java.util.Iterator;

public class State implements Iterable<Region>{

	private final ArrayList<Region> regions;
	private City capital;
	private String name;
	private int square;
	
	{
		regions = new ArrayList<>();
		square = 0;
	}
	
	public State(String name, City capital) {
		
		this.capital = capital;
		this.name = name;
	}
	
	@Override
	public Iterator<Region> iterator() {
		
		return regions.iterator();
	}
	
	public void add(Region region) {
		
		regions.add(region);
		square += region.getSquare();
	}
	
	public int getSquare() {
		
		return square;
	}
	
	public City getCapital() {
		
		return capital;
	}
	
	public String getName() {
		
		return name;
	}
	
	public int getRegionCount() {
		
		return regions.size();
	}
	
	public String CenteresOfRegions() {
		
		String result = "Centeres of regions: ";
		
		for(Region reg : regions) {
			
			result += "\n" + reg.getCenter().getName();
		}
		
		return result;
	}
}
