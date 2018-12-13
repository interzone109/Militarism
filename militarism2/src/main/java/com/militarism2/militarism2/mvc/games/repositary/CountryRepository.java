package com.militarism2.militarism2.mvc.games.repositary;


import org.springframework.data.jpa.repository.JpaRepository;

import com.militarism2.militarism2.mvc.games.entity.CountryEntity;


/*
 * @author Dima
 * */
public interface CountryRepository extends JpaRepository<CountryEntity, Long> {

	CountryEntity findOneByName(String name);

}
