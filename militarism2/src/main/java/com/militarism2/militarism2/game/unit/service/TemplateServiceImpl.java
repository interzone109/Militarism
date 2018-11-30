package com.militarism2.militarism2.game.unit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.militarism2.militarism2.game.unit.army.template.Template;
import com.militarism2.militarism2.game.unit.repository.TemplateRepository;

@Service
public class TemplateServiceImpl implements TemplateService{

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


	@Override
	public Optional<Template> getUserById(long id) {
		return templateRepository.findById(id);
	}
}
