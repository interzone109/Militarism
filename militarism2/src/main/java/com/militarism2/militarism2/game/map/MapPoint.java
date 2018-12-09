package com.militarism2.militarism2.game.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.militarism2.militarism2.game.unit.type.Direction;
import com.militarism2.militarism2.game.unit.type.Terrain;

import lombok.Data;

@Entity
@Table(name = "map_points")
@Data
public class MapPoint {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "map_point_Id", nullable = false, updatable = false, unique = true)
	private Long id;
	@Column(name = "offset_X")
	private int offsetX;
	@Column(name = "offset_Y")
	private int offsetY;

	Terrain terrain;
	Direction direction;
	
	public MapPoint(int offsetX, int offsetY, Terrain terrain, Direction direction) {
		this.offsetX = offsetX;
		this.offsetY = offsetY;
		this.terrain = terrain;
		this.direction = direction;
	}
	
	public String toString() {
		return"x-"+offsetX+" y-"+offsetY+" terrain-"+terrain+"  direction-"+direction;
	}
}
