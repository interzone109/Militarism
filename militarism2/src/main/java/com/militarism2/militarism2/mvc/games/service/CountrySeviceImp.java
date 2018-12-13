package com.militarism2.militarism2.mvc.games.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.militarism2.militarism2.mvc.games.entity.CountryEntity;
import com.militarism2.militarism2.mvc.games.repositary.CountryRepository;

/*
 * @author Dima
 * */

@Service
public class CountrySeviceImp implements CountryService {

	private CountryRepository countryRepository;

	@Autowired
	public CountrySeviceImp(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}
	

	@Override
	public CountryEntity findOneByName(String name) {
		return countryRepository.findOneByName(name);

	}

	public List<CountryEntity> getAllCountries()
	{
		return countryRepository.findAll();
	}
	
	public boolean addCountry(CountryEntity name) {
		
		countryRepository.save(name);
		return true;
	}

	
}
