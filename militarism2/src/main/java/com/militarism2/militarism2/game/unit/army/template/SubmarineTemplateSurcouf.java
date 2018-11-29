package com.militarism2.militarism2.game.unit.army.template;

import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unit.feature.ArmyData;
import com.militarism2.militarism2.game.unit.feature.Damage;
import com.militarism2.militarism2.game.unit.feature.Formation;
import com.militarism2.militarism2.game.unit.feature.Position;
import com.militarism2.militarism2.game.unit.feature.Stock;

public class SubmarineTemplateSurcouf extends Template {
	private int price = 3000;
	private int needUnit = 100;

	public SubmarineTemplateSurcouf(String country, Point location) {
		super(new Formation(100, 1500, 1), new ArmyData("Surcouf", country), new Damage(500, 500, 10),
				new Position(location, 50, 50), new Stock());
	}

	public int getPrice() {
		return price;
	}

	public int getNeedUnit() {
		return needUnit;
	}

}
