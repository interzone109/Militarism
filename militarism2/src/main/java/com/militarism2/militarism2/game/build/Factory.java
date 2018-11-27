package com.militarism2.militarism2.game.build;

import com.militarism2.militarism2.game.army.Infantry;
import com.militarism2.militarism2.game.army.template.InfantryTemplateSquad;
import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unity.able.Warable;

public class Factory {
	private String country;
	private Point location;
	private InfantryTemplateSquad infantryTemplateSquad;



	public Factory() {
	}

	public Warable creat(String name) {
		return new Infantry( new InfantryTemplateSquad(country, location));
	}
}
