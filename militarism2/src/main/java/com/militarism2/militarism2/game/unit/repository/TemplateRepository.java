package com.militarism2.militarism2.game.unit.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.militarism2.militarism2.game.unit.army.template.Template;


public interface TemplateRepository extends JpaRepository<Template,Long> {

}
