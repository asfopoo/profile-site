package modelTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import entity.Area;
import entity.Item;
import entity.LocationType;
import model.Game;

public class ModelTests {
	Game model = new Game();
	public ArrayList<Item> houseItems = new ArrayList<Item>();
	private LocationType start;
	
	
	
	private Area area = new Area(start, houseItems);
	private Item one;
	private Item two;
	
	private String first = "1";
	
	
	@Before
	public void setUp() {
		model.houseItems.add(one);
		model.houseItems.add(two);
		model.setLocation(start, houseItems);
		model.setChoice(first);
		
	}
	
	@Test
	public void testHouseItems() {
		assertEquals(2, model.houseItems.size());
		assertEquals(one, model.houseItems.get(0));
		assertEquals(two, model.houseItems.get(1));
	}
	
	@Test
	public void testArea() {
		assertEquals(start, model.getLocation().getLocationType());
		assertEquals(true, model.getItems(area).isEmpty()); /// needs implemented to get to array list
	}
	
	@Test
	public void testFirstChoice() {
		assertEquals("1", model.getChoice());
	}
}
