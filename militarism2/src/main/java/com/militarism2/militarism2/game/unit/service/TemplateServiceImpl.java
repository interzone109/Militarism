package com.militarism2.militarism2.game.unit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.militarism2.militarism2.game.unit.army.template.Template;
import com.militarism2.militarism2.game.unit.repository.TemplateRepository;

public class TemplateServiceImpl {

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
}
