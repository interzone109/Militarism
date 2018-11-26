package com.militarism2.militarism2.game.build;

import java.util.List;

import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unity.Citizen;
import com.militarism2.militarism2.game.unity.Construction;
import com.militarism2.militarism2.game.unity.Product;
import com.militarism2.militarism2.game.unity.able.Workable;
import com.militarism2.militarism2.game.unity.types.Production;
import com.militarism2.militarism2.game.util.CitizenUtil;
/**
 * 
 * @author interzone
 * Класс унаследованный от Construction 
 * и реализующий интерфейс Workable.
 * Используеться для создания фабрик по изготовлению ресурсов
 * 
 *
 */
public class ResourceFactory extends Construction implements Workable {
	private final int NORM = 5;
	private Production production;
	private int overTimeWorkDamage = 2;

	public ResourceFactory(Point location, List<Citizen> personal, Production production) {
		super(location, personal);
		this.production = production;
	}

	@Override
	public Product getWork() {
		return new Product(production, CitizenUtil.recount(getPersonal()) * NORM);
	}

	@Override
	public Product getWorkOverTime() {
		for (Citizen citizen : getPersonal()) {
			citizen.suffer(overTimeWorkDamage);
		}
		return new Product(production, CitizenUtil.recount(getPersonal()) * NORM * overTimeWorkDamage);
	}

	

}
