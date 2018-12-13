package com.militarism2.militarism2.mvc.games.service;

import com.militarism2.militarism2.mvc.games.entity.PlayerEntity;
/*
 * @author Dima
 * */

public interface PlayerService {
	PlayerEntity findOneByName(String name);
}
