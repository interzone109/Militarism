package com.militarism2.militarism2.mvc.games.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.militarism2.militarism2.mvc.games.entity.CountryModel;
import com.militarism2.militarism2.mvc.games.repositary.CountryRepository;

@Service
public class CountrySeviceImp implements CountryService {

	private CountryRepository countryRepository;

	@Autowired
	public CountrySeviceImp(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}
	

	@Override
	public CountryModel findOneByName(String name) {
		return countryRepository.findOneByName(name);

	}

	public boolean addCountry(CountryModel name) {
		
		countryRepository.save(name);

		return true;
	}

	
}
