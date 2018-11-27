package com.militarism2.militarism2.game.feature;

public class Coffers extends Stock {
	private int money;

	public void addMoney(int quantity) {
		money = +quantity;
	}

	public void spend(int quantity) {
		money -= quantity;
	}

	public int getMoney() {
		return money;
	}
}
