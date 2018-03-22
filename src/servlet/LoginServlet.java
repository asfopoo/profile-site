package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fakeDB.FakeUserDB;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Login Servlet: doGet");
		
		req.getRequestDispatcher("/_view/login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Login Servlet: doPost");
		
		//checks if account it a real account
		FakeUserDB db = new FakeUserDB();

		// gets username and password
		String user = (req.getParameter("u")).toLowerCase();
		String password = req.getParameter("p");
		
		//checks if the account is valid
		boolean validAccount = db.accountExist(user, password);
		
		//If account is valid, continue, if it isnt, spit out error
		if(validAccount == true){
			// Forward to view to render the result HTML document
			resp.sendRedirect(req.getContextPath() + "/start");
			System.out.println("Login Servlet: Login Successful");
		}else{
			req.setAttribute("response", "Incorrect Username or Password");
			System.out.println("Login Servlet: Login Failed");
			req.getRequestDispatcher("/_view/login.jsp").forward(req, resp);
		}
		//System.out.println(first + second);
		
		
	}

}


