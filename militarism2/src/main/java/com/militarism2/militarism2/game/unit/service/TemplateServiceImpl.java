package com.militarism2.militarism2.game.unit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.militarism2.militarism2.game.unit.army.template.Template;
import com.militarism2.militarism2.game.unit.repository.TemplateRepository;
import com.militarism2.militarism2.game.unit.type.ArmyType;
import com.militarism2.militarism2.mvc.model.TemplateModel;

@Service
public class TemplateServiceImpl implements TemplateService {

	private final TemplateRepository templateRepository;

	@Autowired
	public TemplateServiceImpl(TemplateRepository templateRepository) {
		this.templateRepository = templateRepository;
	}

	public void save(Template template) {
		templateRepository.save(template);

	}

	public List<Template> getAll() {
		return templateRepository.findAll();
	}

	public List<Template> findAllByCountry(String country) {
		return templateRepository.findAllByCountry(country);
	}

	public Optional<Template> findByName(String name) {
		return templateRepository.findByName(name);
	}

	@Override
	public List<Template> findByArmyType(ArmyType armyType) {
		return templateRepository.findByArmyType(armyType);
	}

	public List<Template> findAll() {
		return templateRepository.findAll();
	}
	
	@SuppressWarnings("static-access")
	public Optional<Template> createNewTempalte(TemplateModel t) {
		Optional<Template> optional =findByName(t.getName());
		if(optional.isPresent()){
			return optional.of(new Template()) ;
		}
		else { 
			Template template = new Template(t.getAvailableRound(), t.getCost(), t.getArmyType(),
					t.getName(), t.getCountry(), t.getDamage(),
					t.getDamageRange(), t.getShotRange(), 
					t.getQuantityStuff(), t.getQuantityUnits(), t.getDefense(),
					1, t.getSpeed(), t.getStealth(), t.getVisibility());
			
			templateRepository.save(template);
			return optional.of(template) ;
		}
		
	}
	

	public Template findById(Long id) {
		return templateRepository.findById(id).get();
	}
	
	public void update(Template template) {
		templateRepository.save(template);
	}
	
}
