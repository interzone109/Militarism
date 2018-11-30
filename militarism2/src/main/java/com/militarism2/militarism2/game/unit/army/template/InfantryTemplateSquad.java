package com.militarism2.militarism2.game.unit.army.template;

import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unit.feature.ArmyData;
import com.militarism2.militarism2.game.unit.feature.Damage;
import com.militarism2.militarism2.game.unit.feature.Formation;
import com.militarism2.militarism2.game.unit.feature.Position;
import com.militarism2.militarism2.game.unit.feature.Stock;

/**
 * Шаблон для класа Infantry создающий отряд Squad
 */
public class InfantryTemplateSquad extends Template {
	private int price = 50;
	private int needUnit = 50;

	public InfantryTemplateSquad(String country, Point location) {
		super(new Formation(50,1, 30, 1), 
				new ArmyData("Squad", country),
				new Damage(20, 15,5),
				new Position(location, 30, 100),
				new Stock());
	}

	public int getPrice() {
		return price;
	}

	public int getNeedUnit() {
		return needUnit;
	}

}
