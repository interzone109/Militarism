package com.militarism2.militarism2.game.unit.army;


import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unit.entity.ArmyEntity;
import com.militarism2.militarism2.game.unit.feature.Formation;
import com.militarism2.militarism2.game.unit.feature.Stock;


/**
 * 
 * @author interzone реализацая боевого отряда
 */

public class Infantry extends Army {


	public Infantry(ArmyEntity armyEntity) {
		super(armyEntity);
		
		/*this.armyEntity = armyEntity;
		this.formation = armyEntity.getFormation();//new Formation(t.getQuantityStuff(), t.getQuantityUnits(), t.getDefense(), t.getExpirience());
		this.stock = armyEntity.getStock();//new Stock();
		
		Template t = armyEntity.getTemplate();
		this.armyData = new ArmyData(t.getName(), t.getCountry());
		this.atack = new Damage(t.getDamage(), t.getDamageRange(), t.getShotRange());
		this.position = new Position(armyEntity.getCurrentLocation(), t.getSpeed(), t.getStealth(), t.getVisibility());
		
		armyType = ArmyType.INFANTRY;
		rand = new Random();*/
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
		int damage = atack.getDamage();
		int damageRange = atack.getDamageRange();
		int quantityUnits = armyEntity.getFormation().getQuantityUnits();
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
		return armyEntity.getFormation().getQuantityUnits() < 0;
	}

	

	@Override
	public String toString() {
		return armyData.toString() + atack.toString() + position.toString() + armyEntity.getFormation().toString() + armyEntity.getStock().toString();
	}
	



}
