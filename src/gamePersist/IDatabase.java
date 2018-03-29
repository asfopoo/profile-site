package gamePersist;

import java.sql.SQLException;

import entity.Item;



public interface IDatabase {
	boolean registerAccount(String username, String password, String pass2, String email) throws SQLException;
	boolean accountExist(String username, String password);
	void insertUserItem(int size, String name, String type);
	void removeUserItem(String name);
}
