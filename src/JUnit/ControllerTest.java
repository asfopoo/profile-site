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
	public void testGetArea() throws SQLException {
		
		ArrayList<String> area = new ArrayList<String>();
		area = db.getArea("2");
		assertEquals(16, area.size());
		
	}
	@Test
	public void testGetNextArea () throws SQLException {
		ArrayList<String> area = new ArrayList<String>();
		area = db.getNextArea("2");
		assertEquals(16, area.size());
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
	@Test
	public void testGetHealthSize() throws SQLException{
		db.updateHealth(17);
		assertEquals(db.getHealthSize(), 17);
		assertNotEquals(db.getHealthSize(), 16);
		assertNotEquals(db.getHealthSize(), 18);
		assertNotEquals(db.getHealthSize(), 0);
		assertNotEquals(db.getHealthSize(), null);
		
		db.updateHealth(22);
		int health = db.getHealthSize();
		assertEquals(health, 22);
		assertNotEquals(health, 21);
		assertNotEquals(health, 23);
		assertNotEquals(health, 0);
		assertNotEquals(health, null);
	}
	@Test
	public void testUpdateHealth() throws SQLException{
		db.updateHealth(17);
		assertEquals(db.getHealthSize(), 17);
		assertNotEquals(db.getHealthSize(), 16);
		assertNotEquals(db.getHealthSize(), 18);
		assertNotEquals(db.getHealthSize(), 0);
		assertNotEquals(db.getHealthSize(), null);
		
		int health = db.updateHealth(22);
		assertEquals(health, 22);
		assertNotEquals(health, 21);
		assertNotEquals(health, 23);
		assertNotEquals(health, 0);
		assertNotEquals(health, null);
	}
	@Test
	public void testGetPlayerLocation() {
		db.insertPlayerLocation("here");
		String loc = db.getPlayerLocation();
		
		assertEquals(loc, "here");
		assertEquals(db.getPlayerLocation(), "here");
		assertNotEquals(loc, "there");
		assertNotEquals(loc, null);
		assertNotEquals(db.getPlayerLocation(), "there");
		assertNotEquals(db.getPlayerLocation(), null);
	}
	@Test
	public void testInsertPlayerLocation() throws SQLException{
		db.insertPlayerLocation("here");
		String loc = db.getPlayerLocation();
		
		assertEquals(loc, "here");
		assertEquals(db.getPlayerLocation(), "here");
		assertNotEquals(loc, "there");
		assertNotEquals(loc, null);
		assertNotEquals(db.getPlayerLocation(), "there");
		assertNotEquals(db.getPlayerLocation(), null);
	}
	@Test
	public void testGetInventorySize() throws SQLException{
		ArrayList<Integer> items = new ArrayList<Integer>();
		db.insertUserItem(1, "name", "type");
		db.insertUserItem(3, "name", "type");
		db.insertUserItem(5, "name", "type");
		items = db.getInventorySize();
		int count = 0;
		
		for(int i = 0; i < items.size(); i ++) {
			count += items.get(i);
		}
		
		assertEquals(db.getInventorySize(), 3);
		assertEquals(count, 9);
		assertNotEquals(count, 0);
		assertNotEquals(count, null);	
	}
	@Test
	public void testGetInventory() throws SQLException{
		ArrayList<String> items = new ArrayList<String>();
		db.insertUserItem(1, "key", "utility");
		db.insertUserItem(3, "lock", "utility");
		db.insertUserItem(5, "knife", "weapon");
		
		items = db.getInventory();
		assertEquals(db.getInventorySize(), 3);
		assertTrue(db.getInventory().get(0).equals("key"));
		assertTrue(items.get(0).equals("key"));
		
		
		
	}
	@Test
	public void testGetLinearArea() throws SQLException{
		ArrayList<String> area = new ArrayList<String>();
		area = db.getLinearArea("2");
		assertEquals(3, area.size());
	}
	@Test
	public void testAddArea() throws SQLException{

	}


}
