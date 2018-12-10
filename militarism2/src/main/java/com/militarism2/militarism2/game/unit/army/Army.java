package com.militarism2.militarism2.game.unit.army;

import java.util.Random;

import com.militarism2.militarism2.game.unit.entity.ArmyEntity;
import com.militarism2.militarism2.game.unit.feature.Stock;
import com.militarism2.militarism2.game.unit.type.ArmyType;
import com.militarism2.militarism2.game.unity.able.Warable;

import lombok.Data;
@Data
public abstract class Army implements Warable {
	protected Random rand;
	protected ArmyEntity armyEntity;


	public Army(ArmyEntity armyEntity ) {	
		this.armyEntity = armyEntity;
		
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
