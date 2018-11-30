package com.militarism2.militarism2.game.unit.army.template;

import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unit.feature.ArmyData;
import com.militarism2.militarism2.game.unit.feature.Damage;
import com.militarism2.militarism2.game.unit.feature.Formation;
import com.militarism2.militarism2.game.unit.feature.Position;
import com.militarism2.militarism2.game.unit.feature.Stock;

public class TankTemplateT34 extends Template {
	private int price = 430;
	private int needUnit = 4;

	public TankTemplateT34(String country, Point location ) {
		super(new Formation(4,1, 800, 1), new ArmyData("T34", country), new Damage(200, 200, 8),
				new Position(location, 80, 100), new Stock());
	}

	public int getPrice() {
		return price;
	}

	public int getNeedUnit() {
		return needUnit;
	}

}
