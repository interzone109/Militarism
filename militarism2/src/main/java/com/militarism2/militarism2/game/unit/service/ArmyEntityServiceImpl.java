package com.militarism2.militarism2.game.unit.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.militarism2.militarism2.game.unit.entity.ArmyEntity;
import com.militarism2.militarism2.game.unit.repository.PlayerArmyRepository;
@Service
public class ArmyEntityServiceImpl implements PlayerArmyService{
	
	private PlayerArmyRepository playerArmyRepository; 
	
	@Autowired
	public ArmyEntityServiceImpl(PlayerArmyRepository playerArmyRepository) {
		this.playerArmyRepository = playerArmyRepository;
	}
	
	public Optional<ArmyEntity> findById(Long id) {
		return playerArmyRepository.findById(id);
	}

	public void save(ArmyEntity armyEntity) {
		long id = playerArmyRepository.save(armyEntity).getId();
		System.out.println("RETURN save entity id "+id);
	}

}
