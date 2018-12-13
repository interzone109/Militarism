package com.militarism2.militarism2.mvc.games.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/*
 * @author Dima
 * */
@Entity
@Table(name = "Countries")
@Data // эта анотация заменила все твои гетеры и сетеры
public class CountryEntity {
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}	


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Country_Id", nullable = false, updatable = false, unique = true)
	long id;

	@Column(name = "Name", nullable = false, unique = true)
	String name;
	
	
	public CountryEntity(String name){
		this.name=name ;
	}
	public CountryEntity(){
		
	}
}