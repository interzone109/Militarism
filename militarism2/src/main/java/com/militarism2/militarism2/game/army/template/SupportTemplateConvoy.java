package com.militarism2.militarism2.game.army.template;

import com.militarism2.militarism2.game.feature.ArmyData;
import com.militarism2.militarism2.game.feature.Damage;
import com.militarism2.militarism2.game.feature.Formation;
import com.militarism2.militarism2.game.feature.Position;
import com.militarism2.militarism2.game.feature.Stock;
import com.militarism2.militarism2.game.map.Point;

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
