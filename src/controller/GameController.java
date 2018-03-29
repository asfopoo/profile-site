package controller;

import gamePersist.DatabaseProvider;
import gamePersist.DerbyDatabase;
import gamePersist.IDatabase;
import model.Game;

import gamePersist.DatabaseProvider;
import gamePersist.IDatabase;
import entity.Item;
import fakeDB.FakeUserDB;
import gamePersist.DerbyDatabase;

public class GameController {
	
	private Game model;
	private IDatabase db = null;
	
	public GameController() {
		DatabaseProvider.setInstance(new DerbyDatabase()); // some of this code taken from lab 06 and library example ---- CITING
		db = DatabaseProvider.getInstance();
	}
	
	public void setModel(Game model) {
		this.model = model;
	}
	
	public void addItem(Item item) {
		
	}

}
