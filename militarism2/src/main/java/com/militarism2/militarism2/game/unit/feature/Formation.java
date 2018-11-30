package com.militarism2.militarism2.game.unit.feature;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Класс Formation описывает такие данные как
 * количество юнитов в отряде, их защина и опыт
 * */
@Entity
@Table(name = "formations")
@Data
public class Formation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "formation_Id", nullable = false, updatable = false, unique = true)
	private Long id;
	
	@Column(name = "quantity_stuff")
	private int quantityStuff;
	
	@Column(name = "quantity_units")
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
