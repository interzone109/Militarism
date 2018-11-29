package com.militarism2.militarism2.scenario;

import java.util.ArrayList;
import java.util.List;

import com.militarism2.militarism2.elements.Map;

public class DataPackage {	
	
	public Player forPlayer;
	
	Map relativeMap;
	List<Player> players;
	
	//Уведомления об изменениях с прошлой итерации игры
	//Добавляются после обработки действий всех игроков(класс игры или сценария) на текущей итерации
	List<Notification> notifications;
	
	public DataPackage(Map relativeMap, List<Player> players) {
		this.notifications = new ArrayList<Notification>();
		
		this.relativeMap = relativeMap;
		this.players = players;		
	}
	
	void AddNotificatoin(String text) {
		notifications.add(new Notification(text));
	}
	
	
	//Строка с данными для отправки пользователю
	//Формируется из объекта этого класса
	public String getJSON() {
		return "JSON";
	}
}
