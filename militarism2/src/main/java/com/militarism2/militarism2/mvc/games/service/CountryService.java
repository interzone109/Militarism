package com.militarism2.militarism2.mvc.games.service;



import com.militarism2.militarism2.mvc.games.entity.CountryEntity;

/*
 * @author Dima
 * */

public interface CountryService {
	
	CountryEntity findOneByName(String name);
	
}
