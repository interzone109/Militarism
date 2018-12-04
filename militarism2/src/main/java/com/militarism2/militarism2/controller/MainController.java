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
import com.militarism2.militarism2.game.unit.entity.PlayerArmy;
import com.militarism2.militarism2.game.unit.service.TemplateServiceImpl;
import com.militarism2.militarism2.game.unit.type.ArmyType;

/**
 * Контроллер для главной страници*/
@Controller
public class MainController {
	@Autowired
	TemplateServiceImpl templateServiceImpl;
	
	
	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {    
		Template sqad1 = new Template(0, 5, ArmyType.INFANTRY, "Squad",
				"USSR", 30, 15, 2, 1, 1, 30, 1, 30, 0, 10);

		templateServiceImpl.save(sqad1);
		
		Template sqad2=	templateServiceImpl.findByName("Squad").get();
		
		PlayerArmy army = new PlayerArmy();
		
		
		
        return "index";
    }
	

}
