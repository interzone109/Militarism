package com.militarism2.militarism2.game.unit.army.template;


import javax.persistence.Column;
import javax.persistence.Entity;
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
	@Column(name = "damage_Id", nullable = false, updatable = false, unique = true)
	private Long id;
	//for facroty
	@Column(name = "available_round")
	private int availableRound;
	private int cost ;
	private ArmyType armyType;
	// ArmyData
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

	

}
