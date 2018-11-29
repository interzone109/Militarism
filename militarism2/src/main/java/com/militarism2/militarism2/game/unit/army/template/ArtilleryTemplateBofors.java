package com.militarism2.militarism2.game.unit.army.template;

import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unit.feature.ArmyData;
import com.militarism2.militarism2.game.unit.feature.Damage;
import com.militarism2.militarism2.game.unit.feature.Formation;
import com.militarism2.militarism2.game.unit.feature.Position;
import com.militarism2.militarism2.game.unit.feature.Stock;

public class ArtilleryTemplateBofors extends Template {
	private int price = 800;
	private int needUnit = 6;

	public ArtilleryTemplateBofors(String country, Point location) {
		super(new Formation(6, 150, 1), new ArmyData("Bofors", country), new Damage(700, 550, 12),
				new Position(location, 40, 80), new Stock());
	}

	public int getPrice() {
		return price;
	}

	public int getNeedUnit() {
		return needUnit;
	}

}
