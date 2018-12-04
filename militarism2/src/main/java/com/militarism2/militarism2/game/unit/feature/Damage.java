package com.militarism2.militarism2.game.unit.feature;

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

	/**
	 * @param damage      - урон
	 * @param damageRange - диапазон урона
	 * @param shotRange   - дальность выстрела
	 */
	public Damage(int damage, int damageRange, int shotRange) {
		this.shotRange = shotRange;
		this.damage = damage;
		this.damageRange = damageRange;
	}

	@Override
	public String toString() {
		return "damage:" + damage + "+" + damageRange + " shot range:" + shotRange + "\n";
	}

}
