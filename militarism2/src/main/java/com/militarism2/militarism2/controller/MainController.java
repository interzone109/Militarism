package com.militarism2.militarism2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Контроллер для главной страници
 */
@Controller
public class MainController {

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String index(Model model, HttpServletRequest request) {
		String referer = request.getHeader("Referer");
		
		if (referer == null || referer.contains("lang") || referer.equals("http://localhost:8080/")) {
			return "index";
		}

		return "redirect:" + referer;

	}

	@RequestMapping(value = { "/index" }, method = RequestMethod.GET)
	public String index(Model model) {
		return "index";
	}

}
