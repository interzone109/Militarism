package com.militarism2.militarism2.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.militarism2.militarism2.mvc.games.entity.CountryEntity;
import com.militarism2.militarism2.mvc.games.entity.ScenarioEntity;
import com.militarism2.militarism2.mvc.games.service.CountrySeviceImp;
import com.militarism2.militarism2.mvc.games.service.GameServiceImp;
import com.militarism2.militarism2.mvc.games.service.PlayerServiceImp;
import com.militarism2.militarism2.mvc.games.service.ScenarioServiceImp;

/*
 * @author Dima
 * */

@Controller
public class GamesController {

	@Autowired
	private GameServiceImp gameServiceImp;
	
	
	@Autowired
	private CountrySeviceImp countrySeviceImp;
	
	@Autowired
	private ScenarioServiceImp scenarioSeviceImp;
	
	@Autowired
	private PlayerServiceImp playerSeviceImp;

	@RequestMapping(value = "/country", method = RequestMethod.GET)
	public String country(Model model)
	{	
		//countrySeviceImp.addCountry(new CountryEntity("German Empire"));
		//countrySeviceImp.addCountry(new CountryEntity("Russia"));
		//countrySeviceImp.addCountry(new CountryEntity("France"));
		//countrySeviceImp.addCountry(new CountryEntity("British Empire"));
		//model.addAttribute("country", countrySeviceImp.findOneByName("USSR").getName());
		ScenarioEntity sc=scenarioSeviceImp.findOneByName("World War 2");
	
		
		sc.setCountry(countrySeviceImp.findOneByName("USSR"));
		
		//sc.setName("World War 3");
		//sc.setCountries(countrySeviceImp.getAllCountries());
		
		scenarioSeviceImp.addScenario(sc);
		
		//model.addAttribute("country", scenarioSeviceImp.findOneByName("World War 3").getName());
		return "country";		
	}
	

	@RequestMapping(value = "/games", method = RequestMethod.GET)
    public String games(Model model) {  
		
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
