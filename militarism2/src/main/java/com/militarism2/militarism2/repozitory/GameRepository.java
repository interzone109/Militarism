package com.militarism2.militarism2.repozitory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.militarism2.militarism2.model.GameModel;


public interface GameRepository extends JpaRepository<GameModel, Long> {

	
	Optional<GameModel> findOneByName(String name);


}
