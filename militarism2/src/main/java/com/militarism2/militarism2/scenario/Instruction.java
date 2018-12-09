package com.militarism2.militarism2.scenario;

import java.util.List;
import java.util.ArrayList;

public class Instruction {	
	//На каком ходу выполнится игровое событие сценария
	public int targetItteration;
	
	//Список действий
	List<Command> command;
	
	String name;
	String text;
	//String image
	
	public Instruction() {
		command = new ArrayList<Command>();
	}
	
	//List<Notification> notifications;
}
