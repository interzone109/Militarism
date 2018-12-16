package com.militarism2.militarism2.mvc.games.service;

import java.util.Collection;
import java.util.Optional;

import com.militarism2.militarism2.model.User;
import com.militarism2.militarism2.mvc.games.entity.GameEntity;
import com.militarism2.militarism2.mvc.games.entity.PlayerEntity;

/*
 * @author Dima
 * */
public interface GameService {
	
	Collection <GameEntity> getAllGames();
	
	boolean regUserInGame(PlayerEntity player, long gameId);
	
	boolean exitUserFromGame(PlayerEntity player, long gameId);
	
	Collection<GameEntity> getUserGamesList(User user);
}
