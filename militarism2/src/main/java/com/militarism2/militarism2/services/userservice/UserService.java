package com.militarism2.militarism2.services.userservice;

import java.util.Collection;
import java.util.Optional;

import com.militarism2.militarism2.dto.UserCreateForm;
import com.militarism2.militarism2.model.User;

/**
 * Интерфейс для сервиса управления репозиторием который представляет пользователя в бд*/
public interface UserService {
    Optional<User> getUserById(long id);

    Optional<User> getUserByEmail(String email);
    
    Optional<User> getUserByName(String name);

    Collection<User> getAllUsers();

    User create(UserCreateForm form);
    
    void sendEmailConfirm(String contextPath, User user);
    
    boolean activateUser(String code);
}