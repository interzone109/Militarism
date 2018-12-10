package com.militarism2.militarism2.game.unit.army;


import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unit.entity.ArmyEntity;
import com.militarism2.militarism2.game.unit.feature.Formation;


/**
 * 
 * @author interzone реализацая боевого отряда
 */

public class Infantry extends Army {


	public Infantry(ArmyEntity armyEntity) {
		super(armyEntity);

	}

	@Override
	public void takeDamage(int loss) {
		Formation formation = armyEntity.getFormation();
		int units = formation.getQuantityUnits();
		int deads = loss / formation.getDefense();
		formation.setQuantityUnits(deads > units ? 0 : units - deads);
	}

	/**
	 * 
	 * */
	@Override
	public int atack() {
		int damage = armyEntity.getTemplate().getDamage();
		int damageRange = armyEntity.getTemplate().getDamageRange();
		int quantityUnits = armyEntity.getFormation().getQuantityUnits();
		return (rand.nextInt(((damage + damageRange) - damage) + 1) + damage) * quantityUnits;

	}

	@Override
	public void move(Point nextPoint) {
		armyEntity.setFinalLocation(nextPoint);
	}

	@Override
	public boolean isAlive() {
		return armyEntity.getFormation().getQuantityUnits() < 0;
	}

	
	@Override
	public void expenseAmunition() {
		// TODO Auto-generated method stub
		
	}



}
