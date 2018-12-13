package com.militarism2.militarism2.mvc.games.service;

import java.util.Collection;
import java.util.Optional;

import com.militarism2.militarism2.model.User;
import com.militarism2.militarism2.mvc.games.entity.GameEntity;

/*
 * @author Dima
 * */
public interface GameService {
	
	Collection <GameEntity> getAllGames();
	
	boolean regUserInGame(User user,long gameId);
	
	boolean exitUserFromGame(User user,long gameId);
	
	Optional<GameEntity> getUserGamesList(User user);
}
