package com.militarism2.militarism2.services.gameListService;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public interface IGameListItem {
	
	String getName();
	ArrayList<String> getCountriesFreeSlots();
	boolean regUser(String userName,int slotId);
	int getUserCount();
	int getMaxUsersCount();
	
}
