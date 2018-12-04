package com.militarism2.militarism2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.militarism2.militarism2.game.unit.build.GameFactory;
import com.militarism2.militarism2.game.unit.service.PlayerArmyServiceImpl;
import com.militarism2.militarism2.game.unit.service.TemplateServiceImpl;


/**
 * Контроллер для главной страници
 */
@Controller
public class MainController {
	@Autowired
	private GameFactory gameFactory;

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String index(Model model) {
		
		
		gameFactory.createArmy("infantry_test1",50);
	//	gameFactory.create("infantry_test2");
		
		return "index";
	}

}
