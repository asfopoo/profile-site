package entity;

public class Item {
	private int size;
	private String name;
	private ItemType type;
	
	public Item(int size, String name, ItemType type) {
		this.size = size;
		this.name = name;
		this.type = type;
	}
	
	public int getSize() {
		return size;
	}
	public String getName() {
		return name;
	}
	public ItemType getItemType() {
		return type;
	}

}

