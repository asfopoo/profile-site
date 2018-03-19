package servletTests;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

import fakeDB.FakeUserDB;
import servlet.LoginServlet;
import servlet.RegisterServlet;

public class LoginRegisterTest {
	private LoginServlet login;
	private RegisterServlet reg;
	private FakeUserDB db;
	
	@Before
	public void setUp() {
		login = new LoginServlet();
		reg = new RegisterServlet();
		db = new FakeUserDB();
	}
	
	@Test
	public void loginTestFail() {
		boolean test;
		db.setArrayList("test", "pass");
		test = db.accountExist("test", "test");
		assertTrue(test == true);
		
		test = db.accountExist("ttt", "test");
		assertTrue(test == false);

		test = db.accountExist("ttt", "pass");
		assertTrue(test == false);
		
	}
	
	@Test
	public void loginTestPass() {
		boolean test;
		
		db.setArrayList("test", "pass");
		test = db.accountExist("test", "pass");
		assertTrue(test == false);

	}

}
