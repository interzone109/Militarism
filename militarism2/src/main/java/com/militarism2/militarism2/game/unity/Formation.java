package com.militarism2.militarism2.game.unity;

import java.util.List;

import com.militarism2.militarism2.game.map.Point;

import lombok.Data;

/**
 * 
 * @author interzone; 
 * Содержит основные параметры подразделений; Point
 * curentLocation -текущая локация ; 
 * List<Citizen> command - состав; 
 * int speed - скорость передвижения; 
 * int visibility - видимость отряда; 
 * int firingRange - дальность стрельбы; 
 * int expirience- опыт; 
 * String country; 
 * и get, set методы ;
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
	private String country;
	private int expirience = 0;

	public abstract boolean isAlive();
}
