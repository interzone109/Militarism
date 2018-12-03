package com.militarism2.militarism2.game.unit.feature;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Stock - класс описывающий хранилище раходных материалов для армии: топливо,
 * патроны, еда.
 */
@Entity
@Table(name = "stocks")
@Data
public class Stock  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stock_Id", nullable = false, updatable = false, unique = true)
	private Long id;
	
	private int gasoline;
	private int ammunition;
	private int food;

	
	public Stock(int gasoline, int ammunition, int food) {
		this.gasoline = gasoline;
		this.ammunition = ammunition;
		this.food = food;
	}
	
	
	public Stock() {
		gasoline = 0;
		ammunition = 0;
		food = 0;
	}

	public Stock clone() {
		return new Stock();
	}


	@Override
	public String toString() {
		return "food:" + food + " ammunition:" + ammunition + " gasoline:" + gasoline + "\n";
	}


}
