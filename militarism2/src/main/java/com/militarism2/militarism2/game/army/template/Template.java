package com.militarism2.militarism2.game.army.template;

import com.militarism2.militarism2.game.feature.ArmyData;
import com.militarism2.militarism2.game.feature.Damage;
import com.militarism2.militarism2.game.feature.Formation;
import com.militarism2.militarism2.game.feature.Position;
import com.militarism2.militarism2.game.feature.Stock;

/**
 * @class Template абстрактный класс используеться классоь Factory для
 *        заполнения полей игровых обьектов
 * 
 */
public abstract class Template {

	private Formation formation;
	private ArmyData armyData;
	private Damage damage;
	private Position position;
	private Stock stock;

	public Template(Formation formation, ArmyData armyData, Damage damage, Position position, Stock stock) {
		this.formation = formation;
		this.armyData = armyData;
		this.damage = damage;
		this.position = position;
		this.stock = stock;
	}

	public ArmyData getArmyData() {
		return armyData.clone();
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

	public Formation getFormation() {
		return formation.clone();
	}
}
