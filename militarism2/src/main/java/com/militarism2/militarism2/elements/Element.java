package com.militarism2.militarism2.elements;

import java.util.ArrayList;
import java.util.List;

public abstract class Element implements IFlyableElement {	
	//public static String imageName;	
	Map map;
	
	int x;
	int y;
	
	//Юниты на текущей клетке
	//Альтернатива - каждый раз перебирать массив всех юнитов в другом классе
	public List<Unit> units = new ArrayList<Unit>();
	//public City city;//Относится к городу или нет если Null
	
	
	public Element() {
		setPosition(0,0);
		
		Init();
	}
	public Element(int x,int y) {
		setPosition(x,y);
		
		Init();
	}
	public Element(Map map,int x,int y) {
		setPosition(x,y);		
		this.map = map;
		
		Init();
	}
	
	//Переносит данные
	public Element(Element newElement) {
		this.setPosition(newElement.x,newElement.y);
		this.units = newElement.units;		
	}
	
	void Init() {
		List<Unit> units = new ArrayList<Unit>();
	}
	
	public void setPosition(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public List<Element> getNeighbours(){
		return map.getNeighbours(this);
	}
	
	

}
