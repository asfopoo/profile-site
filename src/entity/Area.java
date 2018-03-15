package entity;

import java.util.ArrayList;


//
public class Area {

	private LocationType locationType;
	private ArrayList<Item> items = new ArrayList<Item>();
	
	
	public Area(LocationType locationType, ArrayList<Item> items) {
		this.locationType = locationType;
		
	}
	
	private void setLocationType(LocationType locationType) {
		this.locationType = locationType;
	}
	
	public LocationType getLocationType() {
		return locationType;
	}
	
	public void addItem(Item item) {
		items.add(item);
		
	}
	

}	

