package com.militarism2.militarism2.scenario;

//enum CommandUnit{MOVE,ATTACK}
//enum CommandPlayer{CONCEDE,CREATE_CITY,CREATE_FACTORY}

public abstract class Command {

	//Кто вызвал, игрок или инструкция, можно проверь на null
	public Player invokerPlayer;
	public Instruction invokerInstruction;
	
	//List<String,String> args;
	
	//Выполнить команду
	public abstract void ProcessCommand();
	
	/*{
		"unit_id": "2",
		"command": "MOVE",
		"args": {
			"x": "2",
			"y": "6"
		}
	}*/
	
	/*{
	"unit_id": "2",
	"command": "ATTACK",
	"args": {
		"unit_id": "4"		
	}
	}*/
	
	/*{
	"player_id": "1",
	"command": "CONCEDE"	
	}*/
	
	/*{
	"player_id": "1",
	"command": "CREATE_CITY",
	"args": {
		"x": "8",
		"x": "10"
	}	
	}*/
	
	/*{
	"player_id": "1",
	"command": "CREATE_FACTORY",
	"args": {
		"city_id": "1",
		"type":"TANKS_FACTORY"		
	}	
	}*/
	
	
	
}
