package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.AbstractDocument.Content;

import controller.GameController;
import fakeDB.FakeAreaDB;
import gamePersist.DatabaseProvider;
import gamePersist.DerbyDatabase;
import gamePersist.IDatabase;
import model.Game;


public class GameServlet extends HttpServlet {
	
	
	

	
	public int level = 1;
	private static final long serialVersionUID = 1L;
	public boolean post = false;
	public String[] content = new String[16];
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		post = false;
		System.out.println("Game Servlet: doGet");
		DatabaseProvider.setInstance(new DerbyDatabase()); // some of this code taken from lab 06 and library example ---- CITING
		IDatabase db = DatabaseProvider.getInstance();
		//FakeAreaDB db2 = new FakeAreaDB();
		
		try {
			db.insertPlayerLocation("bedroom");
			content = db.getArea(Integer.toString(level));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String para = content[2];
		req.setAttribute("para",para);
		
		//Sets the choices
		for(int i = 3; i < 9; i++){
			
			req.setAttribute("q" + (i - 2), (i - 2) + ": " + content[i]);
		}

		
		req.getRequestDispatcher("/_view/game.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		DatabaseProvider.setInstance(new DerbyDatabase()); // some of this code taken from lab 06 and library example ---- CITING
		IDatabase db = DatabaseProvider.getInstance();
		
		Game model = new Game();
		GameController controller = new GameController();
		
		post = true;
		String choice = null;
		System.out.println("Game Servlet: doPost");
		choice = req.getParameter("choice");
		System.out.println("choice= " + choice);
		
		if (model.getArea().equals("bedroom")) {
			System.out.println(" if equals bedroom" + model.getArea());  // check the first dresser
			if (choice.equals("1")) { //parameter from post form 
				try {
					content = db.getArea(Integer.toString(2)); //gets second line of csv
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				String para = content[2]; //gets second section (paragraph section) of the line in csv
				req.setAttribute("para",para);
				
				//Sets the choices
				for(int i = 3; i < 9; i++){
					
					req.setAttribute("q" + (i - 2), (i - 2) + ": " + content[i]);
					
				}
				model.setArea("dresser1"); // change the area
				System.out.println("choice was 1" + model.getArea());
			}
			else if (choice.equals("2")) { // check the second dresser
				try {
					content = db.getArea(Integer.toString(3));///NOTE: does not correlate direclty to choice value
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				String para = content[2];
				req.setAttribute("para",para);
				
				//Sets the choices
				for(int i = 3; i < 9; i++){
					
					req.setAttribute("q" + (i - 2), (i - 2) + ": " + content[i]);
				}
				model.setArea("dresser2"); // change the area
				System.out.println("choice was 1" + model.getArea());
			}
			else if (choice.equals("3")) {  //check the bed
				try {
					content = db.getArea(Integer.toString(4));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				String para = content[2];
				req.setAttribute("para",para);
				
				//Sets the choices
				for(int i = 3; i < 9; i++){
					
					req.setAttribute("q" + (i - 2), (i - 2) + ": " + content[i]);
				}
				model.setArea("checkBed"); // change the area
				System.out.println("choice was 3 " + model.getArea());
			}
			else if (choice.equals("4")) { // make the bed
				try {
					content = db.getArea(Integer.toString(5));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				String para = content[2];
				req.setAttribute("para",para);
				
				//Sets the choices
				for(int i = 3; i < 9; i++){
					
					req.setAttribute("q" + (i - 2), (i - 2) + ": " + content[i]);
				}
				model.setArea("makeBed"); // change the area
				System.out.println("choice was 4 " + model.getArea());
			}
			else if (choice.equals("5")) {  // turn the tv off
				try {
					content = db.getArea(Integer.toString(6));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				String para = content[2];
				req.setAttribute("para",para);
				
				//Sets the choices
				for(int i = 3; i < 9; i++){
					
					req.setAttribute("q" + (i - 2), (i - 2) + ": " + content[i]);
				}
				model.setArea("tv"); // change the area
				System.out.println("choice was 5 " + model.getArea());
			}
			else if (choice.equals("6")) { //leave the room 
				try {
					content = db.getArea(Integer.toString(7));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				String para = content[2];
				req.setAttribute("para",para);
				
				//Sets the choices
				for(int i = 3; i < 9; i++){
					
					req.setAttribute("q" + (i - 2), (i - 2) + ": " + content[i]);
				}
				model.setArea("bathroom"); // change the area
				System.out.println("choice was 6 " + model.getArea());
			}
			else {// nothing or wrong choice
				try {
					content = db.getArea(Integer.toString(1));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				String para = content[2];
				req.setAttribute("para",para);
				
				//Sets the choices
				for(int i = 3; i < 9; i++){
					
					req.setAttribute("q" + (i - 2), (i - 2) + ": " + content[i]);
				}
				
			}	
		}
////////////////////////////////////////////////////////////////////////////////////////
	//choice was made///////
////////////////////////////////////////////////////////////////////////////////////////		
		else if(model.getArea().equals("dresser1")) {
			System.out.println(" in dressser" + model.getArea());
			if (choice.equals("1")) { //parameter from post form 
				try {
					content = db.getArea(Integer.toString(8)); 
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				String para = content[2]; //gets second section (paragraph section) of the line in csv
				req.setAttribute("para",para);
				
				//Sets the choices
				for(int i = 3; i < 9; i++){
					
					req.setAttribute("q" + (i - 2), (i - 2) + ": " + content[i]);
					
				}
				model.setArea("bedroom");// change the area
				System.out.println(" end of dressser" + model.getArea());
			}
			else {// no choice or wrong choice
				try {
					content = db.getArea(Integer.toString(2)); 
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				String para = content[2]; //gets second section (paragraph section) of the line in csv
				req.setAttribute("para",para);
				
				//Sets the choices
				for(int i = 3; i < 9; i++){
					
					req.setAttribute("q" + (i - 2), (i - 2) + ": " + content[i]);
					
				}
			}
		}
		else if(model.getArea().equals("dresser2")) {
			System.out.println(" in dressser2" + model.getArea());
			if (choice.equals("1")) { //parameter from post form 
				try {
					content = db.getArea(Integer.toString(3)); 
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				String para = content[2]; //gets second section (paragraph section) of the line in csv
				req.setAttribute("para",para);
				
				//Sets the choices
				for(int i = 3; i < 9; i++){
					
					req.setAttribute("q" + (i - 2), (i - 2) + ": " + content[i]);
					
				}
				controller.addItem(model.getLighter());
				model.setArea("dresser2");// change the area
				System.out.println(" end of dressser2" + model.getArea());
			}
			else if (choice.equals("2")) { //parameter from post form 
				try {
					content = db.getArea(Integer.toString(8)); // redirects to next page
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				String para = content[2]; //gets second section (paragraph section) of the line in csv
				req.setAttribute("para",para);
				
				//Sets the choices
				for(int i = 3; i < 9; i++){
					
					req.setAttribute("q" + (i - 2), (i - 2) + ": " + content[i]);
					
				}
				model.setArea("bedroom");// change the area
				System.out.println(" end of dressser2" + model.getArea());
			}
			else {// no choice or wrong choice
				try {
					content = db.getArea(Integer.toString(3)); 
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				String para = content[2]; //gets second section (paragraph section) of the line in csv
				req.setAttribute("para",para);
				
				//Sets the choices
				for(int i = 3; i < 9; i++){
					
					req.setAttribute("q" + (i - 2), (i - 2) + ": " + content[i]);
					
				}
			}
		}	
			else if(model.getArea().equals("checkBed")) {
				System.out.println(" check bed" + model.getArea());
				if (choice.equals("1")) { //parameter from post form 
					try {
						content = db.getArea(Integer.toString(8)); 
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
					String para = content[2]; //gets second section (paragraph section) of the line in csv
					req.setAttribute("para",para);
					
					//Sets the choices
					for(int i = 3; i < 9; i++){
						
						req.setAttribute("q" + (i - 2), (i - 2) + ": " + content[i]);
						
					}
					model.setArea("bedroom");// change the area
					System.out.println(" end of check bed " + model.getArea());
				}
				else {// no choice or wrong choice
					try {
						content = db.getArea(Integer.toString(4)); 
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
					String para = content[2]; //gets second section (paragraph section) of the line in csv
					req.setAttribute("para",para);
					
					//Sets the choices
					for(int i = 3; i < 9; i++){
						
						req.setAttribute("q" + (i - 2), (i - 2) + ": " + content[i]);
						
					}
				}
			}
			else if(model.getArea().equals("makeBed")) {
				System.out.println(" make bed" + model.getArea());
				if (choice.equals("1")) { //parameter from post form 
					try {
						content = db.getArea(Integer.toString(8)); 
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
					String para = content[2]; //gets second section (paragraph section) of the line in csv
					req.setAttribute("para",para);
					
					//Sets the choices
					for(int i = 3; i < 9; i++){
						
						req.setAttribute("q" + (i - 2), (i - 2) + ": " + content[i]);
						
					}
					model.setArea("bedroom");// change the area
					System.out.println(" end of make bed " + model.getArea());
				}
				else {// no choice or wrong choice
					try {
						content = db.getArea(Integer.toString(5)); 
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
					String para = content[2]; //gets second section (paragraph section) of the line in csv
					req.setAttribute("para",para);
					
					//Sets the choices
					for(int i = 3; i < 9; i++){
						
						req.setAttribute("q" + (i - 2), (i - 2) + ": " + content[i]);
						
					}
				}
			}
			else if(model.getArea().equals("tv")) {
				System.out.println("tv " + model.getArea());
				if (choice.equals("1")) { //parameter from post form 
					try {
						content = db.getArea(Integer.toString(8)); 
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
					String para = content[2]; //gets second section (paragraph section) of the line in csv
					req.setAttribute("para",para);
					
					//Sets the choices
					for(int i = 3; i < 9; i++){
						
						req.setAttribute("q" + (i - 2), (i - 2) + ": " + content[i]);
						
					}
					model.setArea("bedroom");// change the area
					System.out.println(" end of tv " + model.getArea());
				}	
			}
			else if(model.getArea().equals("bathroom")) {
				System.out.println("bathroom " + model.getArea());
				if (choice.equals("1")) { //parameter from post form 
					try {
						content = db.getArea(Integer.toString(7)); 
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
					String para = content[2]; //gets second section (paragraph section) of the line in csv
					req.setAttribute("para",para);
					
					//Sets the choices
					for(int i = 3; i < 9; i++){
						
						req.setAttribute("q" + (i - 2), (i - 2) + ": " + content[i]);
						
					}
					model.setArea("medicine");// change the area
					System.out.println(" end of bathroom " + model.getArea());
				}	
			}
		
		
		
		
			
		
		req.getRequestDispatcher("/_view/game.jsp").forward(req, resp);
	}
}