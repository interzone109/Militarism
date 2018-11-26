package com.militarism2.militarism2.game.unity;

import java.util.List;

import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unity.types.Subdivision;

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
	private List<Citizen> command;
	private int speed;
	private int visibility;
	private int firingRange;
	private int expirience ;
	private int damage = 15;
	private int damageRange = 35;
	private Subdivision subdivision;

	public abstract boolean isAlive();
}
