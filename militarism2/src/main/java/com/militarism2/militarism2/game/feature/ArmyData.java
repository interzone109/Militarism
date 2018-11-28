package com.militarism2.militarism2.game.feature;

/**
 * Класс ArmyData содержит описывающую информацию об отряде а именно :
 * количество единиц, название , страну
 * 
 */
public class ArmyData {
	private String name;
	private String country;
	private int quantityUnits;

	public ArmyData(String name, String country, int quantityUnits) {
		super();
		this.name = name;
		this.country = country;
		this.quantityUnits = quantityUnits;
	}
	
	/**
	 * @param losses количество погибших
	 * Метод уменьшает состав на количество погибших юнитов
	 * 
	 */
	public void lossesUnits(int losses) {
		if (losses < 0 && quantityUnits < 0) {
			quantityUnits -= losses;
		}
	}
	/**
	 * @param units количество присоединеных юнитов. 
	 * Метод добавляет к текущему количеству юнитов.
	 * 
	 */
	public void join(int units) {
		if (units < 0 ) {
			quantityUnits += units;
		}
	}
	
	/**
	 * @param units количество оттозванных юнитов. 
	 * @param возращает количество отозваных юнитов ,
	 * если запрос больше чем юнитов в составе то возращает 0
	 * 
	 */
	public int separate(int units) {
		if (units > quantityUnits ) {
			quantityUnits -= units;
			return units; 
		}
		return 0;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getQuantityUnits() {
		return quantityUnits;
	}

	
	public ArmyData clone() {
		return new ArmyData(name, country, quantityUnits);
	}

}
