package com.militarism2.militarism2.game.unit.build;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.militarism2.militarism2.game.unit.army.template.Template;
import com.militarism2.militarism2.game.unit.entity.ArmyEntity;
import com.militarism2.militarism2.game.unit.service.PlayerArmyServiceImpl;
import com.militarism2.militarism2.game.unit.service.TemplateServiceImpl;

@Component
public class GameFactory {
	@Autowired
	private TemplateServiceImpl templateServiceImpl;
	@Autowired
	private PlayerArmyServiceImpl armyEntityServiceImpl;
	

	
	public void createArmy(String name, int quantity) {
			
		
		Template t = templateServiceImpl.findByName(name).get();
		ArmyEntity armyEntity = new ArmyEntity(t);
		armyEntity.getFormation().setQuantityStuff(quantity);
		armyEntityServiceImpl.save(armyEntity);
		
		
	}
	
	
	
}
