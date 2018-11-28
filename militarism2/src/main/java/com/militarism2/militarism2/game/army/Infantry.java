package com.militarism2.militarism2.game.army;

import com.militarism2.militarism2.game.army.template.Template;
import com.militarism2.militarism2.game.feature.ArmyData;
import com.militarism2.militarism2.game.feature.Damage;
import com.militarism2.militarism2.game.feature.Position;
import com.militarism2.militarism2.game.feature.Stock;
import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unity.able.Warable;

/**
 * 
 * @author interzone реализацая боевого отряда
 */
public class Infantry implements Warable {

	private int quantityUnits;
	private int defense;
	private ArmyData info;
	private Damage damage;
	private Position position;
	private Stock stock;

	public Infantry(Template infantryTemplateSquad) {
		this.defense = infantryTemplateSquad.getDefense();
		this.info = infantryTemplateSquad.getInfo();
		this.damage = infantryTemplateSquad.getDamage();
		this.position = infantryTemplateSquad.getPosition();
		this.stock = infantryTemplateSquad.getStock();
	}

	/**
	 * @param Stock .
	 * 
	 *Метод принимает обьект класса Stock и прибавляет его значение к
	 *текущему тем самым пополняя запалы отряда
	 */
	public void supply(Stock stock) {
		this.stock.union(stock);
	}

	@Override
	public void takeDamage(int loss) {

	}

	@Override
	public int atack() {
		return 0;
	}

	@Override
	public void move(Point nextPoint) {

	}

	@Override
	public boolean isAlive() {
		return quantityUnits < 0;
	}

}
