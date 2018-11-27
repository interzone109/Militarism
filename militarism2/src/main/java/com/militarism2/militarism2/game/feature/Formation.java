package com.militarism2.militarism2.game.unity;

import java.util.List;

import com.militarism2.militarism2.game.map.Point;

import lombok.Data;

/**
 * 
 * @author interzone; 
 * Содержит основные параметры подразделений; 
 * 
 *
 */
@Data
public abstract class Formation {
	private final int MINIMAL_QUANTITY = 1;
	private Point curentLocation;
	private int speed;
	private int visibility;
	private int firingRange;
	private int expirience ;
	private int damage = 15;
	private int damageRange = 35;

	public abstract boolean isAlive();
}
