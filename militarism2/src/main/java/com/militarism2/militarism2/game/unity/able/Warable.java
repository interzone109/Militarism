package com.militarism2.militarism2.game.unity.able;

import com.militarism2.militarism2.game.map.Point;

public interface Warable {

	void takeDamage(int loss);

	int atack();

	void move(Point nextPoint);
	
	boolean isAlive();
	
}
