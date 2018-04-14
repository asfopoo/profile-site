package gamePersist;

import java.sql.SQLException;

import entity.Item;



public interface IDatabase {
	boolean registerAccount(String username, String password, String pass2, String email) throws SQLException;
	boolean accountExist(String username, String password);
	void insertUserItem(int size, String name, String type);
	void removeUserItem(int size, String name, String type);
	//void createArea(String name, String para, String[] options) throws SQLException;
	String[] getArea(String id) throws SQLException;
	public void insertPlayerLocation(String area);

}
