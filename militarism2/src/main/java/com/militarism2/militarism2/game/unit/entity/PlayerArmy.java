package com.militarism2.militarism2.game.unit.entity;

import java.util.HashMap;
import java.util.Map;

import com.militarism2.militarism2.game.unit.army.Airplane;
import com.militarism2.militarism2.game.unit.army.Artillery;
import com.militarism2.militarism2.game.unit.army.Infantry;
import com.militarism2.militarism2.game.unit.army.Shipe;
import com.militarism2.militarism2.game.unit.army.Submarine;
import com.militarism2.militarism2.game.unit.army.Support;
import com.militarism2.militarism2.game.unit.army.Tank;

import lombok.Data;

public class PlayerArmy {
	private Map<Long, Infantry> infantry;
	private Map<Long, Airplane> airplane;
	private Map<Long, Artillery> artillery;
	private Map<Long, Shipe> shipe;
	private Map<Long, Submarine> submarine;
	private Map<Long, Support> support;
	private Map<Long, Tank> tank;
	

	public PlayerArmy() {
		this.infantry = new HashMap<>();
		this.airplane = new HashMap<>();
		this.artillery = new HashMap<>();
		this.shipe = new HashMap<>();
		this.submarine = new HashMap<>();
		this.support = new HashMap<>();
		this.tank = new HashMap<>();
	}

	public Infantry getInfantry(Long id) {
		return infantry.get(id);
	}

	public void setInfantry(Infantry infantry) {
		this.infantry.put(infantry.getId(), infantry);
	}

	/*
	 * public Airplane getAirplane(Long id) { return airplane.get(id); }
	 * 
	 * public void setAirplane(Airplane airplane) {
	 * this.airplane.put(airplane.getId(), airplane); } public Artillery
	 * getArtillery(Long id) { return artillery.get(id); } public void
	 * setArtillery(Artillery artillery) { this.artillery.put(artillery.getId(),
	 * artillery); } public Shipe getShipe(Long id) { return shipe.get(id); } public
	 * void setShipe(Shipe shipe) { this.shipe.put(shipe.getId(), shipe); } public
	 * Submarine getSubmarine(Long id) { return submarine.get(id); } public void
	 * setSubmarine(Submarine submarine) { this.submarine.put(submarine.getId(),
	 * submarine); } public Support getSupport(Long id) { return support.get(id); }
	 * public void setSupport(Support support) { this.support.put(support.getId(),
	 * support); } public Tank getTank(Long id) { return tank.get(id); } public void
	 * setTank(Tank tank) { this.tank.put(tank.getId(), tank); }
	 */

}
