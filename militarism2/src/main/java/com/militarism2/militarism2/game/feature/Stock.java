package com.militarism2.militarism2.game.feature;

import lombok.Data;

/**
 * 
 * Stock - класс описывающий хранилище раходных материалов для армии: топливо,
 * патроны, еда.
 * 
 * 
 */
@Data
public class Stock {
	private int oil;
	private int ammunition;
	private int food;

	public Stock() {
		oil = 0;
		ammunition = 0;
		food = 0;
	}

	public Stock clone() {
		return new Stock();
	}

	@Override
	public String toString() {
		return "food:" + food + " ammunition:" + ammunition + " oil:" + oil + "\n";
	}
}
