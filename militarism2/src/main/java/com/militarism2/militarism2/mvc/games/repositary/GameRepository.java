package com.militarism2.militarism2.mvc.games.repositary;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.militarism2.militarism2.mvc.games.entity.GameEntity;

/*
 * @author Dima
 * */

public interface GameRepository extends JpaRepository<GameEntity, Long>{
	
	GameEntity findByName(String name);
}
