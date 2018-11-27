package com.militarism2.militarism2.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.militarism2.militarism2.dto.UserCreateForm;
import com.militarism2.militarism2.model.User;
import com.militarism2.militarism2.services.userservice.UserServiceImpl;
import com.militarism2.militarism2.validators.AppUserValidator;

/**
 * Контроллер для регистрации*/
@Controller
public class RegisterController {		
			
		@Autowired
	   private UserServiceImpl userServiceImpl;
	
		@Autowired
	   private AppUserValidator appUserValidator;
	 
	   // Set a form validator
	   @InitBinder
	   protected void initBinder(WebDataBinder dataBinder) {
	      // Form target
	      Object target = dataBinder.getTarget();
	      if (target == null) {
	         return;
	      }
	      System.out.println("Target=" + target);
	 
	      if (target.getClass() == UserCreateForm.class) {
	         dataBinder.setValidator(appUserValidator);
	      }
	      // ...
	   }
	   
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	   public String viewRegister(Model model) {
	 
		UserCreateForm form = new UserCreateForm();
	 
	      model.addAttribute("appUserForm", form);
	 
	      return "register";
	   }
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	   public String saveRegister(Model model, //
	         @ModelAttribute("appUserForm") @Validated UserCreateForm appUserForm, //
	         BindingResult result, //
	         final RedirectAttributes redirectAttribut, HttpServletRequest request) {
	 
	      // Validate result
	      if (result.hasErrors()) {
	         return "register";
	      }
	      User newUser= null;
	      try {
	         newUser = userServiceImpl.create(appUserForm);
	      }
	      // Other error!!
	      catch (Exception e) {
	         model.addAttribute("errorMessage", "Error: " + e.getMessage());
	         return "register";	           
	      }
	      model.addAttribute("flashUser", newUser);
	    //redirectAttributes.addFlashAttribute("flashUser", newUser);
	      userServiceImpl.sendEmailConfirm(request.getServerName()+":"+request.getServerPort(), newUser);
	        
	      return "registerSuccess";
	      }
		
	@RequestMapping(value = "/sendEmailConfirm", method = RequestMethod.GET)
	public String sendMessage(Model model, HttpServletRequest request) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		Optional<User> isUser=userServiceImpl.getUserByName(currentPrincipalName);
		if(!isUser.isPresent())
		{
			System.out.println("A confirmation letter not sent to your email!");
            model.addAttribute("message", "A confirmation letter not sent to your email!");
		}
		else
		{
			User user=isUser.get();
			userServiceImpl.sendEmailConfirm(request.getServerName()+":"+request.getServerPort(), user);
			System.out.println("A confirmation letter sent to your email!");
            model.addAttribute("message", "A confirmation letter sent to your email!");
		}
		
		return "emailConfirmAuthorization";
	}
	
	@RequestMapping(value ="/activate/{code}", method = RequestMethod.GET)
    public String activate(Model model, @PathVariable String code) {
        boolean isActivated = userServiceImpl.activateUser(code);

        if (isActivated) {
        	System.out.println("User successfully activated");
            model.addAttribute("message", "User successfully activated");
        } else {
        	System.out.println("Activation code is not found!");
            model.addAttribute("message", "Activation code is not found!");
        }

        
        return "emailConfirm";
    }
	
	
}