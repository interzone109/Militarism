package com.militarism2.militarism2.game.feature;

import lombok.Data;

/**
 * Класс Damage содержить основные показатели огневой мощи: урон и максимальный
 * диапазон урона
 */
@Data
public class Damage {
	private int damage;
	private int damageRange;
	private int shotRange;

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
