package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fakeDB.FakeUserDB;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Register Servlet: doGet");
		
		req.getRequestDispatcher("/_view/register.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Register Servlet: doPost");
		
		//checks if account it a real account
		FakeUserDB db = new FakeUserDB();

		// gets username and password
		String user = (req.getParameter("u")).toLowerCase();
		String password = req.getParameter("p");
		String password2 = req.getParameter("p2");
		String email = req.getParameter("e");
		
		//checks if account exist
		boolean validAccount = db.registerAccount(user, password, password2, email);
		
		//If account is valid, continue, if it isnt, spit out error
		if(validAccount == true){
			// Forward to view to render the result HTML document
			req.getRequestDispatcher("/_view/login.jsp").forward(req, resp);
			System.out.println("Register Servlet: Register Successful");
		}else{
			req.setAttribute("response", "Account already exists or passwords dont match");
			System.out.println("Register Servlet: Register Failed");
			req.getRequestDispatcher("/_view/register.jsp").forward(req, resp);
		}
		//System.out.println(first + second);
		
		
	}


}


