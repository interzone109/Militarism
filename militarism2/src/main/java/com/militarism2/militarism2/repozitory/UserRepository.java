package com.militarism2.militarism2.repozitory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.militarism2.militarism2.model.User;

/**
 * Репозиторий для взаимодействием с таблицей пользователей
 * 
 */
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findOneByEmail(String email);
	Optional<User> findOneByName(String name);
	Optional<User> findByActivationCode(String code);
	
}
