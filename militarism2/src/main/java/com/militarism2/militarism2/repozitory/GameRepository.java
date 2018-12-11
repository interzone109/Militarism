package com.militarism2.militarism2.repozitory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.militarism2.militarism2.model.GameModel;

/**
 * Репозиторий для взаимодействием с таблицей Games
 * 
 */
public interface GameRepository extends JpaRepository<GameModel, Long> {
	GameModel findOneByName(String name);
}
