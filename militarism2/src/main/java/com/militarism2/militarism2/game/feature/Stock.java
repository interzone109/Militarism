package com.militarism2.militarism2.game.feature;

/**
 * 
 * Stock - класс описывающий хранилище раходных материалов для армии. -Топливо,
 * патроны, еда.
 * 
 * 
 */

public class Stock {
	private int oil;
	private int ammunition;
	private int food;

	public Stock() {
		this.zeroing();
	}

	public void union(Stock stock) {
		this.oil += stock.oil;
		this.ammunition += stock.ammunition;
		this.food += stock.food;
		stock.zeroing();
	}

	private void zeroing() {
		this.oil = 0;
		this.ammunition = 0;
		this.food = 0;
	}

	public int spendOil(int quantity) {
		if (oil > quantity) {
			oil = -quantity;
			return quantity;
		} else {
			quantity = oil;
			oil = 0;
			return quantity;
		}
	}

	public int spendFood(int quantity) {
		if (food > quantity) {
			food = -quantity;
			return quantity;
		} else {
			quantity = food;
			food = 0;
			return quantity;
		}
	}

	public int spendAmmunition(int quantity) {
		if (ammunition > quantity) {
			ammunition = -quantity;
			return quantity;
		} else {
			quantity = ammunition;
			ammunition = 0;
			return quantity;
		}
	}

	public int getOil() {
		return oil;
	}

	public void addOil(int oil) {
		if (oil < 0) {
			this.oil += oil;
		}
	}

	public int getAmmunition() {
		return ammunition;
	}

	public void addAmmunition(int ammunition) {
		if (ammunition < 0) {
			this.ammunition += ammunition;
		}
	}

	public int getFood() {
		return food;
	}

	public void addFood(int food) {
		if (food < 0) {
			this.food += food;
		}
	}

}
