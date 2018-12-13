package com.militarism2.militarism2.mvc.games.repositary;

import org.springframework.data.jpa.repository.JpaRepository;


import com.militarism2.militarism2.mvc.games.entity.ScenarioEntity;

/*
 * @author Dima
 * */

public interface ScenarioRepository extends JpaRepository<ScenarioEntity, Long> {
	
	ScenarioEntity findOneByName(String name);
	
}
