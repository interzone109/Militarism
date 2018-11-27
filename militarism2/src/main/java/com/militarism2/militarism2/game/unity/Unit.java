package com.militarism2.militarism2.game.unity;

import com.militarism2.militarism2.game.unity.able.Warable;

public abstract class Machine extends Formation implements Warable{

	@Override
	public abstract boolean isAlive();

}
