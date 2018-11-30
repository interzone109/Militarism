package com.militarism2.militarism2.game.unit.feature;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Класс Damage содержить основные показатели огневой мощи: урон и максимальный
 * диапазон урона
 */
@Entity
@Table(name = "damages")
@Data
public class Damage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "damage_Id", nullable = false, updatable = false, unique = true)
	private Long id;
	
	private int damage;
	@Column(name = "damage_range")
	private int damageRange;
	@Column(name = "shot_range")
	private int shotRange;
	/**
	 * @param damage - урон
	 * @param damageRange - диапазон урона
	 * @param shotRange - дальность выстрела
	 * */
	public Damage(int damage, int damageRange, int shotRange) {
		this.shotRange = shotRange;
		this.damage = damage;
		this.damageRange = damageRange;
	}

	public Damage clone() {
		return new Damage(damage, damageRange,shotRange);
	}

	@Override
	public String toString() {
		return "damage:" + damage + "+" + damageRange 
				+ " shot range:"+shotRange+"\n";
	}

}
