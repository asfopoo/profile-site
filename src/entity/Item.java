package entity;

public class Item {
	private int size;
	private String name;
	private String type;
	
	public Item(int size, String name, String type) {
		this.size = size;
		this.name = name;
		this.type = type;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getItemType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}

