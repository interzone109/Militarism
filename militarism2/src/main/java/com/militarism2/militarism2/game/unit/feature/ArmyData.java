package com.militarism2.militarism2.game.unit.feature;

import lombok.Data;

/**
 * Класс ArmyData содержит описывающую информацию об отряде а именно :
 *  название , страну.
 * 
 */
@Data
public class ArmyData {
	private String name;
	private String country;
	/**
	 * @param name - название отряда 
	 * @param country - название страны
	 * */
	public ArmyData(String name, String country) {
		this.name = name;
		this.country = country;
	}

	public ArmyData clone() {
		return new ArmyData(name, country);
	}

	@Override
	public String toString() {
		return "name:" + name + " country:" + country + "\n";
	}

}
