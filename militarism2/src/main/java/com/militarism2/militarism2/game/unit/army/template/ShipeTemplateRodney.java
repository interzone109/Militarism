package com.militarism2.militarism2.game.unit.army.template;

import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unit.feature.ArmyData;
import com.militarism2.militarism2.game.unit.feature.Damage;
import com.militarism2.militarism2.game.unit.feature.Formation;
import com.militarism2.militarism2.game.unit.feature.Position;
import com.militarism2.militarism2.game.unit.feature.Stock;

public class ShipeTemplateRodney extends Template {
	private int price = 1000;
	private int needUnit = 60;

	public ShipeTemplateRodney(String country, Point location) {
		super(new Formation(60, 1100, 1), new ArmyData("Rodney", country), new Damage(800, 350, 12),
				new Position(location, 60, 80), new Stock());
	}

	public int getPrice() {
		return price;
	}

	public int getNeedUnit() {
		return needUnit;
	}

}
