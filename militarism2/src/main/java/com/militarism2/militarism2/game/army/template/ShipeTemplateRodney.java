package com.militarism2.militarism2.game.army.template;

import com.militarism2.militarism2.game.feature.ArmyData;
import com.militarism2.militarism2.game.feature.Damage;
import com.militarism2.militarism2.game.feature.Formation;
import com.militarism2.militarism2.game.feature.Position;
import com.militarism2.militarism2.game.feature.Stock;
import com.militarism2.militarism2.game.map.Point;

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
