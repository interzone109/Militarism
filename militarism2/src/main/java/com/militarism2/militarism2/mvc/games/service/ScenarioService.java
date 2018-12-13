package com.militarism2.militarism2.mvc.games.service;

import com.militarism2.militarism2.mvc.games.entity.ScenarioEntity;

/*
 * @author Dima
 * */

public interface ScenarioService {
	ScenarioEntity findOneByName(String name);
}
