package com.militarism2.militarism2.game.unity;

import com.militarism2.militarism2.game.unity.types.Production;
import com.militarism2.militarism2.game.unity.types.Resources;

/*
*@класс Product описывает тип и количество 
*@произведенного ресурса 
*/
public class Product {
	// тип произведенного ресурса
	private Resources resources;
	// количество ресурса
	private int quantity;

	public Product(Production production, int quantity) {
		this.quantity = quantity;
		switch (production) {
		case FARM:
			resources = Resources.FOOD;
			break;
		case FACTORY:
			resources = Resources.AMMUNITION;
			break;
		case WORKER:
			resources = Resources.MONEY;
			break;

		}

	}

	public Resources getResources() {
		return resources;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "{resources:" + resources + "," + "quantity:" + quantity + "}";
	}
}
