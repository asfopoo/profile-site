package gamePersist;

import java.sql.SQLException;
import java.util.ArrayList;

import entity.Item;



public interface IDatabase {
	boolean registerAccount(String username, String password, String email) throws SQLException;
	boolean accountExist(String username, String password);
	int insertUserItem(int size, String name, String type);
	int removeUserItem(int size, String name, String type);
	int createArea(String name, String para, ArrayList<String> options) throws SQLException;
	ArrayList<String> getArea(String id) throws SQLException;
	public void insertPlayerLocation(String area);
	public String getPlayerLocation();
	ArrayList<String> getNextArea(String choice) throws SQLException;
	String getCurrentArea(String username);
	void setCurrentArea(String area, String username);
	String checkAccess(String username);

}
