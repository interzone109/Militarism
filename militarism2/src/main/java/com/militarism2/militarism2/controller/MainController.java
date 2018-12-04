package com.militarism2.militarism2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unit.army.Infantry;
import com.militarism2.militarism2.game.unit.army.template.Template;
import com.militarism2.militarism2.game.unit.build.GameFactory;
import com.militarism2.militarism2.game.unit.entity.ArmyEntity;
import com.militarism2.militarism2.game.unit.entity.PlayerArmy;
import com.militarism2.militarism2.game.unit.service.ArmyEntityServiceImpl;
import com.militarism2.militarism2.game.unit.service.TemplateServiceImpl;
import com.militarism2.militarism2.game.unit.type.ArmyType;

/**
 * Контроллер для главной страници
 */
@Controller
public class MainController {
	@Autowired
	private TemplateServiceImpl templateServiceImpl;
	@Autowired
	private ArmyEntityServiceImpl armyEntityServiceImpl;

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String index(Model model) {
		GameFactory gameFactory = new GameFactory();
		gameFactory.create("infantry_test1");
		gameFactory.create("infantry_test2");
		return "index";
	}

}
