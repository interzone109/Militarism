package com.militarism2.militarism2.game.unit.feature;

import com.militarism2.militarism2.game.map.Point;

/**
 * Класс Position описывает текущую позицию отряда,
 * конечную тучку , скорость передвижения, видиность. 
 * */

import lombok.Data;

/**
 * Класс Position описывает текущее местоположение отряда, скорость, видимость,
 * конечная точка
 * 
 * 
 */
@Data
public class Position {

	private Point curentLocation;
	private Point nextLocation;

	private int stealth;
	private int speed;
	private int visibility;

	/**
	 * @param point      - начальная точка
	 * @param speed      - скорость, условно в км за одни ход
	 * @param visibility - дальность обзора отряда
	 * @param stealth    - процент скрытности
	 */
	public Position(Point point, int speed, int stealth, int visibility) {
		this.curentLocation = point;
		this.nextLocation = this.curentLocation;
		this.speed = speed;
		this.visibility = visibility;
		this.stealth = stealth;
	}

	@Override
	public String toString() {
		return "speed:" + speed + " visibility:" + visibility + "stealth"+stealth+"\n";
	}
}
