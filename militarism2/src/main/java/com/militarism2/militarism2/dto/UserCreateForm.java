package com.militarism2.militarism2.dto;

import lombok.Data;

/**
 * Моделька для регистрации для передачи во вью*/
@Data
public class UserCreateForm {

    private String email = "";


    private String password = "";


    private String passwordRepeated = "";
    
 
    private String name = "";

}
