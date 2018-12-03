package com.militarism2.militarism2.game.unit.army.template;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unit.type.ArmyType;

import lombok.Data;

@Entity
@Table(name = "army_templates")
@Data
public class Templates {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "damage_Id", nullable = false, updatable = false, unique = true)
	private Long id;

	private String name;
	private int year;
	private String country;
	private int damage;
	@Column(name = "damage_range")
	private int damageRange;
	@Column(name = "shot_range")
	private int shotRange;

	@Column(name = "quantity_stuff")
	private int quantityStuff;

	@Column(name = "quantity_units")
	private int quantityUnits;

	private int defense;
	private int expirience;

	private int offsetX;

	private int offsetY;

	private int speed;
	private int visibility;

	private int gasoline;
	private int ammunition;
	private int food;
	private ArmyType armyType;

}
