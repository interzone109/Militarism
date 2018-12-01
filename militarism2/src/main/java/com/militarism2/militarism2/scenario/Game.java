package com.militarism2.militarism2.scenario;

import java.util.List;

import com.militarism2.militarism2.elements.App_ScenarioAndMapTest;
import com.militarism2.militarism2.elements.Debug;
import com.militarism2.militarism2.elements.Element;
import com.militarism2.militarism2.elements.Field;
import com.militarism2.militarism2.elements.Hill;
import com.militarism2.militarism2.elements.Map;
import com.militarism2.militarism2.elements.Unit;

public class Game {
	
	int itteration;	//текущая итерация/номер ход
	
	Scenario sc;	
	public GameData data;	
	
	
	public Game(Scenario sc) {
		this.itteration = 1;
		
		
		this.sc = sc;
		//Перенос данных из сценария
		this.data = new GameData(sc.data);		
	}
	
	
	//////////////////////////////////////////////////////
	///////////////////////DATAUPDATE/////////////////////
	//////////////////////////////////////////////////////
		
	public void UpdatePlayersData() {
		
		for(int i=0;i<data.players.size();i++) {
			Player player = data.players.get(i);			
			
			//Текущий игрок до сих пор в игре
			//if(p.status)

			DataPackage dp = new DataPackage(data.getRelativeData(player),player);	
			String json = dp.getJSON();			
			//Сохраняем JSON в файл и отправляем
			//mailSender.sendMessage(file,player.User);
			
		}		
	}
	
	
	//////////////////////////////////////////////////////
	/////////////////////////DEBUG////////////////////////
	//////////////////////////////////////////////////////
	public void Print() {
		Debug.method("Game", "Print");
		
		Map map = this.data.map;
		int sizeHeight = map.sizeHeight;
		int sizeWidth = map.sizeWidth;
		List<Element> elements = map.elements;
		
		for (int y = 0; y < sizeHeight; y++) {
			for (int x = 0; x < sizeWidth; x++) {
				//Debug.log("Print_size", elements.size()+"");
				
				Element cur = elements.get(map.getIndex(x,y));
				for(int i = 0; i < cur.units.size(); i++) {		
					Unit u = cur.units.get(i);						
					System.out.print(u.getSymbol()+u.player.playerId+" ");
				}
				if(cur.units.size()!=0) {}
				else if(cur instanceof Field) { //.getSimpleName().compareTo(Elements.Field.toString())==0) {
					System.out.print("__ ");	
				}					
				else if(cur instanceof Hill) { 
					System.out.print("■■ ");	
				}					
			}
			System.out.println();			
		}				
	}
	
	
	//////////////////////////////////////////////////////
	/////////////////////////Units////////////////////////
	//////////////////////////////////////////////////////
	
	public void createUnit(Player player,int x, int y) {
		Unit u = new Unit(player,x,y);	
		data.units.add(u);

		data.map.elements.get(data.map.getIndex(x, y)).units.add(u);	
	}
	public void createUnit(int playerId,int x, int y) {		
		System.out.println("[Game.createUnit]: getPlayer = "+data.getPlayer(playerId));
		
		this.createUnit(data.getPlayer(playerId), x, y);	
	}
	
	public void addUnit(Unit u) {
		data.units.add(u);
	}
	public Unit getUnit(int unitId) {
		List<Unit> units = data.units;
		for(int i=0;i<units.size();i++) {
			Unit u = units.get(i);
			if(u.unitId == unitId)
				return u;
		}
		return null;
	}
	
	//////////////////////////////////////////////////////
	/////////////////////////JSON/////////////////////////
	//////////////////////////////////////////////////////
	
	//Возможно нужно вынести отдельно всё что c JSON
	public Command commandFromJSON(String JSON) {		
		Command res;
		//////////////Парсим JSON//////////////////				
		CommandUnitMove c = new CommandUnitMove();
			//Если в JSON есть playerId
			c.invokerPlayer = data.getPlayer(1);
		c.x = 10;
		c.y = 8;
		c.unit = getUnit(4);			
		///////////////////////////////////////////		
		res = c;
		if(true) {
			int playerId = 1;		
			res.invokerPlayer = data.getPlayer(playerId);
		}		
		return res;
	}


	public void addPlayer(Player player) {
		data.players.add(player);		
	}	
	
}
