package com.militarism2.militarism2.services.gameListService;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class GameTableService {
	/**
	 * шо это за пиздец 
	 * Где Репозиторий класса Game ???????
	 * нахуя тут эти все переменные??
	 * удалить все 
	 * */
	private String name;
	private ArrayList<String> countrySlotList;
	private ArrayList<String> usersNameReg;
	private int maxUsersInGame;
	private int countRegUsers;
	

	/*public GameTableService(String name,int maxUsers,ArrayList<String> countries)
	{
		this.name=name;
		this.maxUsersInGame=maxUsers;
		countRegUsers=0;
		countrySlotList=countries;
		usersNameReg=new ArrayList<String>();
		
		
	}*/
	
	
	public String getName() {
		return name;
	}

	public ArrayList<String> getCountrySlotList() {
		return countrySlotList;
	}

	public void setCountrySlotList(ArrayList<String> countrySlotList) {
		this.countrySlotList = countrySlotList;
	}

	public ArrayList<String> getUsersNameReg() {
		return usersNameReg;
	}

	public void setUsersNameReg(ArrayList<String> usersNameReg) {
		this.usersNameReg = usersNameReg;
	}

	public int getMaxUsersInGame() {
		return maxUsersInGame;
	}

	public void setMaxUsersInGame(int maxUsersInGame) {
		this.maxUsersInGame = maxUsersInGame;
	}

	public int getCountRegUsers() {
		return countRegUsers;
	}

	public void setCountRegUsers(int countRegUsers) {
		this.countRegUsers = countRegUsers;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public ArrayList<String> getCountriesFreeSlots() {
		
		return countrySlotList;
	}


	public boolean regUser(String userName, int slotId) {
		
		if(usersNameReg.contains(userName) && countRegUsers<maxUsersInGame)
			return false;
		
		usersNameReg.add(userName);
		countRegUsers++;
		return true;
	}


	public int getUserCount() {
		return countRegUsers;
	}


	public int getMaxUsersCount() {
		
		return maxUsersInGame;
	}

}
