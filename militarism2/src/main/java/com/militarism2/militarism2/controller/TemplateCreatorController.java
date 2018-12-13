package com.militarism2.militarism2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.militarism2.militarism2.game.unit.army.template.Template;
import com.militarism2.militarism2.game.unit.service.TemplateServiceImpl;
import com.militarism2.militarism2.game.unit.type.ArmyType;
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
	public String saveCreature(Model model, @ModelAttribute("tempalteModel") TempalteModel tempalteModel) {

		if (templateServiceImpl.createNewTempalte(tempalteModel)) {
			model.addAttribute("tempalteModel", tempalteModel);
			return "templateCreatorViev";
		} else {
			model.addAttribute("errorMessage", "Template name is allready exist");
			return "templateCreator";
		}
	}

	@RequestMapping(value = "/templateList", method = RequestMethod.GET)
	public String templateList(Model model) {

		model.addAttribute("templateList", templateServiceImpl.findAll());
		return "templateList";
	}

	@RequestMapping(value = "/templateCreatorViev", method = RequestMethod.GET, params = "id")
	public String templateListById(Model model, @RequestParam("id") Long id) {
		Template tempalteModel = templateServiceImpl.findById(id);
		model.addAttribute("tempalteModel", tempalteModel);
		return "templateCreatorViev";
	}

}
