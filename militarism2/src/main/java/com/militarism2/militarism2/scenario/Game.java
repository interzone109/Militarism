package com.militarism2.militarism2.scenario;

public class Game {
	Scenario sc;
	
	
	public DataPackage generateDataPackageForPlayer(Player player) {
		DataPackage dp = new DataPackage(
				sc.map.getRelativeMap(player),
				sc.players				
				);		
		dp.forPlayer = player;
		
		return dp;		
	}
	//Возможно нужно вынести отдельно всё что c JSON
	public Command commandFromJSON(String JSON) {		
		Command res;
		//////////////Парсим JSON//////////////////
		
		
		CommandUnitMove c = new CommandUnitMove();
			//Если в JSON есть playerId
			c.invokerPlayer = sc.getPlayer(1);
		c.x = 10;
		c.y = 8;
		c.unit = sc.getUnit(4);	
		
		///////////////////////////////////////////

		
		res = c;
		if(true) {
			int playerId = 1;		
			res.invokerPlayer = sc.getPlayer(playerId);
		}
		
		return res;
	}	
}
