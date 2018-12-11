package com.militarism2.militarism2.services.gameListService;

import java.util.Collection;
import java.util.Optional;

import com.militarism2.militarism2.model.GameModel;
import com.militarism2.militarism2.model.User;

public interface GameService {
	
	Collection <GameModel> getAllGames();
	
	boolean regUserInGame(User user,long gameId);
	
	boolean exitUserFromGame(User user,long gameId);
	
	Optional<GameModel> getUserGamesList(User user);
	

}
