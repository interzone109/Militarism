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
import com.militarism2.militarism2.game.unit.type.ArmyType;

/**
 * @class Template класс используеться класс Factory для заполнения полей
 *        игровых обьектов
 * 
 */
/*@Entity
@Table(name = "templates")*/
public class TemplateBreak {
	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "template_Id", nullable = false, updatable = false, unique = true)*/
	private Long id;

	/*@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "formation_Id")*/
	private Formation formation;

/*	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "army_data_Id")*/
	private ArmyData armyData;

	/*@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "damage_Id")*/
	private Damage damage;

	/*@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "position_Id")*/
	private Position position;

	/*@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "stock_Id")*/
	private Stock stock;

	private String country;

	private String name;

	private int cost;

	private ArmyType armyType;

	
	

}
