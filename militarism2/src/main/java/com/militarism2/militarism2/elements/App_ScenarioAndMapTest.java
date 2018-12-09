package com.militarism2.militarism2.elements;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.militarism2.militarism2.Militarism2Application;
import com.militarism2.militarism2.scenario.Game;
import com.militarism2.militarism2.scenario.Player;
import com.militarism2.militarism2.scenario.Scenario;

@SpringBootApplication
public class App_ScenarioAndMapTest {

	public static void main(String[] args) {
		SpringApplication.run(Militarism2Application.class, args);
		
			
		Scenario sc = new Scenario();			
		Game game = new Game(sc);	
		
		
		
		Player p1 = new Player();
		p1.countryName="France";
		p1.playerId=1;		
		
		Player p2 = new Player();
		p2.countryName="Sweden";
		p2.playerId=2;

		
		Player p3 = new Player();
		p3.countryName="Ukraine";
		p3.playerId=3;
		

		game.addPlayer(p1);
		game.addPlayer(p2);
		game.addPlayer(p3);
		
		
		game.createUnit(p1, 2, 3);
		game.createUnit(p1, 2, 4);		
		game.createUnit(p2, 6, 3);
		game.createUnit(p2, 6, 4);	
				
		Debug.log("sizeHeight",game.data.map.sizeHeight);
		Debug.log("sizeWidth",game.data.map.sizeWidth);
		
		game.Print();
		
	}
	 
}
