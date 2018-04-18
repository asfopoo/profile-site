package JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import entity.Area;
import entity.Item;
import entity.LocationType;
import model.Game;

public class ItemTests {
	Game model = new Game();
	
	
	
	
	
	
	
	@Test
	public void testGetSize() {
		assertEquals(1, model.getLighter().getSize());
		assertEquals(2, model.getCigs().getSize());
		assertEquals(4, model.getToiletPaper().getSize());
	}
	@Test
	public void testGetName() {
		assertEquals("fork", model.getFork().getName());
		assertEquals("greenLighter", model.getLighter().getName());
		assertEquals("battery", model.getBattery().getName());
	}
	@Test
	public void testGetItemType() {
		assertEquals("utility", model.getShampoo().getItemType());
		assertEquals("food", model.getDogFood().getItemType());
	}
	@Test
	public void testGetLighter() {
		assertEquals(1, model.getLighter().getSize());
		assertEquals("greenLighter", model.getLighter().getName());
		assertEquals("utility", model.getLighter().getItemType());
	}
	@Test
	public void testGetKnife() {
		assertEquals(3, model.getKnife().getSize());
		assertEquals("knife", model.getKnife().getName());
		assertEquals("utility", model.getKnife().getItemType());
	}
	@Test
	public void testGetToiletPaper() {
		assertEquals(4, model.getToiletPaper().getSize());
		assertEquals("toiletPaper", model.getToiletPaper().getName());
		assertEquals("utility", model.getToiletPaper().getItemType());
	}
	@Test
	public void testGetShampoo() {
		assertEquals(4, model.getShampoo().getSize());
		assertEquals("shampoo", model.getShampoo().getName());
		assertEquals("utility", model.getShampoo().getItemType());
	}
	@Test
	public void testGetDogFood() {
		assertEquals(3, model.getDogFood().getSize());
		assertEquals("dogFood", model.getDogFood().getName());
		assertEquals("food", model.getDogFood().getItemType());
	}
	@Test
	public void testGetFork() {
		assertEquals(2, model.getFork().getSize());
		assertEquals("fork", model.getFork().getName());
		assertEquals("utility", model.getFork().getItemType());
	}
	@Test
	public void testGetTvChanger() {
		assertEquals(3, model.getTvChanger().getSize());
		assertEquals("tvChanger", model.getTvChanger().getName());
		assertEquals("utility", model.getTvChanger().getItemType());
	}
	@Test
	public void testGetBattery() {
		assertEquals(1, model.getBattery().getSize());
		assertEquals("battery", model.getBattery().getName());
		assertEquals("utility", model.getBattery().getItemType());
	}
	@Test
	public void testGetScissors() {
		assertEquals(3, model.getScissors().getSize());
		assertEquals("scissors", model.getScissors().getName());
		assertEquals("utility", model.getScissors().getItemType());
	}
	@Test
	public void testGetCanFood() {
		assertEquals(4, model.getCanFood().getSize());
		assertEquals("canFood", model.getCanFood().getName());
		assertEquals("food", model.getCanFood().getItemType());
	}
	@Test
	public void testGetCigs() {
		assertEquals(2, model.getCigs().getSize());
		assertEquals("cigs", model.getCigs().getName());
		assertEquals("utility", model.getCigs().getItemType());
	}
	@Test
	public void testGetChange() { /// 2 instances of change ??????
		assertEquals(3, model.getChange().getSize());
		assertEquals("change", model.getChange().getName());
		assertEquals("utility", model.getChange().getItemType());
	}
	@Test
	public void testGetCandle() {
		assertEquals(2, model.getCandle().getSize());
		assertEquals("candle", model.getCandle().getName());
		assertEquals("utility", model.getCandle().getItemType());
	}
	@Test
	public void testGetFirePoker() {
		assertEquals(7, model.getFirePoker().getSize());
		assertEquals("firePoker", model.getFirePoker().getName());
		assertEquals("weapon", model.getFirePoker().getItemType());
	}
	@Test
	public void testGetBandAids() {
		assertEquals(2, model.getBandAids().getSize());
		assertEquals("bandAids", model.getBandAids().getName());
		assertEquals("utility", model.getBandAids().getItemType());
	}
	public void testGetGun() {
		assertEquals(4, model.getGun().getSize());
		assertEquals("gun", model.getGun().getName());
		assertEquals("weapon", model.getGun().getItemType());
	}
	public void testGetShovel() {
		assertEquals(7, model.getShovel().getSize());
		assertEquals("shovel", model.getShovel().getName());
		assertEquals("utility", model.getShovel().getItemType());
	}
	public void testGetFlashlight() {
		assertEquals(4, model.getFlashlight().getSize());
		assertEquals("flashlight", model.getFlashlight().getName());
		assertEquals("utility", model.getFlashlight().getItemType());
	}
	public void testGetSocketSet() {
		assertEquals(5, model.getSocketSet().getSize());
		assertEquals("socketSet", model.getSocketSet().getName());
		assertEquals("utility", model.getSocketSet().getItemType());
	}
}
