package com.militarism2.militarism2.game.build;

import com.militarism2.militarism2.game.feature.Coffers;

public class City{
	private Coffers coffers;
	private int citizen;
	
	public void spend(int cost) {
		coffers.spend(cost);
	}

	

}
