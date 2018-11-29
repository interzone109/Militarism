package com.militarism2.militarism2.game.unity.able;

public interface Flyable extends Warable {
	void takeoff();

	void landing();

	boolean isFly();
}
