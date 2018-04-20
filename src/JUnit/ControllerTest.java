package JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
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
	public void testInsertUserItem() { 
		
		int userInventory_id = 0;
		userInventory_id = db.insertUserItem(2, "greenLighter", "utility");
		assertNotEquals(0, userInventory_id);
		
	}
	@Test
	public void testRemoveItem() {
		
		int userInventory_id = 0;
		userInventory_id = db.removeUserItem(2, "greenLighter", "utility");
		assertEquals(0, userInventory_id);
	}
	@Test
	public void testCreateArea() throws SQLException {
		int area_id = 0;
		ArrayList<String> options = new ArrayList<String>();
		for(int i = 0; i < 13; i ++) {// array list must have 13 items in it 
			options.add("!");
		}
	
		
		area_id = db.createArea("bedroom", "para", options);
		assertNotEquals(0, area_id);
		
	}
	@Test 
	public void testGetArea() {
		
	}
	@Test
	public void testGetNextArea() {
		
	}
	@Test
	public void testRegisterAccount() throws SQLException {
		
		db.registerAccount("test", "tester", "testing@cs.com");
		assertFalse(db.registerAccount("test", "tester", "testing@cs.com")); // if account already exists returns false
		assertTrue(db.accountExist("test", "tester"));
		assertFalse(db.accountExist("wrong", "tester"));
		assertFalse(db.accountExist("test", "wrong"));
		assertFalse(db.accountExist("wrong", "wrong"));
	}
	@Test
	public void testAccountExists() throws SQLException {
		
		db.registerAccount("test", "tester", "testing@cs.com");
		assertTrue(db.accountExist("test", "tester"));
		assertFalse(db.accountExist("wrong", "tester"));
		assertFalse(db.accountExist("test", "wrong"));
		assertFalse(db.accountExist("wrong", "wrong"));
	}
	
	


}
