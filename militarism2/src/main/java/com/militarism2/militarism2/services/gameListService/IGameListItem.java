package com.militarism2.militarism2.services.gameListService;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

/**
 * FIXME: IGameListItem название класса не пожходит 
 * должно быть GameService
 * */

@Service
public interface IGameListItem {
	
	
	/**
	 * FIXME: этот интерфейс должен получать класс Game 
	 * или List<Game> 
	 * */
	
	
	String getName();//FIXME: не нужно удоли
	ArrayList<String> getCountriesFreeSlots();//FIXME: не нужно удоли
	boolean regUser(String userName,int slotId);//FIXME: не нужно удоли
	int getUserCount();//FIXME: не нужно удоли
	int getMaxUsersCount();//FIXME: не нужно удоли
	
}
