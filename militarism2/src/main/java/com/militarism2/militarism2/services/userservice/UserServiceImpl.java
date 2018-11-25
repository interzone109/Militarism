package com.militarism2.militarism2.services.userservice;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.militarism2.militarism2.dto.UserCreateForm;
import com.militarism2.militarism2.model.User;
import com.militarism2.militarism2.repozitory.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> getUserById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        return userRepository.findOneByEmail(email);
    }
    
    @Override
    public Optional<User> getUserByName(String name) {
        return userRepository.findOneByName(name);
    }

    @Override
    public Collection<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User create(UserCreateForm form) {
        User user = new User();
        user.setName(form.getName());
        user.setEmail(form.getEmail());
        // шифрование пароля
        user.setPasswordHash(new BCryptPasswordEncoder().encode(form.getPassword()));
        return userRepository.save(user);
    }
}