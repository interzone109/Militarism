package com.militarism2.militarism2.game.army.template;

import com.militarism2.militarism2.game.feature.ArmyData;
import com.militarism2.militarism2.game.feature.Damage;
import com.militarism2.militarism2.game.feature.Position;
import com.militarism2.militarism2.game.feature.Stock;
import com.militarism2.militarism2.game.map.Point;

/**
 * Шаблон для класа Infantry создающий отряд Squad
 */
public class InfantryTemplateSquad extends Template {
	private int price = 50;
	private int needUnit = 50;

	public InfantryTemplateSquad(String country, Point location) {
		super(30, new ArmyData("Squad", country, 50),  new Damage(35, 25), new Position(location, 30, 100, 5),
				new Stock());
	}

	public int getPrice() {
		return price;
	}

	public int getNeedUnit() {
		return needUnit;
	}

}
