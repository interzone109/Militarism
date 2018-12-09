package com.militarism2.militarism2.scenario;

import java.util.ArrayList;
import java.util.List;

import com.militarism2.militarism2.elements.Map;

public class DataPackage {	
	
	public Player forPlayer;
	public GameData data;	
	
	//Уведомления об изменениях с прошлой итерации игры
	//Добавляются после обработки действий всех игроков(класс игры или сценария) на текущей итерации
	List<Notification> notifications;
	
	//Map relativeMap;
	//List<Player> players;
	
	public DataPackage(GameData gd, Player player) {
		this.data = gd;
		this.forPlayer = player;
		
		this.notifications = new ArrayList<Notification>();				
	}
	
	public void AddNotificatoin(String text) {
		AddNotificatoin(new Notification(text));		
	}
	public void AddNotificatoin(Notification not) {
		notifications.add(not);
	}
	
	
	//Строка с данными для отправки пользователю
	//Формируется из объекта этого класса
	public String getJSON() {
		return "JSON";
	}
}
