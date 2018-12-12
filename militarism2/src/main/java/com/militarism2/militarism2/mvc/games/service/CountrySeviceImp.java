package com.militarism2.militarism2.mvc.games.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.militarism2.militarism2.mvc.games.entity.CountryModel;
import com.militarism2.militarism2.mvc.games.repositary.CountryRepository;

public class CountrySeviceImp implements CountryService {
	
	@Autowired()
	CountryRepository countryRepository;
	
	@Override
	public CountryModel findByName(String name) {
		return countryRepository.findByName(name).get();
	
	}

	@Override
	public boolean addCountry(CountryModel name) {
		
		countryRepository.save(name);
		
		return true;
	}

	

}
