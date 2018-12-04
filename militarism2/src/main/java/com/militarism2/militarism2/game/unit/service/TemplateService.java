package com.militarism2.militarism2.game.unit.service;

import java.util.List;
import java.util.Optional;

import com.militarism2.militarism2.game.unit.army.template.TemplateBreak;


public interface TemplateService {
	public List<TemplateBreak> findAllByCountry(String country);
	 public Optional<TemplateBreak> findByName(String name);
}
