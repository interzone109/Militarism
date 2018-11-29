package com.militarism2.militarism2.game.army.template;

import com.militarism2.militarism2.game.feature.ArmyData;
import com.militarism2.militarism2.game.feature.Damage;
import com.militarism2.militarism2.game.feature.Formation;
import com.militarism2.militarism2.game.feature.Position;
import com.militarism2.militarism2.game.feature.Stock;
import com.militarism2.militarism2.game.map.Point;

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
