package com.militarism2.militarism2.game.unit.army;



import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unit.entity.ArmyEntity;
import com.militarism2.militarism2.game.unit.feature.Stock;
import com.militarism2.militarism2.game.unity.able.Swimable;

public class Shipe extends Army implements Swimable {


	public Shipe(ArmyEntity armyEntity) {
	super(armyEntity);
	}

	@Override
	public void takeDamage(int loss) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int atack() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void move(Point nextPoint) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void union(Stock unionStock) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void expenseAmunition() {
		// TODO Auto-generated method stub
		
	}



	

}
