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
		System.out.println("db loaction = " + db.getPlayerLocation());
		
		if (db.getPlayerLocation().equals("bedroom")) {
			System.out.println(db.getPlayerLocation());
			System.out.println(" if equals bedroom " + db.getPlayerLocation());  // check the first dresser
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
				db.insertPlayerLocation("dresser1"); // change the area
				
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
				db.insertPlayerLocation("dresser2"); // change the area
				System.out.println("choice was 1" + db.getPlayerLocation());
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
				db.insertPlayerLocation("checkBed"); // change the area
				System.out.println("choice was 3 " + db.getPlayerLocation());
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
				db.insertPlayerLocation("makeBed"); // change the area
				System.out.println("choice was 4 " + db.getPlayerLocation());
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
				db.insertPlayerLocation("tv"); // change the area
				System.out.println("choice was 5 " + db.getPlayerLocation());
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
				db.insertPlayerLocation("bathroom"); // change the area
				System.out.println("choice was 6 " + db.getPlayerLocation());
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
		else if(db.getPlayerLocation().equals("dresser1")) {
			System.out.println(" in dressser" + db.getPlayerLocation());
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
				db.insertPlayerLocation("bedroom");// change the area
				System.out.println(" end of dressser" + db.getPlayerLocation());
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
		else if(db.getPlayerLocation().equals("dresser2")) {
			System.out.println(" in dressser2" + db.getPlayerLocation());
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
				db.insertPlayerLocation("dresser2");// change the area
				System.out.println(" end of dressser2" + db.getPlayerLocation());
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
				db.insertPlayerLocation("bedroom");// change the area
				System.out.println(" end of dressser2" + db.getPlayerLocation());
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
		else if(db.getPlayerLocation().equals("checkBed")) {
			System.out.println(" check bed" + db.getPlayerLocation());
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
				db.insertPlayerLocation("bedroom");// change the area
				System.out.println(" end of check bed " + db.getPlayerLocation());
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
		else if(db.getPlayerLocation().equals("makeBed")) {
			System.out.println(" make bed" + db.getPlayerLocation());
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
				db.insertPlayerLocation("bedroom");// change the area
				System.out.println(" end of make bed " + db.getPlayerLocation());
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
		else if(db.getPlayerLocation().equals("tv")) {
			System.out.println("tv " + db.getPlayerLocation());
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
				db.insertPlayerLocation("bedroom");// change the area
				System.out.println(" end of tv " + db.getPlayerLocation());
			}		
		}
//////////////////////////////BATHROOM////////////////////////////////////////////////
		
		else if(db.getPlayerLocation().equals("bathroom")) {
			System.out.println("bathroom " + db.getPlayerLocation());
			if (choice.equals("1")) { //parameter from post form 
				try {
					content = db.getArea(Integer.toString(9)); 
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
				db.insertPlayerLocation("medicine");// change the area
				System.out.println(" end of medicine " + db.getPlayerLocation());
			}
			else if (choice.equals("2")) { //goes to sink 
				try {
					content = db.getArea(Integer.toString(10)); // redirects to next page
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
				db.insertPlayerLocation("sink");// change the area
				System.out.println(" end of sink" + db.getPlayerLocation());
			}
			else if (choice.equals("3")) { //goes to shower
				try {
					content = db.getArea(Integer.toString(11)); // redirects to next page
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
				db.insertPlayerLocation("shower");// change the area
				System.out.println(" end of shower" + db.getPlayerLocation());
			}
			else if (choice.equals("4")) { //goes to light cover 
				try {
					content = db.getArea(Integer.toString(12)); // redirects to next page
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
				db.insertPlayerLocation("lightcover");// change the area
				System.out.println(" end of light cover " + db.getPlayerLocation());
			}
			else if (choice.equals("5")) { //goes to guest room
				try {
					content = db.getArea(Integer.toString(13)); // redirects to next page
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
				db.insertPlayerLocation("guestroom");// change the area
				System.out.println(" guest room  " + db.getPlayerLocation());
			}
			else if (choice.equals("6")) { //goes to bedroom2 
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
				db.insertPlayerLocation("bedroom");// change the area
				System.out.println(" end of bathroom " + db.getPlayerLocation());
			}
		}
		
		
		
		
			
		
		req.getRequestDispatcher("/_view/game.jsp").forward(req, resp);
	}
}