package com.militarism2.militarism2.game.unit.army;

import java.util.Random;

import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unit.army.template.Template;
import com.militarism2.militarism2.game.unit.feature.ArmyData;
import com.militarism2.militarism2.game.unit.feature.Damage;
import com.militarism2.militarism2.game.unit.feature.Formation;
import com.militarism2.militarism2.game.unit.feature.Position;
import com.militarism2.militarism2.game.unit.feature.Stock;
import com.militarism2.militarism2.game.unity.able.Supportable;
import com.militarism2.militarism2.game.unity.able.Warable;

public class Support  implements Warable , Supportable{

	private Formation formation;
	private ArmyData armyData;
	private Damage atack;
	private Position position;
	private Stock stock;
	private Random rand;

	public Support(Template supportTemplate) {
		this.formation = supportTemplate.getFormation();
		this.armyData = supportTemplate.getArmyData();
		this.atack = supportTemplate.getDamage();
		this.position = supportTemplate.getPosition();
		this.stock = supportTemplate.getStock();
		rand = new Random();
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
	public int getUnits() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[] getProvision() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stock suppot() {
		// TODO Auto-generated method stub
		return null;
	}


}
