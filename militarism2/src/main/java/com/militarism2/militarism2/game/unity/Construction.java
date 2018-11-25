package com.militarism2.militarism2.game.unity;

import java.util.List;

import com.militarism2.militarism2.game.map.Point;

/*
 * Parent class of all buildings (farm, factory, mine...)
*/
public abstract class Construction {
	private Point location;
	private List<Citizen> personal;
	
	public Construction(Point location, List<Citizen> personal) {
		super();
		this.location = location;
		this.personal = personal;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
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
}
