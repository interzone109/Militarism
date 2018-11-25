package com.militarism2.militarism2.game.models;

import org.junit.Test;

import com.militarism2.militarism2.game.army.Squad;
import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unity.types.Subdivision;
import com.militarism2.militarism2.game.util.CitizenUtil;

public class SquadTest {
	@Test
	public void test_damag_atack_Squad() {
		Squad squad1 = new Squad("SSSR", CitizenUtil.createCitizen(30), Subdivision.SQUAD, new Point(1, 1));
		Squad squad2 = new Squad("Germany", CitizenUtil.createCitizen(30), Subdivision.SQUAD, new Point(1, 1));
	}

}
