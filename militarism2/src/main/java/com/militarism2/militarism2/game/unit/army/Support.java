package com.militarism2.militarism2.game.unit.army;

import java.util.Random;

import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unit.army.template.Template;
import com.militarism2.militarism2.game.unit.feature.ArmyData;
import com.militarism2.militarism2.game.unit.feature.Damage;
import com.militarism2.militarism2.game.unit.feature.Formation;
import com.militarism2.militarism2.game.unit.feature.Position;
import com.militarism2.militarism2.game.unit.feature.Stock;
import com.militarism2.militarism2.game.unit.type.ArmyType;
import com.militarism2.militarism2.game.unity.able.Flyable;
import com.militarism2.militarism2.game.unity.able.Supportable;
import com.militarism2.militarism2.game.unity.able.Warable;

import lombok.Data;

@Data
public class Support implements Supportable {

	private Formation formation;
	private ArmyData armyData;
	private Damage atack;
	private Position position;
	private Stock stock;
	private Random rand;
	private ArmyType armyType;

	public Support(Template t, Point startPoint) {
		this.formation = new Formation(t.getQuantityStuff(), t.getQuantityUnits(), t.getDefense(), t.getExpirience());
		this.armyData = new ArmyData(t.getName(), t.getCountry());
		this.atack = new Damage(t.getDamage(), t.getDamageRange(), t.getShotRange());
		this.position = new Position(startPoint, t.getSpeed(), t.getStealth(), t.getVisibility());
		this.stock = new Stock();
		armyType=ArmyType.SUPPORT;
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
	public Stock suppot() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean runway(Flyable flyable) {
		// TODO Auto-generated method stub
		return false;
	}

}
