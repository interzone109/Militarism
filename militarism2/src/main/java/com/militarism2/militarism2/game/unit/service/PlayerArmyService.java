package com.militarism2.militarism2.game.unit.service;

import java.util.Optional;

import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unit.army.Infantry;
import com.militarism2.militarism2.game.unit.build.PlayerFactory;
import com.militarism2.militarism2.game.unit.entity.ArmyEntity;
import com.militarism2.militarism2.game.unit.feature.*;
import com.militarism2.militarism2.game.unit.type.ArmyType;

public interface PlayerArmyService {
	public Optional<ArmyEntity> findById(Long id);
}
