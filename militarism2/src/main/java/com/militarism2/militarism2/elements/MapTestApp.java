package com.militarism2.militarism2.elements;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.militarism2.militarism2.Militarism2Application;

@SpringBootApplication
public class MapTestApp {

	public static void main(String[] args) {
		SpringApplication.run(Militarism2Application.class, args);
		
		Map map = new Map();
		//System.out.println("Map: ");
		map.Print();
		
		
	}
}
