package com.militarism2.militarism2.mvc.games.service;

import java.util.Collection;
import java.util.Optional;

import com.militarism2.militarism2.model.User;
import com.militarism2.militarism2.mvc.games.entity.GameModel;

/**
 * FIXME: продублируй сюда методы из класса GameRepositary
 * 
 * */
public interface GameService {
	
	Collection <GameModel> getAllGames();
	
	boolean regUserInGame(User user,long gameId);
	
	boolean exitUserFromGame(User user,long gameId);
	
	Optional<GameModel> getUserGamesList(User user);
}
