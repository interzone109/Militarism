package com.militarism2.militarism2.game.feature;

import com.militarism2.militarism2.game.map.Point;

public class Position {
	private Point curentLocation;
	private int speed;
	private int visibility;
	private int shotRange;

	public Position(Point point, int speed, int visibility, int shotRange) {

		this.curentLocation = point;
		this.speed = speed;
		this.visibility = visibility;
		this.shotRange = shotRange;
	}

	public Position clone() {
		return new Position(curentLocation.clone(), speed, visibility, shotRange);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "speed:"+speed
			   +" visibility:"+visibility
			   +" shotRange:"+ shotRange+"\n";
	}
}
