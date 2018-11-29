package com.militarism2.militarism2.elements;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.militarism2.militarism2.Militarism2Application;
import com.militarism2.militarism2.scenario.Player;
import com.militarism2.militarism2.scenario.Scenario;

@SpringBootApplication
public class App_ScenarioAndMapTest {

	public static void main(String[] args) {
		SpringApplication.run(Militarism2Application.class, args);
		
		System.out.println("/////////////Scenario test//////////////////// ");
		Scenario sc = new Scenario();
		
		Player p1 = new Player();
		p1.countryName="France";
		p1.playerId=1;
		sc.players.add(p1);
		
		
		Player p2 = new Player();
		p2.countryName="Sweden";
		p2.playerId=2;
		sc.players.add(p2);
		
		Player p3 = new Player();
		p3.countryName="Ukraine";
		p3.playerId=3;
		sc.players.add(p3);

		/*Unit u = new Unit();
		u.x = 5; u.y = 4;
		u.player = p1;
		sc.addUnit(u);
		*/
		
		
		sc.createUnit(1, 2, 2);
		sc.createUnit(1, 2, 3);
		
		sc.createUnit(1, 3, 2);
		sc.createUnit(1, 3, 3);
		
		
		sc.createUnit(p2, 15, 2);
		sc.createUnit(p2, 15, 3);
		
		sc.createUnit(p3, 7, 13);
		sc.createUnit(p3, 8, 12);
		
		//System.out.println(sc.getUnit(1));
		//System.out.println(sc.getUnit(2));

		
		sc.Print();


		
		
		
		
		
	}
}
