package com.militarism2.militarism2.game.unit.build;

import java.util.HashMap;
import java.util.Map;

import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unit.army.*;
import com.militarism2.militarism2.game.unit.army.template.*;
import com.militarism2.militarism2.game.unity.able.Warable;

public class Factory {
	private String country;
	private Point location;
	private Map<String, Template> productLine;

	public Factory(String country, Point location, Map<String, Template> productLine) {
		this.country = country;
		this.location = location;
		this.productLine = productLine;
/*		productLine.put("Squad", new InfantryTemplateSquad(country, location));
		productLine.put("T34", new TankTemplateT34(country, location));
		productLine.put("Panther", new TankTemplatePanther(country, location));
		productLine.put("Convoy", new SupportTemplateConvoy(country, location));
		productLine.put("Surcouf", new SubmarineTemplateSurcouf(country, location));
		productLine.put("Rodney", new ShipeTemplateRodney(country, location));
		productLine.put("Bofors", new ArtilleryTemplateBofors(country, location));
		productLine.put("Avro Lancaster", new AirplaneTemplateAvroLancaster(country, location));*/
	}

	public Infantry creatInfantry(String name) {
		return new Infantry(productLine.get(name));
	}

	public Tank creatTank(String name) {
		return new Tank(productLine.get(name));
	}

	public Artillery creatArtillery(String name) {
		return new Artillery(productLine.get(name));
	}

	public Airplane creatAirplane(String name) {
		return new Airplane(productLine.get(name));
	}

	public Shipe creatShipe(String name) {
		return new Shipe(productLine.get(name));
	}

	public Submarine creatSubmarine(String name) {
		return new Submarine(productLine.get(name));
	}

	public Support creatSupport(String name) {
		return new Support(productLine.get(name));
	}

}
