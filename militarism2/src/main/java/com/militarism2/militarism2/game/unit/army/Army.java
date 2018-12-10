package com.militarism2.militarism2.game.unit.army;

import java.util.Random;

import com.militarism2.militarism2.game.unit.army.template.Template;
import com.militarism2.militarism2.game.unit.entity.ArmyEntity;
import com.militarism2.militarism2.game.unit.feature.ArmyData;
import com.militarism2.militarism2.game.unit.feature.Damage;
import com.militarism2.militarism2.game.unit.feature.Position;
import com.militarism2.militarism2.game.unit.feature.Stock;
import com.militarism2.militarism2.game.unit.type.ArmyType;
import com.militarism2.militarism2.game.unity.able.Warable;

import lombok.Data;
@Data
public abstract class Army implements Warable {
	protected ArmyData armyData;
	protected Damage atack;
	protected Position position;
	protected Random rand;
	protected ArmyEntity armyEntity;


	public Army(ArmyEntity armyEntity ) {	
		this.armyEntity = armyEntity;
		
		Template t = armyEntity.getTemplate();
		this.armyData = new ArmyData(t.getName(), t.getCountry());
		this.atack = new Damage(t.getDamage(), t.getDamageRange(), t.getShotRange());
		this.position = new Position(armyEntity.getCurrentLocation(), t.getSpeed(), t.getStealth(), t.getVisibility());

		
		rand = new Random();
	}

	public ArmyType getArmyType() {
		return armyEntity.getTemplate().getArmyType();
	}
	
	/**
	 * @param Stock - обьект класса Stock, сумируеться с текущим обьектом
	 */
	@Override
	public void union(Stock unionStock) {
		Stock stock = armyEntity.getStock();
		stock.setAmmunition(stock.getAmmunition() + unionStock.getAmmunition());
		stock.setFood(stock.getFood() + unionStock.getFood());
		stock.setGasoline(stock.getGasoline() + unionStock.getGasoline());
	}
	
	
}
