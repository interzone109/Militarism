package com.militarism2.militarism2.scenario;

import java.util.ArrayList;
import java.util.List;

import com.militarism2.militarism2.elements.Debug;
import com.militarism2.militarism2.elements.Map;
import com.militarism2.militarism2.elements.Unit;

public class GameData {
	
	public Map map;
	
	public List<Player> players;	
	public List<Unit> units;
	
	public GameData() {
		Debug.ctor("GameData");	
		this.map = new Map();
		
		this.players= new ArrayList<Player>();
		this.units = new ArrayList<Unit>();
	}
	//Переносит данные игры
	public GameData(GameData gd) {
		Debug.ctor("GameData");	
		this.map = new Map(gd.map);;//Копирует массив элементов карты
		
		this.players=gd.players;
		this.units = gd.units;
	}
	
	public Player getPlayer(int playerId){
		for(int i=0;i<players.size();i++) {
			Player p = players.get(i);
			if(p.playerId == playerId)
				return p;
		}
		return null;
	}
	
	public GameData getRelativeData(Player player) {
		GameData gd = new GameData(this);	
		
		processHiddenMap(gd.map,player);				
		return gd;
	}
	//Изменяет переданную карту
	private void processHiddenMap(Map map,Player player) {
		
		//Перебор всех юнитов и замена Элементов карты на HiddenElement если клетка вне поля зрения	
		
		/*for (int y = 0; y < map.sizeHeight; y++) {
			for (int x = 0; x < map.sizeWidth; x++) {				
				Element cur = map.getElement(x, y);
				
				
			}
		}*/
				
	}
}
