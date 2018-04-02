package gamePersist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import entity.Item;




public class InitialData {
	public static List<Item> getHouseItems() throws IOException {
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
				item.setHouseInventoryId(itemId++);				
				item.setName(i.next());
				item.setType(i.next());
				item.setSize(Integer.parseInt(i.next()));
				houseItems.add(item);
			}
			return houseItems;
		} finally {
			readItems.close();
		}
	}
}
