package gamePersist;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


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
	public void createArea(String name, String para, String[] options) throws SQLException {
		
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
						stmt2 = conn.prepareStatement( // enter username
								"insert into area(areaName, areaPara, areaOpt1, areaOpt2, areaOpt3, areaOpt4, areaOpt5, areaOpt6)"
								+ "values(?, ?, ?, ?, ?, ?, ?, ?)"
						);				
								
						stmt2.setString(1, name);
						stmt2.setString(2, para);
						for(int i = 0; i < 6; i++){
							stmt2.setString(i + 3, options[i]);
						}
								
						stmt2.execute();
					
					
				
					
					
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
	public String[] getArea(String id) throws SQLException {

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
		
		String[] content = new String[9];
		conn = DriverManager.getConnection("jdbc:derby:test.db;create=true");

		try {
			stmt = conn.prepareStatement(
					"select * from area "
					+ "where area_id = ?"
					
			);
			
			stmt.setString(1, id);
			
			resultSet = stmt.executeQuery();
			while(resultSet.next()){
				for(int i = 0; i < 9; i++){
					content[i] = resultSet.getString(i + 1);
					System.out.println(content[i]);
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
	///////////////////// REGISTER ACCOUNT////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////
	public boolean registerAccount(String userName, String pass, String pass2, String email) throws SQLException {

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
						"insert into login(userName, password, email)" + "values(?, ?, ?)");

				stmt2.setString(1, userName);
				stmt2.setString(2, pass);
				stmt2.setString(3, email);

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
	public void insertUserItem(int size, String name, String type) {
		
		ResultSet resultSet = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		PreparedStatement stmt2 = null;
		
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
			
			
			
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
		finally {
			DBUtil.closeQuietly(resultSet);
			DBUtil.closeQuietly(stmt);
			DBUtil.closeQuietly(conn);
		}
	}
	
///////////////////////////////////////////////////////////////////////////////////////
///////////////////////////REMOVE ITEM FROM USER INVENTORY/////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
public void removeUserItem(int size, String name, String type) {
		
		ResultSet resultSet = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		PreparedStatement stmt2 = null;
		
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
			
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
		finally {
			DBUtil.closeQuietly(resultSet);
			DBUtil.closeQuietly(stmt);
			DBUtil.closeQuietly(conn);
		}
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
				
				
				try {
					houseItems = InitialData.getHouseItems();
				} catch (IOException e) {
					throw new SQLException("Couldn't read initial data", e);
				}

				PreparedStatement insertHouseItem = null;

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
					
					// populate books table (do this after authors table,
					// since author_id must exist in authors table before inserting book)
					
					return true;
				} finally {
					DBUtil.closeQuietly(insertHouseItem);
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
				
				
				try {
					stmt1 = conn.prepareStatement( //creates login table
						"create table login (" +
						"	login_id integer primary key " +
						"		generated always as identity (start with 1, increment by 1), " +									
						"	userName varchar(40)," +
						"	password varchar(40)," +
						"   email varchar(40)"     +
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
							"	areaPara varchar(400)," +
							"   areaOpt1 varchar(40)," +
							"   areaOpt2 varchar(40)," +
							"   areaOpt3 varchar(40)," +
							"   areaOpt4 varchar(40)," +
							"   areaOpt5 varchar(40)," +
							"   areaOpt6 varchar(40)" +					
							")"
						);	
					stmt4.executeUpdate();	
					
					
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
