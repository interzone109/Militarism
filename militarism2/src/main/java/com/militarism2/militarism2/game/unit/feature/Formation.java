package com.militarism2.militarism2.game.unit.feature;

import lombok.Data;

/**
 * Класс Formation описывает такие данные как
 * количество юнитов в отряде, их защина и опыт
 * */
@Data
public class Formation {
	private int quantityUnits;
	private int defense;
	private int expirience;
	
	
	public Formation(int quantityUnits, int defense, int expirience) {
		super();
		this.quantityUnits = quantityUnits;
		this.defense = defense;
		this.expirience = expirience;
	}

	

	public Formation clone() {
		return new Formation(quantityUnits, defense, expirience) ;
	}
	
	@Override
	public String toString() {
		return "quantity units:"+quantityUnits
				   +" defense:"+defense
				   +" expirience:"+ expirience+"\n";
	}

}
