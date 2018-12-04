package com.militarism2.militarism2.game.unit.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.militarism2.militarism2.game.unit.army.template.TemplateBreak;


public interface TemplateRepository extends JpaRepository<TemplateBreak,Long> {
	 public List<TemplateBreak> findAllByCountry(String country);
	 public Optional<TemplateBreak> findByName(String name);
}
