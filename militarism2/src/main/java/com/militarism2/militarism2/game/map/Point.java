package com.militarism2.militarism2.game.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "points")
@Data
public class Point {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "point_Id", nullable = false, updatable = false, unique = true)
	private Long id;
	@Column(name = "offset_X")
	private int offsetX;
	@Column(name = "offset_Y")
	private int offsetY;

	public Point(int offsetX, int offsetY) {
		this.offsetX = offsetX;
		this.offsetY = offsetY;
	}

	public Point clone() {
		return new Point(offsetX, offsetY);
	}
}
