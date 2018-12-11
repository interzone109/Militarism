package com.militarism2.militarism2.services.gameListService;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.militarism2.militarism2.model.GameModel;
import com.militarism2.militarism2.model.User;
import com.militarism2.militarism2.repozitory.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/*
 * 
 * сервис для работы с таблицами игр и зареганых игроков
 * */
@Service
public class GameServiceImp implements GameService {
	
	@Autowired
	private GameRepository repo;
	
	public void createGame(String name,String gameStatus,long turnPeriod,Date start)
	{
		GameModel game=new GameModel();
		//дописать
		game.setName(name);
		game.setStartDate(start);
		game.setRound((short)0);
		game.setTurnPeriod(turnPeriod);
		game.setGameStatus(gameStatus);
		repo.save(game);
	}
	

	/*public GameTableService(String name,int maxUsers,ArrayList<String> countries)
	{
		this.name=name;
		this.maxUsersInGame=maxUsers;
		countRegUsers=0;
		countrySlotList=countries;
		usersNameReg=new ArrayList<String>();
		
		
	}*/
	
	


	@Override
	public Collection<GameModel> getAllGames() {
		List<GameModel> allgames= repo.findAll();
		// TODO Auto-generated method stub
		return allgames;
	}


	@Override
	public boolean regUserInGame(User user, long gameId) {
		
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean exitUserFromGame(User user, long gameId) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Optional<GameModel> getUserGamesList(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
