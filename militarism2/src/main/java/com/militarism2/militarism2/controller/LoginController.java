package com.militarism2.militarism2.controller;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Контроллер для работы с авторизацией*/
@Controller
public class LoginController {
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(Model model) {
				
        return "login";
    }
	
	@RequestMapping(value = "/loginSuccess", method = RequestMethod.GET)
    public String loginSuccessPage(Model model) {
		
        return "loginSuccess";
    }
    
    @RequestMapping(value = "/logoutSuccess", method = RequestMethod.GET)
    public String logoutSuccessfulPage(Model model) {
    	//String lang = LocaleContextHolder.getLocale().getLanguage(); // проверка текущего языка
    	//System.out.println(defaultLang);
        model.addAttribute("title", "Logout");
       
//        if (controller.getCurrentLang().equals("en")) {
//        	return "logoutSucceess";
//		}
        return "logoutSucceess";
    }
    
}
