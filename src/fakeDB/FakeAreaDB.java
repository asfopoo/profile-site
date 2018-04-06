package fakeDB;


public class FakeAreaDB {
	private int areaNum = 0;
	private String para = null;
	private String[] options = new String[6];
	public FakeAreaDB(){
	}
	
	public void setArea(int num){
		areaNum = num;
	}
	
	public void setScreen(){
		if(areaNum == 1){
			para = "Hello";
			options[0] = "Check the first dresser";
			options[1] = "Check the second dresser";
			options[2] = "Check the bed";
			options[3] = "Make the bed";
			options[4] = "Turn off the TV";
			options[5] = "Leave the room";
		}
	}
	public String getPara(){
		System.out.println(areaNum);
		System.out.println(para);
		return para;
	}
	public String[] getOptions(){
		return options;
	}
}
