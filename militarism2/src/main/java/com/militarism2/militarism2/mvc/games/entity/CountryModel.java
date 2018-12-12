package com.militarism2.militarism2.mvc.games.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
/**
 * FIXME: переименуй этот класс в CountryEntity
 * Имя класса CountryModel тут не подходит оконтчание модель относить к MVC 
 * в твоем случает ето энтити и класс должен называться CountryEntity
 * */

@Entity
@Table(name = "Countries")
@Data // эта анотация заменила все твои гетеры и сетеры
public class CountryModel {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Country_Id", nullable = false, updatable = false, unique = true)
	long id;
	// FIXME: unique = false - у нас что в таблице будут храниться страны с одинаковым названием ? зачем ? 
	@Column(name = "Name", nullable = false, unique = false)
	String name;
	
	
	public CountryModel(String name){
		this.name=name ;
	}
}