package com.militarism2.militarism2.game.unit.build;

import org.springframework.beans.factory.annotation.Autowired;

import com.militarism2.militarism2.game.unit.army.template.Template;
import com.militarism2.militarism2.game.unit.entity.ArmyEntity;
import com.militarism2.militarism2.game.unit.service.ArmyEntityServiceImpl;
import com.militarism2.militarism2.game.unit.service.TemplateServiceImpl;
import com.militarism2.militarism2.game.unit.type.ArmyType;

public class GameFactory {
	@Autowired
	private TemplateServiceImpl templateServiceImpl;
	@Autowired
	private ArmyEntityServiceImpl armyEntityServiceImpl;
	
	
	public GameFactory() {
		Template sqad = new Template(0, 5, ArmyType.INFANTRY, "infantry_test1",
				"USSR", 30, 15, 2, 1, 1, 30, 1, 30, 0, 10);

		templateServiceImpl.save(sqad);
		
		Template sqad1 = new Template(0, 5, ArmyType.INFANTRY, "infantry_test2",
				"USSR", 30, 15, 2, 1, 1, 30, 1, 30, 0, 10);

		templateServiceImpl.save(sqad1);
	}


	public void create(String name) {
		Template t = templateServiceImpl.findByName(name).get();
		ArmyEntity armyEntity = new ArmyEntity(t);
		
		armyEntityServiceImpl.save(armyEntity);
		
		
	}
	
}
