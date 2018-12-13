package com.militarism2.militarism2.mvc.games.repositary;

import org.springframework.data.jpa.repository.JpaRepository;


import com.militarism2.militarism2.mvc.games.entity.PlayerEntity;

/*
 * @author Dima
 * */

public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {
	
	PlayerEntity findOneByName(String name);
}
