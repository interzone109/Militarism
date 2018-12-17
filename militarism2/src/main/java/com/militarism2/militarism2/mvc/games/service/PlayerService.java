package com.militarism2.militarism2.mvc.games.service;

import java.util.List;

import com.militarism2.militarism2.model.User;
import com.militarism2.militarism2.mvc.games.entity.PlayerEntity;
/*
 * @author Dima
 * */

public interface PlayerService {
	PlayerEntity findOneByName(String name);

	List<PlayerEntity> findOneByUser(User user);
}
