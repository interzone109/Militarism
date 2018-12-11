package com.militarism2.militarism2.mvc.games.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.militarism2.militarism2.mvc.games.entity.Game;
/**
 * FIXME: опиши тут методы для получения сущности Game
 * 
 * */
public interface GameRepositary extends JpaRepository<Game, Long>{

}
