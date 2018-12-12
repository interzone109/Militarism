package com.militarism2.militarism2.mvc.games.entity;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * FIXME: переименуй этот класс в ScenariEntity
 * Имя класса CountryModel тут не подходит оконтчание модель относить к MVC 
 * в твоем случает ето энтити и класс должен называться ScenariEntity
 * */

@Entity
@Table(name = "Scenarios")
public class ScenarioModel {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Scenario_Id", nullable = false, updatable = false)
	long id;
	
	@Column(name = "Name", nullable = false, unique = false)
	String name;
	
	@Column(name = "Color", nullable = false, unique = false)
	String color;
	
	@OneToMany(mappedBy = "scenario")
	  private List<GameModel> games;
	
	//@OneToMany(mappedBy = "countries")
	//@JoinColumn(name = "Country_Id")
	@OneToMany
    private List<CountryModel> countries;
	
}