package com.militarism2.militarism2.game.unit.build;

import java.util.Map;

import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unit.army.*;
import com.militarism2.militarism2.game.unit.army.template.*;

/**
 * 
 * Класс Factory используеться для создание различных типов юнитов
 * 
 * */
public class Factory {
	private String country;
	private Point location;
	private Map<String, Template> productLine;

	public Factory(String country, Point location, Map<String, Template> productLine) {
		this.country = country;
		this.location = location;
		this.productLine = productLine;
	}

	public Infantry creatInfantry(String name) throws ClassNotFoundException {
		if (productLine.containsKey(name)) {
		return new Infantry(productLine.get(name));
		}
		throw new ClassNotFoundException("Type :" + name + " not exist, check the spelling");
		}

	public Tank creatTank(String name) throws Exception {
		if (productLine.containsKey(name)) {
			return new Tank(productLine.get(name));
		}
		throw new ClassNotFoundException("Type :" + name + " not exist, check the spelling");
	}

	public Artillery creatArtillery(String name) throws ClassNotFoundException {
		if (productLine.containsKey(name)) {
			return new Artillery(productLine.get(name));
		}
		throw new ClassNotFoundException("Type :" + name + " not exist, check the spelling");
	}

	public Airplane creatAirplane(String name) throws ClassNotFoundException {
		if (productLine.containsKey(name)) {
			return new Airplane(productLine.get(name));
		}
		throw new ClassNotFoundException("Type :" + name + " not exist, check the spelling");
	}

	public Shipe creatShipe(String name) throws ClassNotFoundException {
		if (productLine.containsKey(name)) {
			return new Shipe(productLine.get(name));
		}
		throw new ClassNotFoundException("Type :" + name + " not exist, check the spelling");
	}

	public Submarine creatSubmarine(String name) throws ClassNotFoundException {
		if (productLine.containsKey(name)) {
			return new Submarine(productLine.get(name));
		}
		throw new ClassNotFoundException("Type :" + name + " not exist, check the spelling");
	}

	public Support creatSupport(String name) throws ClassNotFoundException {
		if (productLine.containsKey(name)) {
			return new Support(productLine.get(name));
		}
		throw new ClassNotFoundException("Type :" + name + " not exist, check the spelling");
	}

}
