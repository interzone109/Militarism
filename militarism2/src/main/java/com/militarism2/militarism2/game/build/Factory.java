package com.militarism2.militarism2.game.build;

import java.util.HashMap;
import java.util.Map;

import com.militarism2.militarism2.game.army.Infantry;
import com.militarism2.militarism2.game.army.template.InfantryTemplateSquad;
import com.militarism2.militarism2.game.army.template.Template;
import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unity.able.Warable;

public class Factory {
	private String country;
	private Point location;
	private InfantryTemplateSquad infantryTemplateSquad;
	private Map<String, Template> productLine;

	public Factory(String country, Point location) {
		this.country = country;
		this.location = location;
		productLine = new HashMap<>();
		productLine.put("Squad", new InfantryTemplateSquad(country, location));

	}

	public Warable creat(String name) {
		return new Infantry(productLine.get(name));
	}
}
