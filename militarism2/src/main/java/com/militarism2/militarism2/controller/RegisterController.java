package com.militarism2.militarism2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.militarism2.militarism2.dto.UserCreateForm;
import com.militarism2.militarism2.model.User;
import com.militarism2.militarism2.services.userservice.UserServiceImpl;
import com.militarism2.militarism2.validators.AppUserValidator;

/*Контроллер для регистрации*/
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
	         final RedirectAttributes redirectAttributes) {
	 
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
	 
	      redirectAttributes.addFlashAttribute("flashUser", newUser);
	       
	      return "redirect:/registerSuccess";
	   }
	
	@RequestMapping("/registerSuccess")
	   public String viewRegisterSuccessful(Model model) {
	 
	      return "registerSuccess";
	   }
}