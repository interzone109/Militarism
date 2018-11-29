package com.militarism2.militarism2.scenario;

import java.util.ArrayList;
import java.util.List;

import com.militarism2.militarism2.elements.Element;
import com.militarism2.militarism2.elements.Field;
import com.militarism2.militarism2.elements.Hill;
import com.militarism2.militarism2.elements.Map;
import com.militarism2.militarism2.elements.Unit;

public class Scenario {
	
	int itteration;	//текущая итерация/номер ход
	public Map map;
	
	List<Instruction> instructions;
	public List<Player> players;
	
	public List<Unit> units;
	
	
	public Scenario() {
		System.out.println("[Scenario.ctor]");
		this.itteration = 1;
		this.map = new Map();
		
		this.players= new ArrayList<Player>();
		this.instructions = new ArrayList<Instruction>();
		
		this.units = new ArrayList<Unit>();
	}
	
	
	public List<Instruction> getInstructionsForItteration(int itteration){
		List<Instruction> res = new ArrayList<Instruction>();
		
		instructions.forEach((el)->{
			if(el.targetItteration == itteration)				
				res.add(el);			
			});
		
		return res;		
	}
	
	
	public Player getPlayer(int playerId){
		for(int i=0;i<players.size();i++) {
			Player p = players.get(i);
			if(p.playerId == playerId)
				return p;
		}
		return null;
	}
	
	
/////////////////////////////////Для проверки//////////////////////////////////////
	public void Print() {
		System.out.println("[Scenario.Print]");
		
		//System.out.print(map.elements.get(map.getIndex(2, 2)).units.size());
		int sizeHeight = map.sizeHeight;
		int sizeWidth = map.sizeWidth;
		List<Element> elements = map.elements;
		
		for (int y = 0; y < sizeHeight; y++) {
			for (int x = 0; x < sizeWidth; x++) {
				Element cur = elements.get(map.getIndex(x,y));
				
				//System.out.print(cur.units.size());
					
				for(int i = 0; i < cur.units.size(); i++) {
					//System.out.print("test");
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
	//Для тестов
	public void createUnit(Player player,int x, int y) {
		Unit u = new Unit(player,x,y);
		/*u.player = player;
		u.x = x;
		u.y = y;
		*/
		
		units.add(u);
		System.out.println("Unit:"+player+" "+x+" "+y);
		map.elements.get(map.getIndex(x, y)).units.add(u);
		
	}
	public void createUnit(int playerId,int x, int y) {
		System.out.println("test");
		System.out.println("[Scenario.createUnit]: getPlayer = "+this.getPlayer(playerId));
		this.createUnit(this.getPlayer(playerId), x, y);
		
	}

	public void addUnit(Unit u) {
		units.add(u);
	}
	public Unit getUnit(int unitId) {
		for(int i=0;i<units.size();i++) {
			Unit u = units.get(i);
			if(u.unitId == unitId)
				return u;
		}
		return null;
	}
	
}
