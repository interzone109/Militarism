package com.militarism2.militarism2.game.unit.army;

import java.util.Map;

import lombok.Data;

@Data
public class PlayerArmy {
	private Map<Integer, Infantry> infantry;
	private Map<Integer, Airplane> airplane;
	private Map<Integer, Artillery> artillery;
	private Map<Integer, Shipe> shipe;
	private Map<Integer, Submarine> submarine;
	private Map<Integer, Support> support;
	private Map<Integer, Tank> tank;
}
