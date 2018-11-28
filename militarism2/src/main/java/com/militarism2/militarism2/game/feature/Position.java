package com.militarism2.militarism2.game.feature;

import com.militarism2.militarism2.game.map.Point;

/**
 * Класс Position описывает текущую позицию отряда,
 * конечную тучку , скорость передвижения, видиность. 
 * */

import lombok.Data;
@Data
public class Position {
	private Point curentLocation;
	private Point nextLocation;
	private int speed;
	private int visibility;
	

	public Position(Point point, int speed, int visibility) {
		this.curentLocation = point;
		this.nextLocation = this.curentLocation ;
		this.speed = speed;
		this.visibility = visibility;
	}
	
	

	public Position clone() {
		return new Position(curentLocation.clone(), speed, visibility);
	}
	@Override
	public String toString() {
		return "speed:"+speed
			   +" visibility:"+visibility+"\n";
	}
}
