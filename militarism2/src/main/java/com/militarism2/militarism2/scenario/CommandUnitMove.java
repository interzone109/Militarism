package com.militarism2.militarism2.scenario;

import com.militarism2.militarism2.elements.Unit;

public class CommandUnitMove extends Command {
	//Для альтернативной реализации команд без enum
	//String name = "MOVE";
	
	
	Unit unit;
	int x;
	int y;
	@Override
	public void ProcessCommand() {
		//Учититываем положение юнита, типы клеток, бонусы/минусы к скорости
		
		//?Поиск оптимального пути
		
		unit.Move(x,y);				
	}
	
	//Проверить есть ли права у игрока давать команду этому юниту/защита от редактирования данных

}
