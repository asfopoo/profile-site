package gamePersist;

import java.sql.SQLException;



public interface IDatabase {
	boolean registerAccount(String username, String password, String pass2, String email) throws SQLException;

	boolean accountExist(String username, String password);
	
}
