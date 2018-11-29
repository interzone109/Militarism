package com.militarism2.militarism2.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.militarism2.militarism2.model.User;
import com.militarism2.militarism2.services.userservice.UserServiceImpl;

@Controller
public class UserPageController {

	@Autowired
	private UserServiceImpl userServiceImpl;

	@RequestMapping(value = "/userpage", method = RequestMethod.GET)
	public String UserPage(Model model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal.toString().equals("anonymousUser")) {
			return "redirect:/login";
		}

		// временный блок с названием игр

		ArrayList<TempTables> tableNames = new ArrayList();
		TempTables tempTable = new TempTables(1, "Игра1", 6);
		tableNames.add(tempTable);
		tempTable = new TempTables(2, "Игра2", 4);
		tableNames.add(tempTable);
		tempTable = new TempTables(3, "Игра3", 4);
		tableNames.add(tempTable);

		// временный блок с названием игр

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		Optional<User> user = userServiceImpl.getUserByName(currentPrincipalName);
		User userRegistred = user.get();
		model.addAttribute("name", userRegistred.getName());
		model.addAttribute("email", userRegistred.getEmail());
		model.addAttribute("tables", tableNames);

		return "userpage";

	}

	public class TempTables { // временный класс для демонстраци
		private int id;
		private String name;
		private int numPlayers;

		public TempTables(int id, String name, int numPlayers) {

			this.id = id;
			this.name = name;
			this.numPlayers = numPlayers;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getNumPlayers() {
			return numPlayers;
		}

		public void setNumPlayers(int numPlayers) {
			this.numPlayers = numPlayers;
		}

	}
}
