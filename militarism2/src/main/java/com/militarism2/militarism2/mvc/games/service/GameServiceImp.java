package com.militarism2.militarism2.mvc.games.service;

import java.sql.Date;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.militarism2.militarism2.model.User;
import com.militarism2.militarism2.mvc.games.entity.GameEntity;
import com.militarism2.militarism2.mvc.games.repositary.GameRepository;

/*
 * @author Dima
 * */
@Service
public class GameServiceImp implements GameService {

	private GameRepository gameRepository;

	@Autowired
	public GameServiceImp(GameRepository gameRepository) {
		this.gameRepository = gameRepository;
	}

	
	public void createGame(String name, String gameStatus, long turnPeriod, Date start) {
		GameEntity game = new GameEntity();
		// дописать
		//game.setName(name);
		//game.setStartTime(start);
		//game.setRound((short) 0);
		//game.setTurnPeriod(turnPeriod);
		//game.setGameStatus(gameStatus);
		gameRepository.save(game);
	}

	public Collection<GameEntity> getAllGames() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean regUserInGame(User user, long gameId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean exitUserFromGame(User user, long gameId) {
		// TODO Auto-generated method stub
		return false;
	}

	public Optional<GameEntity> getUserGamesList(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * public GameTableService(String name,int maxUsers,ArrayList<String> countries)
	 * { this.name=name; this.maxUsersInGame=maxUsers; countRegUsers=0;
	 * countrySlotList=countries; usersNameReg=new ArrayList<String>();
	 * 
	 * 
	 * }
	 */

}
