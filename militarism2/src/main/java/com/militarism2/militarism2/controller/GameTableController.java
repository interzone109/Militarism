package com.militarism2.militarism2.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.militarism2.militarism2.model.GameList;
import com.militarism2.militarism2.services.gameListService.GameTableService;
import com.militarism2.militarism2.services.gameListService.IGameListItem;

@Controller
public class GameTableController {
	
	
	@Autowired
	private GameTableService item;//FIXME: замени на GameServiceImpl класс
	

	// FIXME: Тут данные должны браться из GameServiceImpl и передоваться в модель в виде списка
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
	// FIXME: Тут должен быть контролер типа @RequestMapping(value = "/games/game{id}" 
	// и он должен перенаправлять на страницу с конкретной игрой 
	
	
}
