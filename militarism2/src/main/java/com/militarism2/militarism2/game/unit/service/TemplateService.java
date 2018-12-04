package com.militarism2.militarism2.game.unit.service;

import java.util.List;
import java.util.Optional;

import com.militarism2.militarism2.game.unit.army.template.Template;
import com.militarism2.militarism2.game.unit.type.ArmyType;


public interface TemplateService {
	public List<Template> findAllByCountry(String country);
	 public Optional<Template> findByName(String name);
	 public List<Template> findByArmyType(ArmyType armyType);
}
