package com.militarism2.militarism2.game.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.militarism2.militarism2.game.unity.Citizen;
/**
 * 
 * @author interzone
 * Утилиты по обще игровой логике
 *
 */
public class CitizenUtil {
	/**
	 * 
	 * @param personal принимает List<Citizen> и удаляет  погибших
	 * @return int - количество выживших  
	 */
	public static int recount(List<Citizen> personal) {
		Iterator<Citizen> iter = personal.iterator();
		while ( iter.hasNext()) {
			if (!iter.next().isAlive()) {
				iter.remove();
			}
		}
		return personal.size();
	}
	
	public static List<Citizen> createCitizen(int count) {
		List<Citizen> list = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			list.add(new Citizen("Germany"));
		}
		return list;
	}
}
