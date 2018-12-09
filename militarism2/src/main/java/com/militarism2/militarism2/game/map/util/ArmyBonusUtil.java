package com.militarism2.militarism2.game.map.util;

import com.militarism2.militarism2.game.map.MapPoint;
import com.militarism2.militarism2.game.unit.army.Army;
import com.militarism2.militarism2.game.unit.type.ArmyType;

public class ArmyBonusUtil {
	/**
	 * Метод для расчета бонусов, принимает два параметра:
	 * @param army - войско на которое будет применяться бонус;
	 * @param mapPoint - точка в которой находиться войско;
	 * Из поля mapPoint берутся данные о типе клетки, далее в зависимостиот типа клетки и типа войск 
	 * делаеться пересчет свойств army .
	 * 
	 * */
	public static void recalculateProperties(Army army, MapPoint mapPoint) {
		switch (mapPoint.getTerrain()) {
		case FIELD:
			
			break;
		case BOG:
			if(army.getArmyType() != ArmyType.AIRPLANE ) {
			int speed = army.getPosition().getSpeed();
			speed *= 0.6f ;
			army.getPosition().setSpeed(speed);
			}
			break;
		case FOREST:

			break;
		case MOUNTAINS:

			break;
		case SEA:

			break;
		case ROAD:

			break;
		case RIVER:

			break;
		default:
			break;
		}
	}

}
