package JUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import entity.Area;

public class AreaTest {
	
	Area area = new Area("name", "para", "1", "2", "3", "4", "5", "6", "l1", "l2", "l3", "l4", "l5", "l6", "pic.png");
	
	
	@Test
	public void testGetName() {
		assertEquals("name", area.getName());
	}
	@Test
	public void testGetPara() {
		assertEquals("para", area.getPara());
	}
	@Test
	public void testGetOpt1() {
		assertEquals("1", area.getOpt1());
	}
	@Test
	public void testGetOpt2() {
		assertEquals("2", area.getOpt2());
	}
	@Test
	public void testGetOpt3() {
		assertEquals("3", area.getOpt3());
	}
	@Test
	public void testGetOpt4() {
		assertEquals("4", area.getOpt4());
	}
	@Test
	public void testGetOpt5() {
		assertEquals("5", area.getOpt5());
	}
	@Test
	public void testGetOpt6() {
		assertEquals("6", area.getOpt6());
	}
	@Test
	public void testGetLnk1() {
		assertEquals("l1", area.getLnk1());
	}
	@Test
	public void testGetLnk2() {
		assertEquals("l2", area.getLnk2());
	}
	@Test
	public void testGetLnk3() {
		assertEquals("l3", area.getLnk3());
	}
	@Test
	public void testGetLnk4() {
		assertEquals("l4", area.getLnk4());
	}
	@Test
	public void testGetLnk5() {
		assertEquals("l5", area.getLnk5());
	}
	@Test
	public void testGetLnk6() {
		assertEquals("l6", area.getLnk6());
	}
	@Test
	public void testGetPicture() {
		assertEquals("pic.png", area.getPicture());
	}


}
