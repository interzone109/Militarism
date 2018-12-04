package com.militarism2.militarism2.game.unit.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.militarism2.militarism2.game.unit.entity.ArmyEntity;

public interface PlayerArmyRepository extends JpaRepository<ArmyEntity, Long>{
	public Optional<ArmyEntity> findById(Long id);

}
