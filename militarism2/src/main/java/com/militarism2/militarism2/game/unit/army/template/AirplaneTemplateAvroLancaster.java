package com.militarism2.militarism2.game.unit.army.template;

import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unit.feature.ArmyData;
import com.militarism2.militarism2.game.unit.feature.Damage;
import com.militarism2.militarism2.game.unit.feature.Formation;
import com.militarism2.militarism2.game.unit.feature.Position;
import com.militarism2.militarism2.game.unit.feature.Stock;

public class AirplaneTemplateAvroLancaster extends Template {
	private int price = 870;
	private int needUnit = 2;

	public AirplaneTemplateAvroLancaster(String country, Point location) {
		super(new Formation(2,1, 320, 1), new ArmyData("Avro Lancaster", country), new Damage(900, 550, 2),
				new Position(location, 40, 60), new Stock());
	}

	public int getPrice() {
		return price;
	}

	public int getNeedUnit() {
		return needUnit;
	}

}