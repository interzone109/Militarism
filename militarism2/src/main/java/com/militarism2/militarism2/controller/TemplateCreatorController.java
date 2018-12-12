package com.militarism2.militarism2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.militarism2.militarism2.game.unit.service.TemplateServiceImpl;
import com.militarism2.militarism2.mvc.model.TempalteModel;

@Controller
public class TemplateCreatorController {

	@Autowired
	private TemplateServiceImpl templateServiceImpl;

	@RequestMapping(value = "/templateCreator", method = RequestMethod.GET)
	public String creaturePage(Model model) {
		model.addAttribute("tempalteModel", new TempalteModel());
		return "templateCreator";
	}

	@RequestMapping(value = "/templateCreator", method = RequestMethod.POST)
	public String saveCreature(Model model,
			@ModelAttribute("tempalteModel") TempalteModel tempalteModel) {
		
		try {
			templateServiceImpl.createNewTempalte(tempalteModel);
			model.addAttribute("tempalteModel", tempalteModel);
			return "templateCreatorViev";
		}catch (Exception e) {
			model.addAttribute("errorMessage", "Error: " + e.getMessage());
	         return "templateCreator";	  
		}
	}
}
