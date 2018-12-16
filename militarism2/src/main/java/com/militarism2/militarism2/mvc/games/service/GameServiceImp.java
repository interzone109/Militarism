package com.militarism2.militarism2.mvc.games.service;

import java.sql.Date;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.militarism2.militarism2.model.User;
import com.militarism2.militarism2.mvc.games.entity.CountryEntity;
import com.militarism2.militarism2.mvc.games.entity.GameEntity;
import com.militarism2.militarism2.mvc.games.entity.PlayerEntity;
import com.militarism2.militarism2.mvc.games.repositary.GameRepository;
import com.militarism2.militarism2.scenario.Player;

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

	public GameEntity findByName(String name) {
		return gameRepository.findByName(name);

	}
	
	public GameEntity findById(long id) {
		
				Optional<GameEntity> a= gameRepository.findById(id);
				return a.get();

	}
	
	public void createGame(GameEntity game) {
		//GameEntity game = new GameEntity();
		// дописать
		//game.setName(name);
		//game.setStartTime(start);
		//game.setRound((short) 0);
		//game.setTurnPeriod(turnPeriod);
		//game.setGameStatus(gameStatus);
		gameRepository.save(game);
	}

	public Collection<GameEntity> getAllGames() {
		
		return gameRepository.findAll();
	}

	@Override
	public boolean regUserInGame(PlayerEntity player, long gameId) {
		Optional<GameEntity> game=gameRepository.findById(gameId);
		GameEntity currentGame= game.get();
		player.setGame(currentGame);
		currentGame.addPlayer(player);
		gameRepository.save(currentGame);
		return true;
	}

	public boolean exitUserFromGame(PlayerEntity player, long gameId) {
		// TODO Auto-generated method stub
		return false;
	}

	public Collection<GameEntity> getUserGamesList(User user) {
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
