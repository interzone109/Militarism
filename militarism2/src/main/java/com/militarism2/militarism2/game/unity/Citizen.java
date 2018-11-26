package com.militarism2.militarism2.game.unity;

/*
 * Реализация основной игровой единицы в виде граажданина страны
*/
public  class Citizen {
	private final int MAXHEALTH = 50;
	private int health;
	private String country;

	public Citizen(String country) {
		this.country = country;
		health = MAXHEALTH;
	}

	public void suffer(int health) {
		this.health -= health;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isAlive() {
		return health >= 0;
	}

	public int getHealth() {
		return health;
	}

}
