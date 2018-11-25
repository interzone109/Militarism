package com.militarism2.militarism2.game.build;

import java.util.Iterator;
import java.util.List;

import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unity.Citizen;
import com.militarism2.militarism2.game.unity.Construction;
import com.militarism2.militarism2.game.unity.Product;
import com.militarism2.militarism2.game.unity.able.Workable;
import com.militarism2.militarism2.game.unity.types.Production;

public class Factory extends Construction implements Workable {
	private final int NORM = 5;
	private Production production;

	public Factory(Point location, List<Citizen> personal, Production production) {
		super(location, personal);
		this.production = production;
	}

	@Override
	public Product getWork() {
		return new Product(production, recount() * NORM);
	}

	@Override
	public Product getWorkOverTime() {
		int damage = 2;
		for (Citizen citizen : getPersonal()) {
			citizen.takeDamage(damage);
		}
		return new Product(production, recount() * NORM * damage);
	}

	public int recount() {
		Iterator<Citizen> iter = getPersonal().iterator();
		while ( iter.hasNext()) {
			if (!iter.next().isAlive()) {
				iter.remove();
			}
		}
		return getPersonal().size();
	}

}
