package com.militarism2.militarism2.services.userservice;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.militarism2.militarism2.dto.UserCreateForm;
import com.militarism2.militarism2.model.User;
import com.militarism2.militarism2.repozitory.UserRepository;
import com.militarism2.militarism2.services.MailSender.MailSender;

/**
 * Сервис для управления репозиторием который представляет пользователя в бд*/
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    private MailSender mailSender;
    
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
        user.setActive(false);
        user.setActivationCode(UUID.randomUUID().toString());
        user.setName(form.getName());
        user.setEmail(form.getEmail());
        // шифрование пароля
        user.setPasswordHash(new BCryptPasswordEncoder().encode(form.getPassword()));
        return userRepository.save(user);
    }

	@Override
	public void sendEmailConfirm(String contextPath, User user) {
		// TODO Auto-generated method stub
		
		String message = String.format(
                "<p>Hello, %s! \n" +
                        "Welcome to Military. Please, visit next link:</p><a>%s/activate/%s</a>",
                user.getName(),
                contextPath,
                user.getActivationCode()
        );

        mailSender.send(user.getEmail(), "Activation code", message);
	}
	
	public boolean activateUser(String code) {
		Optional<User> isUser=userRepository.findByActivationCode(code);
		if (!isUser.isPresent()) {
            return false;
        }
        User user = isUser.get();

        

        user.setActivationCode(null);
        user.setActive(true);
        
        userRepository.save(user);

        return true;
    }
}