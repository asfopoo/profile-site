package JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import entity.Area;
import entity.Item;
import entity.LocationType;
import gamePersist.DatabaseProvider;
import gamePersist.DerbyDatabase;
import gamePersist.IDatabase;
import model.Game;


public class ControllerTest {
	
	private IDatabase db = null;
	ArrayList<Item> items = null;
	ArrayList<Area> areas = null;
	private Item lighter = new Item(2, "greenLighter", "utility");
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	@Before
	public void setUp() throws Exception {
		DatabaseProvider.setInstance(new DerbyDatabase()); // some of this code taken from lab 06 and library example-- CITING
		 db = DatabaseProvider.getInstance();
	}
	@After
	public void tearDown() throws Exception {
	}

	
	
	@Test
	public void testInsertUserItem(int size, String name, String type) { 
		
		//db.insertUserItem(2, "greenLighter", "utility");
	}
	@Test
	public void testRemoveItem(int size, String name, String type) {
		
	}
	@Test
	public void testAddArea() {
		
	}
	@Test 
	public void testGetArea() {
		
	}
	@Test
	public void testGetNextArea() {
		
	}
	@Test
	public void testRegisterAccount() {
		
	}
	@Test
	public void testAccountExists() {
		
	}
	
	


}
