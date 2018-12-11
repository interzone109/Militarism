package com.militarism2.militarism2.mvc.games.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.militarism2.militarism2.mvc.games.repositary.GameRepositary;
/**
 * FIXME: тут реализуй все методы из интерфейса GameService используя интерфейс GameRepositary
 * */
@Service
public class GameServiceImpl implements GameService {

	private final GameRepositary gameRepositary;

	@Autowired
	public GameServiceImpl(GameRepositary gameRepositary) {
		this.gameRepositary = gameRepositary;
	}

}
