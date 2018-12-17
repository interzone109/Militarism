package com.militarism2.militarism2.mvc.games.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.militarism2.militarism2.model.User;
import com.militarism2.militarism2.mvc.games.entity.GameEntity;
import com.militarism2.militarism2.mvc.games.entity.PlayerEntity;
import com.militarism2.militarism2.mvc.games.repositary.PlayerRepository;

/*
 * @author Dima
 * */

@Service
public class PlayerServiceImp implements PlayerService {

	PlayerRepository repo;
	
	@Autowired
	public PlayerServiceImp(PlayerRepository repo) {
		this.repo = repo;
	}
	
	public boolean addPlayer(PlayerEntity entity)
	{
		repo.save(entity);
		return true;
	}
	
	public Collection<PlayerEntity> getAllPlayers() {
		
		return repo.findAll();
	}
	
	@Override
	public PlayerEntity findOneByName(String name) {
		
		return repo.findOneByName(name);
	}
	
	@Override
	public List<PlayerEntity> findOneByUser(User user) {
		
		return repo.findAllByUser(user);
	}

}
