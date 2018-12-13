package com.militarism2.militarism2.mvc.games.entity;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

/*
 * @author Dima
 * */

@Entity
@Table(name = "Scenarios")
@Data
public class ScenarioEntity {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Scenario_Id", nullable = false, updatable = false)
	long id;
	
	@Column(name = "Name", nullable = false, unique = false)
	String name;
	
	@Column(name = "Color", nullable = false, unique = false)
	String color;
	
	@OneToMany(mappedBy = "scenario")
	  private List<GameEntity> games;
	
	public ScenarioEntity() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public List<GameEntity> getGames() {
		return games;
	}

	public void setGames(List<GameEntity> games) {
		this.games = games;
	}

	public List<CountryEntity> getCountries() {
		return countries;
	}

	public void setCountry(CountryEntity countries) {
		this.countries.add(countries);
	}

	public long getId() {
		return id;
	}

	@OneToMany
	@JoinColumn(name = "Country_Id")
    private List<CountryEntity> countries;
	
}