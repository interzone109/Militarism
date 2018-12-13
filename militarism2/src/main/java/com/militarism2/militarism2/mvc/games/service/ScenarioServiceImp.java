package com.militarism2.militarism2.mvc.games.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.militarism2.militarism2.mvc.games.entity.ScenarioEntity;
import com.militarism2.militarism2.mvc.games.repositary.ScenarioRepository;

/*
 * @author Dima
 * */

@Service
public class ScenarioServiceImp implements ScenarioService {

	private ScenarioRepository repo;
	
	@Autowired
	public ScenarioServiceImp(ScenarioRepository repo) {
		this.repo = repo;
	}
	
	@Override
	public ScenarioEntity findOneByName(String name) {
		return repo.findOneByName(name);
	}
	
	public boolean addScenario(ScenarioEntity scenario)
	{
		scenario.setColor("Red");
		//scenario.setName("lol");
		
		repo.save(scenario);
		return true;
	}
	

}
