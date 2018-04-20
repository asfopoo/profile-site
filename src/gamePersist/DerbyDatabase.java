package gamePersist;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Area;
import entity.Item;
import entity.ItemType;
import gamePersist.DBUtil;

public class DerbyDatabase implements IDatabase { /// most of the gamePersist package taken from Lab06 ----CITING
	static {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		} catch (Exception e) {
			throw new IllegalStateException("Could not load Derby driver");
		}
	}
	
	private interface Transaction<ResultType> {
		public ResultType execute(Connection conn) throws SQLException;
	}

	private static final int MAX_ATTEMPTS = 10;

///////////////////////////////////////////////////////////////////////////////////
/////////////////////ADD AREA////////////////////////////////////
/////////////////////////////////////////////////////////////////////////	
public int createArea(String name, String para, ArrayList<String> options) throws SQLException {
		
		int area_id = 0;
		Connection conn = null;
		PreparedStatement stmt = null;
		PreparedStatement stmt2 = null;
		PreparedStatement stmt3 = null;
		PreparedStatement stmt4 = null;
		PreparedStatement stmt5 = null;
		PreparedStatement stmt6 = null;
		ResultSet resultSet = null;
		ResultSet resultSet2 = null;
		ResultSet resultSet3 = null;
		ResultSet resultSet4 = null;
		ResultSet resultSet5 = null;
		
		//Connects to database
		conn = DriverManager.getConnection("jdbc:derby:test.db;create=true");
				
		//Takes information from the editor jsp and inserts it to the database for area
				try {
						stmt2 = conn.prepareStatement( // enter username
								"insert into area(areaName, para, Opt1, Opt2, Opt3, Opt4, Opt5, Opt6, areaLink1, areaLink2, areaLink3, areaLink4, areaLink5, areaLink6, areaPicture)"
								+ "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
						);				
								
						stmt2.setString(1, name);
						stmt2.setString(2, para);
						for(int i = 0; i < 13; i++){
							stmt2.setString(i + 3, options.get(i));
						}
						
								
						stmt2.execute();
						
						stmt3 = conn.prepareStatement(
								"select area.area_id from area where areaName = (?) and para = (?)"
								
						);
					
						stmt3.setString(1, name);
						stmt3.setString(2, para);
						
						
						resultSet = stmt3.executeQuery();
						if(resultSet.next()) {
							area_id = resultSet.getInt(1);
						}
						
						
					
					
				
					
					
				} finally {
					DBUtil.closeQuietly(resultSet);
					DBUtil.closeQuietly(resultSet2);
					DBUtil.closeQuietly(resultSet3);
					DBUtil.closeQuietly(resultSet4);
					DBUtil.closeQuietly(resultSet5);
					DBUtil.closeQuietly(stmt);
					DBUtil.closeQuietly(stmt2);
					DBUtil.closeQuietly(stmt3);
					DBUtil.closeQuietly(stmt4);
					DBUtil.closeQuietly(stmt5);
					DBUtil.closeQuietly(stmt6);
					DBUtil.closeQuietly(conn);
				}
			return area_id;
	}	
	///////////////////////////////////////////////////////////////////////////////////
	///////////////////// GET NEXT AREA////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////
	public ArrayList<String> getNextArea(String id) throws SQLException {

		Connection conn = null;
		PreparedStatement stmt = null;
		PreparedStatement stmt2 = null;
		PreparedStatement stmt3 = null;
		PreparedStatement stmt4 = null;
		PreparedStatement stmt5 = null;
		PreparedStatement stmt6 = null;
		ResultSet resultSet = null;
		ResultSet resultSet2 = null;
		ResultSet resultSet3 = null;
		ResultSet resultSet4 = null;
		ResultSet resultSet5 = null;
		
		//Loads from database
		ArrayList<String> content = new ArrayList<String>();
		conn = DriverManager.getConnection("jdbc:derby:test.db;create=true");

		//Selects the entire area databse
		try {
			stmt = conn.prepareStatement(
					"select * from area "
					+ "where area_id = ?"
					
			);
			
			//Throws in the area id for sql statement
			stmt.setString(1, id);
			
			resultSet = stmt.executeQuery();
			
			//Turns sql result into an array list then returns it
			while(resultSet.next()){
				for(int i = 0; i < 16; i++){
					content.add(resultSet.getString(i + 1));
					//System.out.println(resultSet.getString(i + 1));
				}
			}
			return content;

		} finally {
			DBUtil.closeQuietly(resultSet);
			DBUtil.closeQuietly(resultSet2);
			DBUtil.closeQuietly(resultSet3);
			DBUtil.closeQuietly(resultSet4);
			DBUtil.closeQuietly(resultSet5);
			DBUtil.closeQuietly(stmt);
			DBUtil.closeQuietly(stmt2);
			DBUtil.closeQuietly(stmt3);
			DBUtil.closeQuietly(stmt4);
			DBUtil.closeQuietly(stmt5);
			DBUtil.closeQuietly(stmt6);
			DBUtil.closeQuietly(conn);
		}
	}

///////////////////////////////////////////////////////////////////////////////////
///////////////////// GET AREA////////////////////////////////////
/////////////////////////////////////////////////////////////////////////
	public ArrayList<String> getArea(String choice) throws SQLException {

		Connection conn = null;
		PreparedStatement stmt = null;
		PreparedStatement stmt2 = null;
		PreparedStatement stmt3 = null;
		PreparedStatement stmt4 = null;
		PreparedStatement stmt5 = null;
		PreparedStatement stmt6 = null;
		ResultSet resultSet = null;
		ResultSet resultSet2 = null;
		ResultSet resultSet3 = null;
		ResultSet resultSet4 = null;
		ResultSet resultSet5 = null;

		//uses database
		ArrayList<String> content = new ArrayList<String>();
		conn = DriverManager.getConnection("jdbc:derby:test.db;create=true");

		//selects the area db
		try {
			stmt = conn.prepareStatement("select * from area " + "where area_id = ?"

			);

			//puts area id into sql statement
			stmt.setString(1, choice);

			resultSet = stmt.executeQuery();
			//int i = 0;
			
			//returns result in array list and returns
			while (resultSet.next()) {
				for(int i = 0; i < 16; i++){
					content.add(resultSet.getString(i + 1));
					//System.out.println(resultSet.getString(i + 1));
				}
				//i++;
				
			}
			return content;

		} finally {
			DBUtil.closeQuietly(resultSet);
			DBUtil.closeQuietly(resultSet2);
			DBUtil.closeQuietly(resultSet3);
			DBUtil.closeQuietly(resultSet4);
			DBUtil.closeQuietly(resultSet5);
			DBUtil.closeQuietly(stmt);
			DBUtil.closeQuietly(stmt2);
			DBUtil.closeQuietly(stmt3);
			DBUtil.closeQuietly(stmt4);
			DBUtil.closeQuietly(stmt5);
			DBUtil.closeQuietly(stmt6);
			DBUtil.closeQuietly(conn);
		}
	}

	///////////////////////////////////////////////////////////////////////////////////
	///////////////////// REGISTER ACCOUNT////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////
	public boolean registerAccount(String userName, String pass, String email) throws SQLException {

		Connection conn = null;
		PreparedStatement stmt = null;
		PreparedStatement stmt2 = null;
		PreparedStatement stmt3 = null;
		PreparedStatement stmt4 = null;
		PreparedStatement stmt5 = null;
		PreparedStatement stmt6 = null;
		ResultSet resultSet = null;
		ResultSet resultSet2 = null;
		ResultSet resultSet3 = null;
		ResultSet resultSet4 = null;
		ResultSet resultSet5 = null;

		conn = DriverManager.getConnection("jdbc:derby:test.db;create=true");

		try {
			// retreive username attribute from login
			stmt = conn.prepareStatement("select userName " // user attribute
					+ "  from login " // from login table
					+ "  where userName = ?"

			);

			// substitute the title entered by the user for the placeholder in
			// the query
			stmt.setString(1, userName);

			// execute the query
			resultSet = stmt.executeQuery();

			if (!resultSet.next()) { /// if username doesnt exist

				stmt2 = conn.prepareStatement( // enter username
						"insert into login(userName, password, email, type)" + "values(?, ?, ?, ?)");

				stmt2.setString(1, userName);
				stmt2.setString(2, pass);
				stmt2.setString(3, email);
				stmt2.setString(4, "1");

				stmt2.execute();
				


				return true;
			} else {
				return false; // username already exists
			}

		} finally {
			DBUtil.closeQuietly(resultSet);
			DBUtil.closeQuietly(resultSet2);
			DBUtil.closeQuietly(resultSet3);
			DBUtil.closeQuietly(resultSet4);
			DBUtil.closeQuietly(resultSet5);
			DBUtil.closeQuietly(stmt);
			DBUtil.closeQuietly(stmt2);
			DBUtil.closeQuietly(stmt3);
			DBUtil.closeQuietly(stmt4);
			DBUtil.closeQuietly(stmt5);
			DBUtil.closeQuietly(stmt6);
			DBUtil.closeQuietly(conn);
		}
	}
///////////////////////////////////////////////////////////////////////////////////
/////////////////////ACCOUNT EXISTS////////////////////////////////////
/////////////////////////////////////////////////////////////////////////	
	public boolean accountExist(String username, String password){ ///checks if account exists
		//Checks if the user exist and if the password matches
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet resultSet = null;
		String harry = null;
		String harry2 = null;
		boolean exist = false;
		int count = 0;
		
		
	
		try {
			
			conn = DriverManager.getConnection("jdbc:derby:test.db;create=true");
		
			// retreive username attribute from login
			stmt = conn.prepareStatement(
					"select * from login"
			);		
			
			
			

			// execute the query
			resultSet = stmt.executeQuery();
			
			//harry = resultSet.getString("username");/// this might not work 
			while(resultSet.next()) {
				harry = resultSet.getString("userName");
				harry2 = resultSet.getString("password");
				if(username.equals(harry) && password.equals(harry2)) {
					exist = true;
				}
				
			}
			
			//System.out.println(exist);
			if(exist == true) { // HAS to be a better way to do this!!!!!!!!!!!!!!!!!
						///still doesnt work anyway
				//System.out.println("true");
				return true;//account exists
				
			}
			else{
				//System.out.println("failed");
				return false;//account doesnt exists		
			}
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		finally {
			DBUtil.closeQuietly(resultSet);
			DBUtil.closeQuietly(stmt);
			DBUtil.closeQuietly(conn);
		}
		return false;
		
	}
///////////////////////////////////////////////////////////////////////////////////
/////////////////////INSERT USER INVENTORY////////////////////////////////////
/////////////////////////////////////////////////////////////////////////
	public int insertUserItem(int size, String name, String type) {
		
		int itemInventory_id = 0;
		ResultSet resultSet = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		PreparedStatement stmt2 = null;
		PreparedStatement stmt3 = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:derby:test.db;create=true");
			
			
			stmt2 = conn.prepareStatement(
					"delete from houseItems " //will have to change at some point depending on current location
					+ "where itemName= ?"
					
			);
		
			
			stmt2.setString(1, name);
			
			
			stmt2.executeUpdate();
				
			stmt = conn.prepareStatement(
					"insert into userInventory(size, itemName, itemType)"
					+ "values(?, ?, ?)"
					
			);
		
			stmt.setInt(1, size);
			stmt.setString(2, name);
			stmt.setString(3, type);
			
			stmt.execute();
			
			stmt3 = conn.prepareStatement(
					"select userinventory.userinventory_id from userInventory where size = (?) and itemName = (?) and itemType = (?)"
					
			);
		
			stmt3.setInt(1, size);
			stmt3.setString(2, name);
			stmt3.setString(3, type);
			
			resultSet = stmt3.executeQuery();
			if(resultSet.next()) {
				itemInventory_id = resultSet.getInt(1);
			}
			
			
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
		finally {
			DBUtil.closeQuietly(resultSet);
			DBUtil.closeQuietly(stmt);
			DBUtil.closeQuietly(stmt2);
			DBUtil.closeQuietly(stmt3);
			DBUtil.closeQuietly(conn);
		}
		return itemInventory_id;
	}
	
///////////////////////////////////////////////////////////////////////////////////////
///////////////////////////REMOVE ITEM FROM USER INVENTORY/////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
public int removeUserItem(int size, String name, String type) {
		
		ResultSet resultSet = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		PreparedStatement stmt2 = null;
		PreparedStatement stmt3 = null;
		int userInventory_id = 0;
		
		try {
			conn = DriverManager.getConnection("jdbc:derby:test.db;create=true");
				
			stmt = conn.prepareStatement(
					"delete from userInventory "
					+ "where itemName= ?"
					
			);
		
			
			stmt.setString(1, name);
			
			
			stmt.executeUpdate();
			
			stmt2 = conn.prepareStatement(
					"insert into houseItems(size, itemName, itemType)" //will have to change depending on current location.. ie....wont always be in the house
					+ "values(?, ?, ?)"
					
			);
		
			stmt2.setInt(1, size);
			stmt2.setString(2, name);
			stmt2.setString(3, type);
			
			stmt2.execute();
			
			stmt3 = conn.prepareStatement(
					"select userinventory.userinventory_id from userInventory where size = (?) and itemName = (?) and itemType = (?)"
					
			);
		
			stmt3.setInt(1, size);
			stmt3.setString(2, name);
			stmt3.setString(3, type);
			
			resultSet = stmt3.executeQuery();
			if(resultSet.next()) {
				userInventory_id = resultSet.getInt(1);
				System.out.println("failed to remove item");
			}
			
			
			
		} 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
		finally {
			DBUtil.closeQuietly(resultSet);
			DBUtil.closeQuietly(stmt);
			DBUtil.closeQuietly(stmt2);
			DBUtil.closeQuietly(stmt3);
			DBUtil.closeQuietly(conn);
		}
		return userInventory_id;
	}

////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////ADD AREA TO PLAYERLOCATION//////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////

// currently unused and untested

public void insertPlayerLocation(String area) {
	
	ResultSet resultSet = null;
	Connection conn = null;
	PreparedStatement stmt = null;
	PreparedStatement stmt2 = null;
	
	try {
		conn = DriverManager.getConnection("jdbc:derby:test.db;create=true");
		
		
		stmt = conn.prepareStatement(
				"delete from playerLocation "
				
		);
		
		
		stmt.executeUpdate();
			
		stmt2 = conn.prepareStatement(
				"insert into playerLocation(area) "
				+ "values(?)"
				
		);
	
		stmt2.setString(1, area);
		
		
		stmt2.execute();
		
		
		
	} 
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 	
	finally {
		DBUtil.closeQuietly(resultSet);
		DBUtil.closeQuietly(stmt);
		DBUtil.closeQuietly(stmt2);
		DBUtil.closeQuietly(conn);
	}
}

/////////////////////////////////////////////////////////////////////////////////////////
////////////////GET PLAYER LOCATION//////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////

//currently unused and untested

public String getPlayerLocation() {
	
	String area = null;
	ResultSet resultSet = null;
	Connection conn = null;
	PreparedStatement stmt = null;
	
	try {
		conn = DriverManager.getConnection("jdbc:derby:test.db;create=true");
		
		
		stmt = conn.prepareStatement(
				"select * from playerLocation "
				
		);
		
		
		resultSet = stmt.executeQuery();
		
		if(resultSet.next()) {
			area = resultSet.getString("area");
			
		}
	}
	
	catch (SQLException e) {	
		e.printStackTrace();
	} 	
	finally {
		DBUtil.closeQuietly(resultSet);
		DBUtil.closeQuietly(stmt);
		DBUtil.closeQuietly(conn);
	}
	return area;
	
}

	
	
	
///////////////////////////////////////////////////////////////////////////////////	
	public<ResultType> ResultType executeTransaction(Transaction<ResultType> txn) {
		try {
			return doExecuteTransaction(txn);
		} catch (SQLException e) {
			throw new PersistenceException("Transaction failed", e);
		}
	}
	
	public<ResultType> ResultType doExecuteTransaction(Transaction<ResultType> txn) throws SQLException {
		Connection conn = connect();
		
		try {
			int numAttempts = 0;
			boolean success = false;
			ResultType result = null;
			
			while (!success && numAttempts < MAX_ATTEMPTS) {
				try {
					result = txn.execute(conn);
					conn.commit();
					success = true;
				} catch (SQLException e) {
					if (e.getSQLState() != null && e.getSQLState().equals("41000")) {
						// Deadlock: retry (unless max retry count has been reached)
						numAttempts++;
					} else {
						// Some other kind of SQLException
						throw e;
					}
				}
			}
			
			if (!success) {
				throw new SQLException("Transaction failed (too many retries)");
			}
			
			// Success!
			return result;
		} finally {
			DBUtil.closeQuietly(conn);
		}
	}

	private Connection connect() throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:derby:test.db;create=true");
		
		// Set autocommit to false to allow execution of
		// multiple queries/statements as part of the same transaction.
		conn.setAutoCommit(false);
		
		return conn;
	}
	
	public void loadInitialData() { ///taken from lab06
		executeTransaction(new Transaction<Boolean>() {
			@Override
			public Boolean execute(Connection conn) throws SQLException {
				List<Item> houseItems;
				List<Area> areaList;
				
				try {
					houseItems = InitialData.getHouseItems();
					areaList = InitialData.getArea();
				} catch (IOException e) {
					throw new SQLException("Couldn't read initial data", e);
				}

				PreparedStatement insertHouseItem = null;
				PreparedStatement insertArea = null;

				try {
					// populate houseItems table 
					insertHouseItem = conn.prepareStatement("insert into houseItems (itemName, itemType, size) values (?, ?, ?)");
					for (Item item : houseItems) {
//						insertAuthor.setInt(1, author.getAuthorId());	// auto-generated primary key, don't insert this
						insertHouseItem.setString(1, item.getName());
						insertHouseItem.setString(2, item.getItemType());
						insertHouseItem.setInt(3, item.getSize());
						insertHouseItem.addBatch();
					}
					insertHouseItem.executeBatch();
					
					insertArea = conn.prepareStatement("insert into area(areaName, para, Opt1, Opt2, Opt3, Opt4, Opt5, Opt6, areaLink1, areaLink2, areaLink3, areaLink4, areaLink5, areaLink6, areaPicture) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
					for (Area area : areaList) {
						insertArea.setString(1, area.getName());
						insertArea.setString(2, area.getPara());
						insertArea.setString(3, area.getOpt1());
						insertArea.setString(4, area.getOpt2());
						insertArea.setString(5, area.getOpt3());
						insertArea.setString(6, area.getOpt4());
						insertArea.setString(7, area.getOpt5());
						insertArea.setString(8, area.getOpt6());
						insertArea.setString(9, area.getLnk1());
						insertArea.setString(10, area.getLnk2());
						insertArea.setString(11, area.getLnk3());
						insertArea.setString(12, area.getLnk4());
						insertArea.setString(13, area.getLnk5());
						insertArea.setString(14, area.getLnk6());
						insertArea.setString(15, area.getPicture());
						insertArea.addBatch();
						
					}
					
					insertArea.executeBatch();
					
					return true;
				} finally {
					DBUtil.closeQuietly(insertHouseItem);
					DBUtil.closeQuietly(insertArea);
				}
			}
		});
	}
	
	
	public void createTables() {
		executeTransaction(new Transaction<Boolean>() {
			@Override
			public Boolean execute(Connection conn) throws SQLException {
				PreparedStatement stmt1 = null;
				PreparedStatement stmt2 = null;
				PreparedStatement stmt3 = null;
				PreparedStatement stmt4 = null;
				PreparedStatement stmt5 = null;
				
				
				try {
					stmt1 = conn.prepareStatement( //creates login table
						"create table login (" +
						"	login_id integer primary key " +
						"		generated always as identity (start with 1, increment by 1), " +									
						"	userName varchar(40)," +
						"	password varchar(100)," +
						"   email varchar(40),"    +
						"   type varchar(40)"      +
						")"
					);	
					stmt1.executeUpdate();
					
					stmt2 = conn.prepareStatement( // creates user inventory table
							"create table userInventory (" +
							"	userInventory_id integer primary key " +
							"		generated always as identity (start with 1, increment by 1), " +									
							"	itemName varchar(40)," +
							"	itemType varchar(40)," +
							"   size integer"     +
							")"
						);	
						stmt2.executeUpdate();
						
					stmt3 = conn.prepareStatement( //creates house inventory 
							"create table houseItems (" +
							"	houseInventory_id integer primary key " +
							"		generated always as identity (start with 1, increment by 1), " +									
							"	itemName varchar(40)," +
							"	itemType varchar(40)," +
							"   size integer"     +
							")"
						);	
						stmt3.executeUpdate();	
						
					stmt4 = conn.prepareStatement( //creates house inventory 
							"create table area (" +
							"	area_id integer primary key " +
							"		generated always as identity (start with 1, increment by 1), " +									
							"	areaName varchar(40)," +
							"	para varchar(1000)," +
							"   Opt1 varchar(40)," +
							"   Opt2 varchar(40)," +
							"   Opt3 varchar(40)," +
							"   Opt4 varchar(40)," +
							"   Opt5 varchar(40)," +
							"   Opt6 varchar(40)," +
							"	areaLink1 varchar(40)," +
							"   areaLink2 varchar(40)," +
							"   areaLink3 varchar(40)," +
							"   areaLink4 varchar(40)," +
							"   areaLink5 varchar(40)," +
							"   areaLink6 varchar(40)," +
							"   areaPicture varchar(40)" +
							")"
						);	
					stmt4.executeUpdate();
					
					stmt5 = conn.prepareStatement( //creates playerLocation table
							"create table playerLocation (" +
							"	location_id integer primary key " +
							"		generated always as identity (start with 1, increment by 1), " +									
							"	area varchar(40)" +
							")"
						);	
						stmt5.executeUpdate();
					
					
					return true;
				} finally {
					DBUtil.closeQuietly(stmt1);
					DBUtil.closeQuietly(stmt2);
					DBUtil.closeQuietly(stmt3);
					DBUtil.closeQuietly(stmt4);
				}
			}
		});
	}
	

	
	
	
	// The main method creates the database tables and loads the initial data.
	public static void main(String[] args) throws IOException {
		System.out.println("Creating tables...");
		DerbyDatabase db = new DerbyDatabase();
		db.createTables();
		
		System.out.println("Loading initial data...");
		db.loadInitialData();
		
		System.out.println("Success!");
	}


}
