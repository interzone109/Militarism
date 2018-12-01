package com.militarism2.militarism2.game.unit.army.template;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.militarism2.militarism2.game.unit.feature.*;

/**
 * @class Template класс используеться класс Factory для заполнения полей
 *        игровых обьектов
 * 
 */
@Entity
@Table(name = "templates")
public class Template {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "template_Id", nullable = false, updatable = false, unique = true)
	private Long id;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "formation_Id")
	private Formation formation;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "army_data_Id")
	private ArmyData armyData;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "damage_Id")
	private Damage damage;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "position_Id")
	private Position position;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "stock_Id")
	private Stock stock;

	private String country;

	private String name;

	private int cost;


	public Template(Formation formation, ArmyData armyData, Damage damage, Position position, Stock stock, int cost) {
		this.formation = formation;
		this.armyData = armyData;
		this.damage = damage;
		this.position = position;
		this.stock = stock;
		this.country = armyData.getCountry();
		this.cost = cost;
		this.name = armyData.getName();
	}

	public ArmyData getArmyData() {
		return armyData.clone();
	}

	public Damage getDamage() {
		return damage.clone();
	}

	public Position getPosition() {
		return position.clone();
	}

	public Stock getStock() {
		return stock.clone();
	}

	public Formation getFormation() {
		return formation.clone();
	}

	public String toString() {
		return formation.toString() + armyData.toString() + damage.toString() + position.toString() + stock.toString();
	}

	public String getCountry() {
		return country;
	}

	public String getName() {
		return name;
	}

	public int getCost() {
		return cost;
	}

}
