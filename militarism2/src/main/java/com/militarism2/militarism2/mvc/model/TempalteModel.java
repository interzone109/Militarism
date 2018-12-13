package com.militarism2.militarism2.mvc.model;

import com.militarism2.militarism2.game.unit.type.ArmyType;

import lombok.Data;

/**
 * @author Максим
 * модель для класса Template
 * */
@Data
public class TempalteModel {
	private int availableRound;//
	private int cost ;//
	private ArmyType armyType;//
	// ArmyData
	private String name;//
	private String country;//
	//Damage
	private int damage;//
	private int damageRange;//
	private int shotRange;//
	//Formation
	private int quantityStuff;//
	private int quantityUnits;//
	private int defense;//
	private int expirience;//--
	//Position
	private int speed;
	private int stealth;
	private int visibility;
	
}
