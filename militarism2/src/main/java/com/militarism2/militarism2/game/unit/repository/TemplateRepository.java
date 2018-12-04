package com.militarism2.militarism2.game.unit.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.militarism2.militarism2.game.unit.army.template.Template;
import com.militarism2.militarism2.game.unit.type.ArmyType;


public interface TemplateRepository extends JpaRepository<Template,Long> {
	 public List<Template> findAllByCountry(String country);
	 public Optional<Template> findByName(String name);
	 public List<Template> findByArmyType(ArmyType armyType);
	 
}
