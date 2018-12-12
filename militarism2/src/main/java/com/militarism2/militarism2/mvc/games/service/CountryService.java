package com.militarism2.militarism2.mvc.games.service;

import com.militarism2.militarism2.mvc.games.entity.CountryModel;

public interface CountryService {
	CountryModel findByName(String name);

	boolean addCountry(CountryModel name);
	
}
