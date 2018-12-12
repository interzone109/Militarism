package com.militarism2.militarism2.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.militarism2.militarism2.mvc.games.entity.CountryModel;
import com.militarism2.militarism2.mvc.games.service.CountrySeviceImp;
import com.militarism2.militarism2.mvc.games.service.GameServiceImp;

@Controller
public class GamesController {

	@Autowired
	private GameServiceImp gameServiceImp;
	
	@Autowired
	private CountrySeviceImp countrySeviceImp;
	

	@RequestMapping(value = "/country", method = RequestMethod.GET)
	public String country(Model model)
	{	
		countrySeviceImp.addCountry(new CountryModel("test"));
		return "country";		
	}
	
	// FIXME: Тут данные должны браться из GameServiceImpl и передоваться в модель в виде списка
	@RequestMapping(value = "/games", method = RequestMethod.GET)
    public String gam(Model model) {  
		
		//item.createGame("Test Game", ,);
		ArrayList<String> arr =new ArrayList<>();
		arr.add("Germany");
		arr.add("USSR");
		arr.add("JAPAN");
		arr.add("USA");
		
		//item.setName("TestGame");
		//item.setCountrySlotList(arr);
		//item.setMaxUsersInGame(arr.size());
		//item.setCountRegUsers(0);
		
		//gameTables.setName("Руслaн");
		//model.addAttribute("gameTables", gameTables.getName());
		//model.addAttribute("Name",item.getName());
		//model.addAttribute("MaximumUsersInGame",item.getMaxUsersCount());
		//model.addAttribute("CountUsers",item.getUserCount());
		//model.addAttribute("Countries",item.getCountriesFreeSlots());
		
        return "gameList";
    }
	
	// FIXME: Тут должен быть контролер типа @RequestMapping(value = "/games/game{id}" 
	// и он должен перенаправлять на страницу с конкретной игрой 
}
