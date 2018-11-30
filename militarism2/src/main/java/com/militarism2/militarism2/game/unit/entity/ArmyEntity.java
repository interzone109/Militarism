package com.militarism2.militarism2.game.unit.entity;

import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unit.army.template.Template;

import lombok.Data;

@Data
public class ArmyEntity {
	private long id;
	private int gameId;
	private Template template;
	private String name;
	private String country;
	private Point curentLocation;

	public ArmyEntity() {
	}
}
