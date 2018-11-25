package com.militarism2.militarism2.game.models;

import static org.junit.Assert.assertEquals;

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
	int at = squad1.atack();
	squad2.takeDamage(at);
	squad2.takeDamage(at);
	squad2.takeDamage(at);
	squad2.takeDamage(at);
	assertEquals(false, squad2.isAlive());
	int dam = squad2.atack();
	assertEquals(0, dam);
	}

}
