package com.militarism2.militarism2.game.unit.army.template;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.militarism2.militarism2.game.unit.type.ArmyType;

import lombok.Data;

@Entity
@Table(name = "army_templates")
@Data
public class Template {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "army_template_id", nullable = false, updatable = false, unique = true)
	private Long id;
	//for facroty
	@Column(name = "available_round")
	private int availableRound;
	private int cost ;
	@Enumerated(EnumType.ORDINAL) 
	private ArmyType armyType;
	// ArmyData
	@Column(name = "name", nullable = false, updatable = false, unique = true)
	private String name;
	private String country;
	//Damage
	private int damage;
	@Column(name = "damage_range")
	private int damageRange;
	@Column(name = "shot_range")
	private int shotRange;
	//Formation
	@Column(name = "quantity_stuff")
	private int quantityStuff;
	@Column(name = "quantity_units")
	private int quantityUnits;
	private int defense;
	private int expirience;
	//Position
	private int speed;
	private int stealth;
	private int visibility;
	/**
	 * @param
	 * @param
	 * @param
	 * @param
	 * @param
	 * @param
	 * @param
	 * @param
	 * @param
	 * @param
	 * @param
	 * @param
	 * @param
	 * @param
	 * @param
	 * 
	 * */
	public Template(int availableRound, int cost, ArmyType armyType, String name, String country, int damage,
			int damageRange, int shotRange, int quantityStuff, int quantityUnits, int defense, int expirience,
			int speed, int stealth, int visibility) {
		super();
		this.availableRound = availableRound;
		this.cost = cost;
		this.armyType = armyType;
		this.name = name;
		this.country = country;
		this.damage = damage;
		this.damageRange = damageRange;
		this.shotRange = shotRange;
		this.quantityStuff = quantityStuff;
		this.quantityUnits = quantityUnits;
		this.defense = defense;
		this.expirience = expirience;
		this.speed = speed;
		this.stealth = stealth;
		this.visibility = visibility;
	}
	public Template() {
		
	}

	

}
