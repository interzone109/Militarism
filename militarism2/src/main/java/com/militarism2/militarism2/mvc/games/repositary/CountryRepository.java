package com.militarism2.militarism2.mvc.games.repositary;


import org.springframework.data.jpa.repository.JpaRepository;

import com.militarism2.militarism2.mvc.games.entity.CountryModel;

public interface CountryRepository extends JpaRepository<CountryModel, Long> {

	CountryModel findOneByName(String name);

}
