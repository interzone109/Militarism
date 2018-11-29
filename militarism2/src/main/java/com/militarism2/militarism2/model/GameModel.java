package com.militarism2.militarism2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/*
 * тестовая @Entity таблица для игр
 * */

@Entity
@Table(name = "Games")
public class GameModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "maximum_user", nullable = false, unique = false)
    private int maxUsers;
    
    
    @Column(name = "Round", nullable = false, unique = false)
    private short round;
    
    //список стран id name userid
    
    //gameData
    
    @Column(name = "status", nullable = false, unique = false)
    private String gameStatus;
    

    @Column(name = "periodic", nullable = false, unique = false)
    private long turnPeriod;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
    @JoinTable(name = "registered_users_in_game",
            joinColumns = { @JoinColumn(name = "game_id") },
            inverseJoinColumns = { @JoinColumn(name = "user_id") })
    private Set<User> tags = new HashSet<>();

    

}
