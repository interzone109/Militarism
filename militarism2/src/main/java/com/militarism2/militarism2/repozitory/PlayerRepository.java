package com.militarism2.militarism2.repozitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.militarism2.militarism2.model.GameModel;
import com.militarism2.militarism2.model.PlayerModel;

public interface PlayerRepository extends JpaRepository<PlayerModel, Long> {
	
	GameModel findOneByName(String name);
}
