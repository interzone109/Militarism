package com.militarism2.militarism2.validators;

import org.apache.commons.validator.routines.EmailValidator;
import com.militarism2.militarism2.services.userservice.UserServiceImpl;
import com.militarism2.militarism2.dto.UserCreateForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
 
/**
 * Валидация данных при регистрации пользователей*/
@Component
public class AppUserValidator implements Validator {
 
    // common-validator library.
    private EmailValidator emailValidator = EmailValidator.getInstance();
 
    @Autowired
    private UserServiceImpl userService;
 
    // The classes are supported by this validator.
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz == UserCreateForm.class;
    }
 
    @Override
    public void validate(Object target, Errors errors) {
    	UserCreateForm appUserForm = (UserCreateForm) target;
 
        // Check the fields of AppUserForm.
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "NotEmpty.appUserForm.name");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty.appUserForm.email");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty.appUserForm.password");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passwordRepeated", "NotEmpty.appUserForm.passwordRepeated");
 
        if (!this.emailValidator.isValid(appUserForm.getEmail())) {
            // Invalid email.
            errors.rejectValue("email", "Pattern.appUserForm.email");
        } 
        if (userService.getUserByEmail(appUserForm.getEmail()).isPresent()) {
        	errors.rejectValue("email", "Duplicate.appUserForm.email");
        }
 
        if (userService.getUserByName(appUserForm.getName()).isPresent()) {
        	errors.rejectValue("name", "Duplicate.appUserForm.name");
        }
        
        System.out.println(appUserForm.getPassword());
        System.out.println(appUserForm.getPassword().matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$"));
        if(!appUserForm.getPassword().matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$"))
        {
        	errors.rejectValue("password", "Match.appUserForm.password");
        }
 
        if (!appUserForm.getPasswordRepeated().equals(appUserForm.getPassword())) {
            errors.rejectValue("passwordRepeated", "Match.appUserForm.passwordRepeated");
        }
    }
 
}