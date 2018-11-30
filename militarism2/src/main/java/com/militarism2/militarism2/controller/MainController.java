package com.militarism2.militarism2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	

}
