package com.militarism2.militarism2.game.Infantry;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.militarism2.militarism2.game.build.Factory;
import com.militarism2.militarism2.game.feature.Stock;
import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unity.able.Warable;

public class InfantryTest {
	private Factory factory;
	private Warable squad1;
	private Warable squad2;

	@Before
	public void factory() {
		factory = new Factory("USSR", new Point(1, 1));

	}

	@Test
	public void infantryAtackTest() {
		squad1 = factory.creat("Squad");
		squad2 = factory.creat("Squad");

		int currentQuantity = squad2.getUnits();

		int atack1 = squad1.atack();

		squad2.takeDamage(atack1);
		assertTrue(squad2.getUnits() < currentQuantity);

		// System.out.println("create Infantry");
		// System.out.println(squad1.toString());
	}

	@Test
	public void infantryTakeDamageTest() {
		squad1 = factory.creat("Squad");
		squad2 = factory.creat("Squad");

		int atack1 = squad1.atack();

		squad2.takeDamage(atack1);
		squad2.takeDamage(atack1);
		assertFalse(squad2.isAlive());

		// System.out.println("create Infantry");
		// System.out.println(squad1.toString());
	}

	@Test
	public void infantryUnionTest() {
		squad1 = factory.creat("Squad");
		Stock stock = new Stock();
		stock.setAmmunition(500);
		stock.setFood(300);
		stock.setOil(0);

		squad1.union(stock);
		
		int[] expected = { 300, 500, 0 };
		int[] actual = squad1.getProvision();
		assertEquals(Arrays.toString(expected), Arrays.toString(actual));

		//System.out.println("create Infantry");
		//System.out.println(squad1.toString());
	}

}
