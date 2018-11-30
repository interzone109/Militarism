package com.militarism2.militarism2.game.unit.army.template;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.militarism2.militarism2.game.unit.feature.ArmyData;
import com.militarism2.militarism2.game.unit.feature.Damage;
import com.militarism2.militarism2.game.unit.feature.Formation;
import com.militarism2.militarism2.game.unit.feature.Position;
import com.militarism2.militarism2.game.unit.feature.Stock;

import lombok.Data;

/**
 * @class Template  класс используеться класс Factory для заполнения
 *        полей игровых обьектов
 * 
 */
@Entity
@Table(name = "templates")
@Data
public class Template {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "template_Id", nullable = false, updatable = false, unique = true)
	private Long id;

	@OneToOne
	@JoinColumn(name = "formation_Id")
	@Column(name = "formation")
	private Formation formation;

	@OneToOne
	@JoinColumn(name = "army_data_Id")
	@Column(name = "army_data")
	private ArmyData armyData;

	@OneToOne
	@JoinColumn(name = "damage_Id")
	@Column(name = "damage")
	private Damage damage;

	@OneToOne
	@JoinColumn(name = "position_Id")
	@Column(name = "position")
	private Position position;

	@OneToOne
	@JoinColumn(name = "stock_Id")
	@Column(name = "stock")
	private Stock stock;

	public Template(Formation formation, ArmyData armyData, Damage damage, Position position, Stock stock) {
		this.formation = formation;
		this.armyData = armyData;
		this.damage = damage;
		this.position = position;
		this.stock = stock;
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

}
