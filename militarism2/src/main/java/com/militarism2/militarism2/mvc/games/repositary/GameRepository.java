package com.militarism2.militarism2.mvc.games.repositary;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.militarism2.militarism2.mvc.games.entity.GameModel;
/*
 * FIXME: опиши тут методы для получения сущности Game
 * 
 * */
public interface GameRepository extends JpaRepository<GameModel, Long>{
	
	Optional<GameModel> findByName(String name);
}
