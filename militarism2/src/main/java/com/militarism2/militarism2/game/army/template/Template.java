package com.militarism2.militarism2.game.army.template;

import com.militarism2.militarism2.game.feature.Damage;
import com.militarism2.militarism2.game.feature.Position;
import com.militarism2.militarism2.game.feature.Stock;

public abstract class Template {
	private int cost;
	private String name;
	private String country;
	private int quantityUnits;
	private int defense;
	private Damage damage;
	private Position position;
	private Stock stock;

	public Template(int cost, String name, String country, int quantityUnits, int defense, Damage damage,
			Position position, Stock stock) {
		super();
		this.cost = cost;
		this.name = name;
		this.country = country;
		this.quantityUnits = quantityUnits;
		this.defense = defense;
		this.damage = damage;
		this.position = position;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public int getQuantityUnits() {
		return quantityUnits;
	}

	public int getDefense() {
		return defense;
	}

	public Damage getDamage() {
		return damage;
	}

	public Position getPosition() {
		return position;
	}

	public Stock getStock() {
		return stock;
	}
}
