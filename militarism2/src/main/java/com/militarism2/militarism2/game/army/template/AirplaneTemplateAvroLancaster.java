package com.militarism2.militarism2.game.army.template;

import com.militarism2.militarism2.game.feature.ArmyData;
import com.militarism2.militarism2.game.feature.Damage;
import com.militarism2.militarism2.game.feature.Formation;
import com.militarism2.militarism2.game.feature.Position;
import com.militarism2.militarism2.game.feature.Stock;
import com.militarism2.militarism2.game.map.Point;

public class AirplaneTemplateAvroLancaster extends Template {
	private int price = 870;
	private int needUnit = 2;

	public AirplaneTemplateAvroLancaster(String country, Point location) {
		super(new Formation(2, 320, 1), new ArmyData("Avro Lancaster", country), new Damage(900, 550, 2),
				new Position(location, 40, 60), new Stock());
	}

	public int getPrice() {
		return price;
	}

	public int getNeedUnit() {
		return needUnit;
	}

}