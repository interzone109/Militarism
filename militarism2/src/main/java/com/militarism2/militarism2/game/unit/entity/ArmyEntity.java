package com.militarism2.militarism2.game.unit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unit.army.template.Template;

import lombok.Data;
/*@Entity
@Table(name = "army_entitys")*/
@Data
public class ArmyEntity {
/*	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "army_entity_id", nullable = false, updatable = true, unique=true)*/
	private long id;
	private int gameId;
	private Template template;
	private String name;
	private String country;
	private Point curentLocation;

	public ArmyEntity() {
	}
}
