package modelTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import entity.Area;
import entity.Item;
import entity.LocationType;
import gamePersist.DatabaseProvider;
import gamePersist.DerbyDatabase;
import gamePersist.IDatabase;
import model.Game;


public class ControllerTests {
	
	private IDatabase db = null;
	private Item lighter;
	

	
	//setup
	
	@Before
	public void setUp() throws Exception {
		DatabaseProvider.setInstance(new DerbyDatabase()); // some of this code taken from lab 06 and library example-- CITING
		 db = DatabaseProvider.getInstance();
	}
	
	
	
	@Test
	public void testAddItem(Item item) { 
		///ummmm.. how do i test this
	}
	@Test
	public void testRemoveItem(Item item) {
		//// and this
	}


}
