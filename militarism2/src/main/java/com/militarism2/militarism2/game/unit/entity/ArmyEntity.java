package com.militarism2.militarism2.game.unit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unit.army.template.Template;
import com.militarism2.militarism2.game.unit.feature.Stock;

import ch.qos.logback.core.status.Status;
import lombok.Data;
/*@Entity
@Table(name = "army_entitys")*/
@Data
public class ArmyEntity {
/*	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "army_entity_id", nullable = false, updatable = true, unique=true)*/
	private long id;
	private int gameId ;
	private String templateName;
	private String countryPlayer;
	private Point finalLocation;
	private Point currentLocation;
	private Stock stock;
	private Status status;

	public ArmyEntity() {
	}
}
