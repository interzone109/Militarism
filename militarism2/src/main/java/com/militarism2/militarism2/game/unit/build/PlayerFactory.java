package com.militarism2.militarism2.game.unit.build;

import java.util.List;
import java.util.Map;
import java.util.Queue;

import com.militarism2.militarism2.game.map.Point;
import com.militarism2.militarism2.game.unit.army.template.Template;

/**
 * 
 * Класс Factory используеться для создание различных типов юнитов
 * 
 */
public class PlayerFactory {
	private String country;
	private Point location;
	private Queue<String> order;
	private List<Template> available;

	public PlayerFactory(String country, Point location, List<Template> available) {
		this.country = country;
		this.location = location;
		this.available = available;
	}

	public void creatOrder(String name, int quantity) {
		order.add(name + ":" + quantity + "-");
	}

	public String getOrder() {
		return order.poll();
	}

	public boolean isOrder() {
		return order.size() < 0;
	}
	
	
	public List<Template> showAvailable(){
		return available;
	}
	
}
