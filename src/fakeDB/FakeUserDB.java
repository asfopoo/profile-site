package fakeDB;

import java.util.ArrayList;

public class FakeUserDB {
	private ArrayList<String> user = new ArrayList<String>();
	private ArrayList<String> pass = new ArrayList<String>();
	
	public FakeUserDB(){
		//temp until register is a thing
		user.add("test");
		pass.add("pass");
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

	

}
