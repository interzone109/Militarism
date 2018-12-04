package com.militarism2.militarism2.game.unit.feature;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
@Entity
@Table(name = "positions")
@Data
public class Position {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "position_Id", nullable = false, updatable = false, unique = true)
	private Long id;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "curent_location_Id")
	private Point curentLocation;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "next_location_Id")
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
