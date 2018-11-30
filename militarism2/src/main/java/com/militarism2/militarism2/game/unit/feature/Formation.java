package com.militarism2.militarism2.game.unit.feature;

import lombok.Data;

/**
 * Класс Formation описывает такие данные как
 * количество юнитов в отряде, их защина и опыт
 * */
@Data
public class Formation {
	private int quantityStuff;
	private int quantityUnits;
	private int defense;
	private int expirience;
	
	/***?
	 * 
	 * @param quantityStuff -количество унитов на одну единицу техники
	 * @param quantityUnits-количество техники 
	 * @param defense -защита
	 * @param expirience- опыт
	 */
	public Formation(int quantityStuff, int quantityUnits, int defense, int expirience) {
		super();
		this.quantityUnits = quantityUnits;
		this.defense = defense;
		this.expirience = expirience;
	}

	

	public Formation clone() {
		return new Formation(quantityStuff ,quantityUnits, defense, expirience) ;
	}
	
	@Override
	public String toString() {
		return "quantity units:"+quantityUnits
				   +" defense:"+defense
				   +" expirience:"+ expirience+"\n";
	}

}
