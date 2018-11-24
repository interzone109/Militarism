package com.militarism2.militarism2.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
        model.addAttribute("title", "Logout");
        return "logoutSucceess";
    }
    
}
