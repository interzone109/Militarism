package com.militarism2.militarism2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unit.army.template.InfantryTemplateSquad;
import com.militarism2.militarism2.game.unit.army.template.Template;
import com.militarism2.militarism2.game.unit.service.TemplateServiceImpl;

/**
 * Контроллер для главной страници*/
@Controller
public class MainController {
	@Autowired
	TemplateServiceImpl templateServiceImpl;
	
	
	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {        
 
        return "index";
    }
	
	private void save() {
		Template template = new InfantryTemplateSquad("USSR", new Point(1,1));
		
		
		templateServiceImpl.save(template);
		List<Template> list = templateServiceImpl.getAll();
		for (Template template2 : list) {
			System.out.println(template2.toString());
		}
	}
}
