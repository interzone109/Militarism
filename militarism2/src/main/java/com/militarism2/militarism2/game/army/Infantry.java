package com.militarism2.militarism2.game.army;

import com.militarism2.militarism2.game.unity.Unit;

/**
 * 
 * @author interzone реализацая боевого отряда
 */
public class Infantry extends Unit {

	@Override
	public void takeDamage(int loss) {

	}

	@Override
	public int atack() {
		return 0;
	}

	@Override
	public boolean isAlive() {
		return false ;
	}

}
