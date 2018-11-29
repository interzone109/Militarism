package com.militarism2.militarism2.game.unit.army.template;

import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unit.feature.ArmyData;
import com.militarism2.militarism2.game.unit.feature.Damage;
import com.militarism2.militarism2.game.unit.feature.Formation;
import com.militarism2.militarism2.game.unit.feature.Position;
import com.militarism2.militarism2.game.unit.feature.Stock;

public class SupportTemplateConvoy extends Template {
	private int price = 300;
	private int needUnit = 10;

	public SupportTemplateConvoy(String country, Point location) {
		super(new Formation(10, 300, 1), new ArmyData("Convoy", country), new Damage(20, 15, 5),
				new Position(location, 120, 100), new Stock());
	}

	public int getPrice() {
		return price;
	}

	public int getNeedUnit() {
		return needUnit;
	}

}
