package fakeDB;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FakeUserDB {
	private ArrayList<String> user = new ArrayList<String>();
	private ArrayList<String> pass = new ArrayList<String>();
	private ArrayList<String> email = new ArrayList<String>();

	public FakeUserDB(){
		//Loads fakDB file
		File file = new File("accounts.txt");
		
		//Reads the file and puts them into array list, before ":" goes in users, after goes in pass
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
		    while ((line = br.readLine()) != null) {
		    	int in = line.indexOf(':');
		    	int end = line.length();
		    	user.add(line.substring(0, in));
		    	pass.add(line.substring(in + 1, end));
		    }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//TESTS
		/*for(int i = 0; i < user.size(); i++){
			System.out.println(user.get(i));
			System.out.println(pass.get(i));
		}*/
	}
	
	public boolean accountExist(String username, String password){
		//Checks if the user exist and if the password matches
		if(user.contains(username)){
			if(user.indexOf(username) == pass.indexOf(password)){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	
	//Registers account
	public boolean registerAccount(String username, String password, String password2, String emailName) throws IOException{
		//Checks if username exist
			if(user.contains(username) == true){
				return false;
			}else{
				//Checks if both passwords match
				if(password.equals(password2)){
					try(PrintWriter out = new PrintWriter(new FileWriter("accounts.txt", true))) {
						out.println(username + ":" + password);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return true;
				}else{
					return false;
				}
			}
	}
	
	//FOR TESTS
	public void setArrayList(String users, String passs){
		user.add(users);
		pass.add(passs);
	}
}
