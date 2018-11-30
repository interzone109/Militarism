package com.militarism2.militarism2.game.unit.service;

import java.util.Optional;

import com.militarism2.militarism2.game.unit.army.template.Template;


public interface TemplateService {
	Optional<Template> getUserById(int id);
}
