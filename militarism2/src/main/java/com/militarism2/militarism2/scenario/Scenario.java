package com.militarism2.militarism2.scenario;

import java.util.ArrayList;
import java.util.List;

import com.militarism2.militarism2.elements.Debug;
import com.militarism2.militarism2.elements.Element;
import com.militarism2.militarism2.elements.Field;
import com.militarism2.militarism2.elements.Hill;
import com.militarism2.militarism2.elements.Map;
import com.militarism2.militarism2.elements.Unit;

public class Scenario {	
	
	public int scenarioId;
	public String name;
	public List<Instruction> instructions;
	public List<String> countries;
	public GameData data;
		
	public Scenario() {
		Debug.ctor("Scenario");				
		this.instructions = new ArrayList<Instruction>();
		
		this.data = new GameData();
	}	
	
	public List<Instruction> getInstructionsForItteration(int itteration){
		List<Instruction> res = new ArrayList<Instruction>();
		
		instructions.forEach((el)->{
			if(el.targetItteration == itteration)				
				res.add(el);			
			});
		
		return res;		
	}		
}
