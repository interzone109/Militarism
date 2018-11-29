package com.militarism2.militarism2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GamesList")
public class GameModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "maximum_user", nullable = false, unique = false)
    private int maxUsers;

    @Column(name = "user_count", nullable = false)
    private int userCount;
    
    @Column(name = "name", nullable = false)
    private String name;
    

}
