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
import com.militarism2.militarism2.game.unit.feature.ArmyData;
import com.militarism2.militarism2.game.unit.feature.Damage;
import com.militarism2.militarism2.game.unit.feature.Formation;
import com.militarism2.militarism2.game.unit.feature.Position;
import com.militarism2.militarism2.game.unit.feature.Stock;

import lombok.Data;

/**
 * @class Template класс используеться класс Factory для заполнения полей
 *        игровых обьектов
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

	@OneToOne(fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
	@JoinColumn(name = "formation_Id")
	private Formation formation;

	@OneToOne(fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
	@JoinColumn(name = "army_data_Id")
	private ArmyData armyData;

	@OneToOne(fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
	@JoinColumn(name = "damage_Id")
	private Damage damage;

	@OneToOne(fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
	@JoinColumn(name = "position_Id")
	private Position position;

	@OneToOne(fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
	@JoinColumn(name = "stock_Id")
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

	public String toString() {
		return formation.toString() +
		armyData.toString() +
		damage.toString() +
		position.toString() +
		stock.toString() ;
	}
}
