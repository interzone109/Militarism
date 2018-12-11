package com.militarism2.militarism2.mvc.games.repositary;

import org.springframework.data.jpa.repository.JpaRepository;


import com.militarism2.militarism2.mvc.games.entity.GameModel;
/*
 * FIXME: опиши тут методы для получения сущности Game
 * 
 * */
public interface GameRepository extends JpaRepository<GameModel, Long>{
	
	GameModel findOneByName(String name);
}
