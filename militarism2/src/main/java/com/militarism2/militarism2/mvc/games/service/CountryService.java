package com.militarism2.militarism2.mvc.games.service;

import com.militarism2.militarism2.mvc.games.entity.CountryModel;

public interface CountryService {
	CountryModel findOneByName(String name);
	boolean addCountry(String name);
}
