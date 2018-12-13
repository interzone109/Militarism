package com.militarism2.militarism2.controller;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.militarism2.militarism2.mvc.games.entity.CountryEntity;
import com.militarism2.militarism2.mvc.games.entity.GameEntity;
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

	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/country", method = RequestMethod.GET)
	public String country(Model model) throws ParseException
	{	
		//countrySeviceImp.addCountry(new CountryEntity("German Empire"));
		//countrySeviceImp.addCountry(new CountryEntity("Russia"));
		//countrySeviceImp.addCountry(new CountryEntity("France"));
		//countrySeviceImp.addCountry(new CountryEntity("British Empire"));
		//model.addAttribute("country", countrySeviceImp.findOneByName("USSR").getName());
		//ScenarioEntity sc=scenarioSeviceImp.findOneByName("World War 1");
		
		/*GameEntity game =new GameEntity();
		game.setGameStatus("Wait Players");
		game.setName("Operation Alacrity");
		game.setRound((short)0);
		game.setScenario(scenarioSeviceImp.findOneByName("World War 1"));
		
		
	
		//сегодняшнее время плюс 7 дней
		long timeNow=Calendar.getInstance().get(Calendar.MILLISECOND);
		Date date=new Date(timeNow+(1000*60*60*24*7));
		game.setStartTime(date);
		game.setTurnPeriod(1000*60*60*24);
		
		gameServiceImp.createGame(game);
		*/
		
		//date.setTime();
		//game.setStartTime(date);
		//sc.setCountries(countrySeviceImp.getAllCountries());
		//countrySeviceImp.addCountry(new CountryEntity("USSR"));
		
		//sc.setCountries(countrySeviceImp.getAllCountries());
		
		//sc.setName("World War 1");
		//sc.setCountries(countrySeviceImp.getAllCountries());
		
		//scenarioSeviceImp.addScenario(sc);
		//countrySeviceImp.deleteAll();
		//model.addAttribute("country", scenarioSeviceImp.findOneByName("World War 1").getName());
		//model.addAttribute("country", countrySeviceImp.findOneByName("Russia").getName());
		//model.addAttribute("country", sc.getCountries().get(0).getName());
		
		model.addAttribute("country",gameServiceImp.findByName("Operation Alacrity").getGameStatus());
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
