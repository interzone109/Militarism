package com.militarism2.militarism2.game.unity.able;

import com.militarism2.militarism2.game.feature.Stock;
import com.militarism2.militarism2.game.map.Point;

/**
 * Интерфайс Warable содержит основные методы всех юнитов:
 * получение урона, нанесение урона, передвижение на следующую точку,
 * прием снабжения, жив ли отряд.
 * */
public interface Warable {

	void takeDamage(int loss);

	int atack();

	void move(Point nextPoint);
	
	boolean isAlive();
	
	void union(Stock unionStock);

	int getUnits();
	
	int[] getProvision();
}
