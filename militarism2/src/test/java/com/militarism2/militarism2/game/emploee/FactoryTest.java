package com.militarism2.militarism2.game.emploee;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.militarism2.militarism2.game.build.Factory;
import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unity.Citizen;
import com.militarism2.militarism2.game.unity.Product;
import com.militarism2.militarism2.game.unity.types.Production;

public class FactoryTest {
	@Test//проверка производительности
	public void get_factory_test() {
		List<Citizen> list = getCitizen(30);
		Factory farm = new Factory(new Point(1, 1), list, Production.FARM);

		Product product = farm.getWork();
		int result = product.getQuantity();
		assertEquals(150, result);
		
		for (int i = 0; i <26; i++) {
			farm.getWorkOverTime();
		}
		assertEquals(0, farm.recount());
	}

	public List<Citizen> getCitizen(int count) {
		List<Citizen> list = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			list.add(new Citizen("Germany"));
		}
		return list;
	}
}
