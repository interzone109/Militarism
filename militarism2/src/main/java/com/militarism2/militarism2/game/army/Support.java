package com.militarism2.militarism2.game.army.tools;

import com.militarism2.militarism2.game.unity.Machine;
import com.militarism2.militarism2.game.unity.Product;
import com.militarism2.militarism2.game.unity.able.Suportable;

public class Support extends Machine implements Suportable {

	@Override
	public void takeDamage(int loss) {
		// TODO Auto-generated method stub

	}

	@Override
	public int atack() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Product supportAmmunition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product supportFood() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int supportFix() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return false;
	}

}
