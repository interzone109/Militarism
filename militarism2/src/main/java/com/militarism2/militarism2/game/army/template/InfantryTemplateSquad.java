package com.militarism2.militarism2.game.army.template;

import com.militarism2.militarism2.game.feature.ArmyData;
import com.militarism2.militarism2.game.feature.Damage;
import com.militarism2.militarism2.game.feature.Formation;
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
		super(new Formation(50, 30, 1), 
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
