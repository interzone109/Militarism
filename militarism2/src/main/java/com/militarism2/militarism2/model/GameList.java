package com.militarism2.militarism2.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Service;

@Service
public class GameList {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
