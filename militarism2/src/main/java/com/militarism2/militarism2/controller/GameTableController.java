package com.militarism2.militarism2.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.militarism2.militarism2.services.gameListService.GameTableService;

@Controller
public class GameTableController {
	
	
	@Autowired
	private GameTableService item;
	


	@RequestMapping(value = "/games", method = RequestMethod.GET)
    public String gam(Model model) {  
		
		ArrayList<String> arr =new ArrayList<>();
		arr.add("Germany");
		arr.add("USSR");
		arr.add("JAPAN");
		arr.add("USA");
		
		item.setName("TestGame");
		item.setCountrySlotList(arr);
		item.setMaxUsersInGame(arr.size());
		item.setCountRegUsers(0);
		
		//gameTables.setName("Руслaн");
		//model.addAttribute("gameTables", gameTables.getName());
		model.addAttribute("Name",item.getName());
		model.addAttribute("MaximumUsersInGame",item.getMaxUsersCount());
		model.addAttribute("CountUsers",item.getUserCount());
		model.addAttribute("Countries",item.getCountriesFreeSlots());
		
        return "gameList";
    }
	
	
	
}
