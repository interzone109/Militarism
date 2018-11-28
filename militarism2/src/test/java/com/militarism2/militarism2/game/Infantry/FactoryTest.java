package com.militarism2.militarism2.game.Infantry;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.militarism2.militarism2.game.build.City;
import com.militarism2.militarism2.game.build.Factory;
import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unity.able.Warable;

public class FactoryTest {
	private  Factory factory;
	private Warable squad1 ;
	private	Warable squad2;
	@Before
	public void factory() {
		 factory = new Factory("USSR",new Point(1,1));
		 
	}
	
	@Test
	public void crearteInfantryTest() {
		Warable squad1 = factory.creat("Squad");
		 Warable squad2 = factory.creat("Squad");
		 
		assertNotNull(squad1);
		assertNotNull(squad2);
		
		System.out.println("create Infantry");
		System.out.println(squad1.toString());
		System.out.println("create Infantry");
		System.out.println(squad2.toString());
		
		assertNotEquals(squad1, squad2);
	}

	
}
