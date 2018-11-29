package com.militarism2.militarism2.game.army;

import java.util.Random;

import com.militarism2.militarism2.game.army.template.Template;
import com.militarism2.militarism2.game.feature.ArmyData;
import com.militarism2.militarism2.game.feature.Damage;
import com.militarism2.militarism2.game.feature.Formation;
import com.militarism2.militarism2.game.feature.Position;
import com.militarism2.militarism2.game.feature.Stock;
import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unity.able.Flyable;
import com.militarism2.militarism2.game.unity.able.Warable;

public class Airplane implements Warable, Flyable {

	private Formation formation;
	private ArmyData armyData;
	private Damage atack;
	private Position position;
	private Stock stock;
	private Random rand;

	public Airplane(Template airplaneTemplate) {
		this.formation = airplaneTemplate.getFormation();
		this.armyData = airplaneTemplate.getArmyData();
		this.atack = airplaneTemplate.getDamage();
		this.position = airplaneTemplate.getPosition();
		this.stock = airplaneTemplate.getStock();
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
	public void takeoff() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void landing() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean isFly() {
		// TODO Auto-generated method stub
		return false;
	}

}
