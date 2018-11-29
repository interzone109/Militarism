package com.militarism2.militarism2.elements;

import java.util.ArrayList;
import java.util.List;

import com.militarism2.militarism2.scenario.Player;

enum Elements{Field,Dirt,Hill,Forest,Road,Sea,Hidden};

public class Map {
	public List<Element> elements;	
	
	//List<City> cities; // Не обязательно здесь
	
	public int sizeWidth = 25;
	public int sizeHeight = 15;

	
	public Map() {
		System.out.println("[Map.ctor]");
		elements = new ArrayList<Element>();	
		
		Init();		
	}
	
	//Генерация карты
	private void Init() {
		System.out.println("[Map.Init()]:Generating empty field.]");
		Element cur;		
		
		//Пустое поле
		for (int y = 0; y < sizeHeight; y++) {
			for (int x = 0; x < sizeWidth; x++) {
				cur = new Field();
				cur.setPosition(x, y);
				elements.add(cur);				
			}
		}		
		
		
		for(int i = 0; i< sizeWidth; i++)
		elements.set(getIndex(i, 0), new Hill());
		for(int i = 0; i< sizeWidth; i++)
			elements.set(getIndex(i, sizeHeight-1), new Hill());
		
		
		
		
		
	}
	
	//Загрузка карты из сценария
	public void Load(String script) {
		
	}
	
	//Для дистанции
	public Map getRelativeMap(Player player) {
		//Скрытые для игрока клетки заменяем на HiddenElement и возвращаем новый объект карты	
		return this;
	} 
	
	
	
	//Небезопасный
	public List<Element> getNeighbours(Element cur) {
		List<Element> res = new ArrayList<Element>();		
		
		int x=cur.x,y=cur.y;
		
		int[] ind =  {
				getIndex(x,y-1),
				getIndex(cur),
				getIndex(x,y+1)};
		
        for (int i:ind) {
        	//Добавить проверки границ
        	res.addAll(elements.subList(i - 1,i + 1));
        }
		return res;		
	}
	
	int getIndex(Element el) {		
		return getIndex(el.x,el.y);
	}
	public int getIndex(int x,int y) {		
		return y*sizeWidth + x;		
	}
	
	
	/////////////////////////////////Для проверки//////////////////////////////////////
	public void Print() {
		for (int y = 0; y < sizeHeight; y++) {
			for (int x = 0; x < sizeWidth; x++) {
				Element cur = elements.get(getIndex(x,y));				
				if(cur instanceof Field) { //.getSimpleName().compareTo(Elements.Field.toString())==0) {
					System.out.print("■■ ");	
				}					
			}
			System.out.println();			
		}				
	}
	
	
	public void Print(List<Unit> units ){
		for (int y = 0; y < sizeHeight; y++) {
			for (int x = 0; x < sizeWidth; x++) {
				Element cur = elements.get(getIndex(x,y));
				
				System.out.print(cur.units.size());
					
				for(int i = 0; i < cur.units.size(); i++) {
					//System.out.print("test");
					Unit u = cur.units.get(i);						
					System.out.print(u.getSymbol()+u.player.playerId+"123");
				}
				
				if(cur instanceof Field) { //.getSimpleName().compareTo(Elements.Field.toString())==0) {
					System.out.print("■■ ");	
				}					
			}
			System.out.println();			
		}				
	}

}
