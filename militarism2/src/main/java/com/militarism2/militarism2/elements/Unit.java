package com.militarism2.militarism2.elements;

import com.militarism2.militarism2.scenario.Player;


public class Unit {
	public int x,y;
	public Player player;
	
	public int unitId;
	
	public static int MAXID = 1;
	public Unit() {
		System.out.println("[Unit.ctor]:empty");
		
		unitId = Unit.MAXID;
		Unit.MAXID++;
	}
	public Unit(Player p,int x,int y) {
		this.x = x;
		this.y = y;
		this.player = p;
		
		unitId = Unit.MAXID;
		Unit.MAXID++;
		System.out.println("[Unit.ctor]:"+"playerId="+player.playerId+"unitId "+unitId+"  x"+x+"y"+y);
	}
	
	public void Move(int x, int y) {
		// TODO Auto-generated method stub		
	}
	
	
	//Для тестов
		public String getSymbol() {
			return "U";		
		}

}
