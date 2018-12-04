package com.militarism2.militarism2.game.unit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.militarism2.militarism2.game.unit.entity.ArmyEntity;

@Repository
public interface PlayerArmyRepositoty extends JpaRepository<ArmyEntity,Long>{
	public Optional<ArmyEntity> findById(Long id);
}
