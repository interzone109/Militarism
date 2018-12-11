package com.militarism2.militarism2.mvc.games.repositary;

import org.springframework.data.jpa.repository.JpaRepository;


import com.militarism2.militarism2.mvc.games.entity.PlayerModel;

/*
 * @author Dima
 * */

public interface PlayerRepository extends JpaRepository<PlayerModel, Long> {
	
	PlayerModel findOneByName(String name);
}
