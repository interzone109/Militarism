package com.militarism2.militarism2.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.militarism2.militarism2.game.unit.army.template.Template;
import com.militarism2.militarism2.game.unit.service.TemplateServiceImpl;
import com.militarism2.militarism2.mvc.model.TemplateModel;
/**
 * @author interzone
 * Контролеры ответственные за создание и редактирование класса Template 
 * */
@Controller
public class TemplateCreatorController {

	@Autowired
	private TemplateServiceImpl templateServiceImpl;
	/**
	 * Контроллер ответственный за отображения страницы создания TemplateModel
	 * */
	@RequestMapping(value = "/templateCreator", method = RequestMethod.GET)
	public String creaturePage(Model model) {
		model.addAttribute("tempalteModel", new TemplateModel());
		return "templateCreator";
	}
	
	/**
	 * Контроллер ответственный за сохранение в базу  Template
	 * */
	@RequestMapping(value = "/templateCreator", method = RequestMethod.POST)
	public String saveCreature(Model model, @ModelAttribute("templateModel") TemplateModel tempalteModel) {
		Optional<Template> optional = templateServiceImpl.createNewTempalte(tempalteModel) ;
		if (optional.isPresent()) {
			model.addAttribute("tempalteModel", optional.get());
			return "templateCreatorViev";
		} else {
			model.addAttribute("errorMessage", "Template name is allready exist");
			return "templateCreator";
		}
	}
	
	
	/*@RequestMapping(value = "/templateCreator", method = RequestMethod.GET, params = "id")
	public String editTemplate(Model model, @RequestParam("id") Long id) {
		Template template = templateServiceImpl.findById(id);
		model.addAttribute("tempalteEdit", template);
		return "templateCreatorViev";
	}*/
	
	
	/**
	 * Контроллер ответственный за отображения списка Template
	 * */
	@RequestMapping(value = "/templateList", method = RequestMethod.GET)
	public String templateList(Model model) {

		model.addAttribute("templateList", templateServiceImpl.findAll());
		return "templateList";
	}

	/**
	 * Контроллер ответственный за отображения  Template с возможностью редктирования данных
	 * */
	@RequestMapping(value = "/templateCreatorEdite", method = RequestMethod.GET, params = "id")
	public String templateEdit(Model model, @RequestParam("id") Long id) {
		Template templateModel = templateServiceImpl.findById(id);
		model.addAttribute("templateModel", templateModel);
		return "templateCreatorEdite";
	}
	
	/**
	 * Контроллер ответственный за обновления в базу  Template
	 * */
	@RequestMapping(value = "/templateEditor", method = RequestMethod.POST)
	public String saveCreature(Model model, @ModelAttribute("templateModel") Template tempalteModel) {
	
		if(tempalteModel.getName()!= null) {
			templateServiceImpl.update(tempalteModel) ;
		}
			System.out.println(tempalteModel.getName());
			System.out.println(tempalteModel.getId());
		    
		    model.addAttribute("templateModel", tempalteModel);
			return "templateCreatorViev";
		}
	
	/**
	 * Контроллер ответственный за отображения информации о конкретном Template
	 * */
	@RequestMapping(value = "/templateCreatorViev", method = RequestMethod.GET, params = "id")
	public String templateViev(Model model, @RequestParam("id") Long id) {
		Template templateModel = templateServiceImpl.findById(id);
		model.addAttribute("templateModel", templateModel);
		return "templateCreatorViev";
	}
	

	
}
