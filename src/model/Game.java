package model;

import java.util.ArrayList;

import entity.Area;
import entity.Item;
import entity.ItemType;
import entity.LocationType;



public class Game {
	public ArrayList<Item> houseItems = new ArrayList<Item>();
	private ArrayList<Item> hospitalItems = new ArrayList<Item>();
	private ArrayList<Item> churchItems = new ArrayList<Item>();
	private ArrayList<Item> schoolItems = new ArrayList<Item>();
	private ArrayList<Item> carItems = new ArrayList<Item>();
	private ArrayList<Item> restaurantItems = new ArrayList<Item>();
	private ArrayList<Item> manCoverItems = new ArrayList<Item>();
	private ArrayList<Item> sheetzItems = new ArrayList<Item>();
	private ArrayList<Item> groceryItems = new ArrayList<Item>();
	
	private Area house;
	private Area hospital;
	private Area church;
	private Area school;
	private Area brokenDownCar;
	private Area restaurant;
	private Area openManholeCover;
	private Area sheetz;
	private Area groceryStore;
	private Area location;
	private String choice;
	
	private Item lighter;
	private Item knife;
	private Item toiletPaper;
	private Item shampoo;
	private Item dogFood;
	private Item fork;
	private Item tvChanger;
	private Item battery;
	private Item scissors;
	private Item canFood; // no label on food
	private Item cigs;
	private Item candle;
	private Item firePoker;
	
	
	
	
	
	public Game() {
		this.house = new Area(LocationType.START, houseItems);
		this.hospital = new Area(LocationType.HOSPITAL,hospitalItems);
		this.church = new Area(LocationType.CHURCH, churchItems);
		this.school = new Area(LocationType.SCHOOL, schoolItems);
		this.brokenDownCar = new Area(LocationType.BROKEN_DOWN_CAR, carItems);
		this.restaurant = new Area(LocationType.RESTAURAUNT, restaurantItems);
		this.openManholeCover = new Area(LocationType.OPEN_MANHOLE_COVER, manCoverItems);
		this.sheetz = new Area(LocationType.SHEETZ, sheetzItems);
		this.groceryStore = new Area(LocationType.GROCERY_STORE, groceryItems);
		
		
		
		this.lighter = new Item(1 , "greenLighter", "utility");
		this.knife = new Item(3 , "knife", "utility"); // change to weapon type csv, tests
		this.toiletPaper = new Item(4 , "toiletPaper", "utility");
		this.shampoo = new Item(4 , "shampoo", "utility");
		this.dogFood = new Item(3 , "dogFood", "food");
		this.fork = new Item(2 , "fork", "utility");
		this.tvChanger = new Item(3 , "tvChanger", "utility");
		this.battery = new Item(1 , "battery", "utility");
		this.scissors = new Item(3 , "scissors", "utility");
		this.canFood = new Item(4 , "canFood", "food");
		this.cigs = new Item(2 , "cigs", "utility");
		this.candle = new Item(2, "candle", "utility");
		this.firePoker = new Item(7, "firePoker", "weapon");
	}
	
	//Sets location based on type and arraylist of items
	public void setLocation(LocationType locationType, ArrayList<Item> items) {
		this.location = new Area(locationType, items);
	}
	
	//returns location
	public Area getLocation() {
		return location;
	}

	//Get choice from in game
	public String getChoice() {
		return choice;
	}
	
	//sets choice from in game
	public void setChoice(String choice) {
		this.choice = choice;
	}
	
	//gets array of items
	public ArrayList<Item> getItems(Area location){
		ArrayList<Item> returnItem = null;
		if(location == house){
			returnItem = houseItems;
		}else if(location == hospital){
			returnItem = hospitalItems;
		}else if(location == church){
			returnItem = churchItems;
		}else if(location == school){
			returnItem = schoolItems;
		}else if(location == brokenDownCar){
			returnItem = carItems;
		}else if(location == restaurant){
			returnItem = restaurantItems;
		}else if(location == openManholeCover){
			returnItem = manCoverItems;
		}else if(location == sheetz){
			returnItem = sheetzItems;
		}else if(location == groceryStore){
			returnItem = groceryItems;
		}
		return returnItem;
	}

	public Item getLighter() {
		return lighter;
	}
	public Item getKnife() {
		return knife;
	}
	public Item getToiletPaper() {
		return toiletPaper;
	}
	public Item getShampoo() {
		return shampoo;
	}
	public Item getDogFood() {
		return dogFood;
	}
	public Item getFork() {
		return fork;
	}
	public Item getTvChanger() {
		return tvChanger;
	}
	public Item getBattery() {
		return battery;
	}
	public Item getScissors() {
		return scissors;
	}
	public Item getCanFood() {
		return canFood;
	}
	public Item getCigs() {
		return cigs;
	}
	public Item getCandle() {
		return candle; ////////////junit!!!!!!!!!!!!!
	}
	public Item getFirePoker() {
		return firePoker; ////////////junit!!!!!!!!!!!!!
	}

}

