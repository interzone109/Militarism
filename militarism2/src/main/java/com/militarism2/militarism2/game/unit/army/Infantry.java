package com.militarism2.militarism2.game.unit.army;

import java.util.Random;

import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unit.army.template.TemplateBreak;
import com.militarism2.militarism2.game.unit.army.template.Template;
import com.militarism2.militarism2.game.unit.entity.ArmyEntity;
import com.militarism2.militarism2.game.unit.feature.ArmyData;
import com.militarism2.militarism2.game.unit.feature.Damage;
import com.militarism2.militarism2.game.unit.feature.Formation;
import com.militarism2.militarism2.game.unit.feature.Position;
import com.militarism2.militarism2.game.unit.feature.Stock;
import com.militarism2.militarism2.game.unit.type.ArmyType;
import com.militarism2.militarism2.game.unity.able.Warable;

import lombok.Data;

/**
 * 
 * @author interzone реализацая боевого отряда
 */
@Data
public class Infantry implements Warable {
	long id;
	private Formation formation;
	private ArmyData armyData;
	private Damage atack;
	private Position position;
	private Stock stock;
	private ArmyType armyType;

	private Random rand;


	public Infantry(Template t, Point startPoint) {
		this.formation = new Formation(t.getQuantityStuff(), t.getQuantityUnits(), t.getDefense(), t.getExpirience());
		this.armyData = new ArmyData(t.getName(), t.getCountry());
		this.atack = new Damage(t.getDamage(), t.getDamageRange(), t.getShotRange());
		this.position = new Position(startPoint, t.getSpeed(), t.getStealth(), t.getVisibility());
		this.stock = new Stock();
		rand = new Random();
	}

	@Override
	public void takeDamage(int loss) {
		int units = formation.getQuantityUnits();
		int deads = loss / formation.getDefense();
		formation.setQuantityUnits(deads > units ? 0 : units - deads);
	}

	/**
	 * 
	 * */
	@Override
	public int atack() {
		int damage = atack.getDamage();
		int damageRange = atack.getDamageRange();
		int quantityUnits = formation.getQuantityUnits();
		return (rand.nextInt(((damage + damageRange) - damage) + 1) + damage) * quantityUnits;

	}

	@Override
	public void move(Point nextPoint) {
		position.setNextLocation(nextPoint);
		// move logic
		position.setCurentLocation(nextPoint);
	}

	@Override
	public boolean isAlive() {
		return formation.getQuantityUnits() < 0;
	}

	/**
	 * @param Stock - обьект класса Stock, сумируеться с текущим обьектом
	 */
	@Override
	public void union(Stock unionStock) {
		stock.setAmmunition(stock.getAmmunition() + unionStock.getAmmunition());
		stock.setFood(stock.getFood() + unionStock.getFood());
		stock.setGasoline(stock.getGasoline() + unionStock.getGasoline());
	}

	@Override
	public String toString() {
		return armyData.toString() + atack.toString() + position.toString() + formation.toString() + stock.toString();
	}

	@Override
	public int getUnits() {
		return formation.getQuantityUnits();
	}

	@Override
	public int[] getProvision() {
		int[] provision = { stock.getFood(), stock.getAmmunition(), stock.getGasoline() };
		return provision;
	}

}
