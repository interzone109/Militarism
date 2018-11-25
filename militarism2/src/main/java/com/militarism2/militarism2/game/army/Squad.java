package com.militarism2.militarism2.game.army;

import java.util.List;

import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unity.Citizen;
import com.militarism2.militarism2.game.unity.Formation;
import com.militarism2.militarism2.game.unity.able.Warable;
import com.militarism2.militarism2.game.unity.types.Subdivision;

/**
 * 
 * @author interzone
 *
 */
public class Squad extends Formation implements Warable {
	private final int FIRERANGE = 5;
	private final int SPEED = 30;
	private int damage = 25;
	private int damageRange = 25;
	private Subdivision subdivision;

	public Squad(String country, List<Citizen> personal, Subdivision subdivision, Point currentLocation) {
		super.setCountry(country);
		super.setCommand(personal);
		super.setCurentLocation(currentLocation);
		super.setFiringRange(FIRERANGE);
		super.setSpeed(SPEED);
		super.setVisibility(100);
		this.subdivision = subdivision;

	}

	@Override
	public void takeDamage(int damag) {
		// TODO Auto-generated method stub

	}

	@Override
	public int atack() {
		
		return 0;
	}

}
