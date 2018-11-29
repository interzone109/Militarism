package com.militarism2.militarism2.game.army.template;

import com.militarism2.militarism2.game.feature.ArmyData;
import com.militarism2.militarism2.game.feature.Damage;
import com.militarism2.militarism2.game.feature.Formation;
import com.militarism2.militarism2.game.feature.Position;
import com.militarism2.militarism2.game.feature.Stock;
import com.militarism2.militarism2.game.map.Point;

public class TankTemplatePanther extends Template {
	private int price = 500;
	private int needUnit = 5;

	public TankTemplatePanther(String country, Point location) {
		super(new Formation(5, 1100, 1), new ArmyData("Panther", country), new Damage(400, 150, 10),
				new Position(location, 60, 100), new Stock());
	}

	public int getPrice() {
		return price;
	}

	public int getNeedUnit() {
		return needUnit;
	}

}
