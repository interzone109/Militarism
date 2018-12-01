package com.militarism2.militarism2.game.unit.service;

import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unit.army.Infantry;
import com.militarism2.militarism2.game.unit.army.template.Template;
import com.militarism2.militarism2.game.unit.build.Factory;
import com.militarism2.militarism2.game.unit.entity.ArmyEntity;
import com.militarism2.militarism2.game.unit.feature.*;

public class ArmyEntityService {
	private ArmyEntity armyEntity;

	public static void main(String[] args) {
		
		Template template = new Template(new Formation(4,1,10,1),
				 new ArmyData("squad", "Germany"),
				 new Damage(30, 30, 2),
				 new Position(new Point(1, 1), 30, 100), 
				 new Stock(), 30);
		
		Infantry infantry = new Infantry(template);
		infantry.move(new Point(2,2));
		infantry.getFormation().setQuantityStuff(30);
		
		
		
	}
}
