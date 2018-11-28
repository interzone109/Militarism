package com.militarism2.militarism2.game.army.template;

import com.militarism2.militarism2.game.feature.ArmyData;
import com.militarism2.militarism2.game.feature.Damage;
import com.militarism2.militarism2.game.feature.Position;
import com.militarism2.militarism2.game.feature.Stock;

/**
 * @class Template абстрактный класс используеться классоь Factory для
 *        заполнения полей игровых обьектов
 * 
 */
public abstract class Template {

	private int defense;
	private ArmyData info;
	private Damage damage;
	private Position position;
	private Stock stock;

	public Template(int defense, ArmyData info, Damage damage, Position position, Stock stock) {
		this.info = info;
		this.defense = defense;
		this.damage = damage;
		this.position = position;
		this.stock = stock;
	}

	public int getDefense() {
		return defense;
	}

	public ArmyData getInfo() {
		return info.clone();
	}

	public Damage getDamage() {
		return damage.clone();
	}

	public Position getPosition() {
		return position.clone();
	}

	public Stock getStock() {
		return stock.clone();
	}
}
