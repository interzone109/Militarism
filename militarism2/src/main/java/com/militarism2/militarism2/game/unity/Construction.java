package com.militarism2.militarism2.game.unity;

import java.util.List;

import com.militarism2.militarism2.game.map.Point;

/**
 * Родительский абстрактный клас для построек (farm, factory, mine...)
 * Содержит в себе два поля 
 * Point location- точка расположения на карте
 * List<Citizen> personal - лист работников
*/
public abstract class Construction {
	private Point location;
	private List<Citizen> personal;
	
	public Construction(Point location, List<Citizen> personal) {
		this.location = location;
		this.personal = personal;
	}

	public Point getLocation() {
		return location;
	}

	public List<Citizen> getPersonal() {
		return personal;
	}

	public void addPersonal(List<Citizen> personal) {
		this.personal.addAll(personal);
	}
	public void addPersonal(Citizen personal) {
		this.personal.add(personal);
	}
	public List<Citizen> getPersonal(int quantity) {
		if(quantity>= personal.size()) {
		return personal.subList(0, quantity);
		}
		return personal.subList(0, 0);
	}
}
