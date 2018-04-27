package gamePersist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import entity.Area;
import entity.Item;
import entity.LinearArea;




public class InitialData {
	public static List<Item> getHouseItems() throws IOException { // reads house items from csv
		List<Item> houseItems = new ArrayList<Item>();
		ReadCSV readItems = new ReadCSV("houseItems.csv");
		try {
			// auto-generated primary key for authors table
			Integer itemId = 1;
			while (true) {
				List<String> tuple = readItems.next();
				if (tuple == null) {
					break;
				}
				Iterator<String> i = tuple.iterator();
				Item item = new Item(0, null, null);
				System.out.println(itemId);
				item.setHouseInventoryId(itemId++);				
				item.setName(i.next());
				item.setType(i.next());
				item.setSize(Integer.parseInt(i.next()));
				houseItems.add(item);
			}
			System.out.println("house inventory populated");
			return houseItems;
		} finally {
			readItems.close();
		}
	}
	public static List<Area> getArea() throws IOException { //reads areas from csv
		List<Area> areaList = new ArrayList<Area>();
		ReadCSV readArea = new ReadCSV("area.csv");
		try {
			// auto-generated primary key for authors table
			Integer itemId = 1;
			while (true) {
				List<String> tuple = readArea.next();
				if (tuple == null) {
					break;
				}
				Iterator<String> i = tuple.iterator();
				Area area = new Area(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
				System.out.println(itemId);
				area.setAreaInventoryId(itemId++);
				area.setName(i.next());
				area.setPara(i.next());
				area.setOpt1(i.next());
				area.setOpt2(i.next());
				area.setOpt3(i.next());
				area.setOpt4(i.next());
				area.setOpt5(i.next());
				area.setOpt6(i.next());
				area.setLnk1(i.next());
				area.setLnk2(i.next());
				area.setLnk3(i.next());
				area.setLnk4(i.next());
				area.setLnk5(i.next());
				area.setLnk6(i.next());
				area.setPicture(i.next());
				areaList.add(area);
			}
			System.out.println(itemId);
			System.out.println("area populated ");
			return areaList;
		} finally {
			readArea.close();
		}
	}
	
	public static List<LinearArea> getLinearArea() throws IOException { //reads areas from csv
		List<LinearArea> linearAreaList = new ArrayList<LinearArea>();
		ReadCSV readArea = new ReadCSV("linearArea.csv");
		try {
			// auto-generated primary key for authors table
			Integer itemId = 1;
			while (true) {
				List<String> tuple = readArea.next();
				if (tuple == null) {
					break;
				}
				Iterator<String> i = tuple.iterator();
				LinearArea linearArea = new LinearArea(null, null);
				System.out.println(itemId);
				linearArea.setLinearAreaInventoryId(itemId++);
				linearArea.setName(i.next());
				linearArea.setPara(i.next());
				
			}
			System.out.println(itemId);
			System.out.println("area populated ");
			return linearAreaList;
		} finally {
			readArea.close();
		}
	}
}
