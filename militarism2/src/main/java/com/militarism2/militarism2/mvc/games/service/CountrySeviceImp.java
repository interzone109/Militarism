package com.militarism2.militarism2.mvc.games.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.militarism2.militarism2.mvc.games.entity.CountryModel;
import com.militarism2.militarism2.mvc.games.repositary.CountryRepository;

public class CountrySeviceImp implements CountryService {
	
	@Autowired(required=true)
	CountryRepository repo;
	
	@Override
	public CountryModel findOneByName(String name) {
		return repo.findOneByName(name);
	
	}

	@Override
	public boolean addCountry(String name) {
		CountryModel country=new CountryModel();
		country.setName(name);
		repo.save(country);
		// TODO Auto-generated method stub
		return true;
	}

	

}
