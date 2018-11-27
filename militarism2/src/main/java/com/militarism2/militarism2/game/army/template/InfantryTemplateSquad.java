package com.militarism2.militarism2.game.army.template;

import com.militarism2.militarism2.game.feature.Damage;
import com.militarism2.militarism2.game.feature.Position;
import com.militarism2.militarism2.game.feature.Stock;
import com.militarism2.militarism2.game.map.Point;
/**
 * Шаблон для класа Infantry создающий отряд Squad
 * */
public class InfantryTemplateSquad extends Template {

	public InfantryTemplateSquad(String country, Point location) {
		super(50, "Squad", country, 50, 30, new Damage(35, 25), 
				new Position(location, 30, 100, 5), new Stock());
	}

}
