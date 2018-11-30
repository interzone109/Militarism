package com.militarism2.militarism2.game.unity.able;

/**
 * Интерфейс Flyable использаеться классом Airplane для 
 * взлета, посадки и проверки состояния 
 * */
public interface Flyable extends Warable {
	void takeoff();

	void landing();

	boolean isFly();
}
