package com.militarism2.militarism2.game.unit.feature;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Класс ArmyData содержит описывающую информацию об отряде а именно : название
 * , страну.
 * 
 */
@Entity
@Table(name = "army_datas")
@Data
public class ArmyData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "army_data_Id", nullable = false, updatable = false, unique = true)
	private Long id;
	private String name;
	private int year;
	private String country;

	/**
	 * @param name    - название отряда
	 * @param country - название страны
	 */
	public ArmyData(String name, String country, int year) {
		this.name = name;
		this.country = country;
		this.year = year;
	}

	public ArmyData clone() {
		return new ArmyData(name, country, year);
	}

	@Override
	public String toString() {
		return "name:" + name + " country:" + country + "\n";
	}

}
