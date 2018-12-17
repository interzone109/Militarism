package com.militarism2.militarism2.controller;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.militarism2.militarism2.model.RegPlayerInGame;
import com.militarism2.militarism2.model.User;
import com.militarism2.militarism2.mvc.games.entity.CountryEntity;
import com.militarism2.militarism2.mvc.games.entity.GameEntity;
import com.militarism2.militarism2.mvc.games.entity.PlayerEntity;
import com.militarism2.militarism2.mvc.games.entity.ScenarioEntity;
import com.militarism2.militarism2.mvc.games.service.CountrySeviceImp;
import com.militarism2.militarism2.mvc.games.service.GameServiceImp;
import com.militarism2.militarism2.mvc.games.service.PlayerServiceImp;
import com.militarism2.militarism2.mvc.games.service.ScenarioServiceImp;
import com.militarism2.militarism2.services.userservice.UserServiceImpl;

/*
 * @author Dima
 * */

@Controller
public class GamesController {

	@Autowired
	private GameServiceImp gameServiceImp;
	@Autowired
	private UserServiceImpl userServiceImpl;
	
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
		//ScenarioEntity sc=new ScenarioEntity();
		//sc.setColor("red");
		//sc.setCountries(countrySeviceImp.getAllCountries());
		//sc.setName("World War 2");
		//scenarioSeviceImp.addScenario(sc);
		//GameEntity game =new GameEntity();
	
		/*GameEntity game =new GameEntity();
		game.setGameStatus("Wait Players");
		game.setName("Operation Singletone");
		game.setRound((short)0);
		game.setScenario(scenarioSeviceImp.findOneByName("World War 2"));
		
		
	
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
		
		//model.addAttribute("country",System.currentTimeMillis()/1000);
		//model.addAttribute("games",gameServiceImp.getAllGames());
		//model.addAttribute("games", gameServiceImp.findById(1).getPlayers());
		//model.addAttribute("games", );
		return "country";		
	}
	

	@RequestMapping(value = "/games", method = RequestMethod.GET)
    public String games(Model model) {  
		
		model.addAttribute("games",gameServiceImp.getAllGames());
		
        return "gameList";
    }
	@GetMapping(value="/games/game{id}")
	public String showGamebyId(Model model,@RequestParam("id") long id) {  
		
		if(gameServiceImp.findById(id)!=null)
		{
			GameEntity game=gameServiceImp.findById(id);
			
			model.addAttribute("game",game);
			
			model.addAttribute("countries",game.getScenario().getCountries());
		}
		
		model.addAttribute("playerReg", new RegPlayerInGame());
        return "showGameById";
    }
	
	@PostMapping("/regPlayer")
    public String getDataFromForum(@ModelAttribute RegPlayerInGame playerReg, long gameId){
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		Optional<User> isUser=userServiceImpl.getUserByName(currentPrincipalName);
		User currentUser;
		if(isUser.isPresent())
		{
			currentUser=isUser.get();
			playerReg.setGameId(gameId);
			GameEntity game=gameServiceImp.findById(playerReg.getGameId());
			PlayerEntity player=new PlayerEntity();
			player.setUser(currentUser);
			player.setCountryStatus("Registered");
			player.setName(playerReg.getCountryName());
			playerSeviceImp.addPlayer(player);
			gameServiceImp.regUserInGame(player, game.getId());
		}
		
		
        
		 return "redirect:/userpage";
    }
}
