package com.militarism2.militarism2.game.build;

import java.util.List;

import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unity.Citizen;
import com.militarism2.militarism2.game.unity.Construction;
import com.militarism2.militarism2.game.unity.types.Subdivision;

public class MilitaryFactory extends Construction {
	private Subdivision subdivision;

	public MilitaryFactory(Point location, List<Citizen> personal, Subdivision subdivision) {
		super(location, personal);
		this.subdivision = subdivision;
	}

	public Subdivision getSubdivision() {
		return subdivision;
	}

	public void setSubdivision(Subdivision subdivision) {
		this.subdivision = subdivision;
	}

}
