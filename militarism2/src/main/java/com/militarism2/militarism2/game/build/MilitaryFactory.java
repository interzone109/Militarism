package com.militarism2.militarism2.game.build;

import java.util.List;

import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unity.Citizen;
import com.militarism2.militarism2.game.unity.Construction;
import com.militarism2.militarism2.game.unity.Machine;
import com.militarism2.militarism2.game.unity.able.Engineeringable;
import com.militarism2.militarism2.game.unity.types.Subdivision;

public class MilitaryFactory extends Construction implements Engineeringable{


	public MilitaryFactory(Point location, List<Citizen> personal) {
		super(location, personal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Machine buildMachine(Subdivision machineType) {
		// TODO Auto-generated method stub
		return null;
	}

}
