package com.militarism2.militarism2.game.feature;

import java.util.Random;

public class Damage {
	private int damage;
	private int damageRange;
	private Random rand;

	public Damage(int damage, int damageRange) {
		this.damage = damage;
		this.damageRange = damageRange;
	}

	/**
	 * Метод возращает урон из расчета урон + диапазон поврежден. Урон -30 диапазон
	 * -15 : минимальный урон 30 максимальный 45.
	 * 
	 * @param quantity - количетво единиц в отряде
	 */
	public int shot(int quantity) {
		return (rand.nextInt(((damage + damageRange) - damage) + 1) + damage) * quantity;
	}

	public int getDamage() {
		return damage;
	}

	public int getDamageRange() {
		return damageRange;
	}

	@Override
	public String toString() {
		return "damage:"+damage+"+"+damageRange+"\n";
	}
	
	public Damage clone()  {
		// TODO Auto-generated method stub
		return new Damage(damage, damageRange);
	}
}

