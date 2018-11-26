package com.militarism2.militarism2.game.army;


import com.militarism2.militarism2.game.unity.Formation;
import com.militarism2.militarism2.game.unity.able.Warable;
import com.militarism2.militarism2.game.util.CitizenUtil;

/**
 * 
 * @author interzone реализацая боевого отряда
 */
public class Infantry extends Formation implements Warable {

	@Override
	public void takeDamage(int loss) {

	}

	@Override
	public int atack() {
		return 0;
	}

	@Override
	public boolean isAlive() {
		return CitizenUtil.recount(getCommand()) > 0;
	}

}
