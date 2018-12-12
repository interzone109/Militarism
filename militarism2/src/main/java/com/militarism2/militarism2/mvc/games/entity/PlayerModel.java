package com.militarism2.militarism2.mvc.games.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.militarism2.militarism2.model.User;





/**
 * 
 *Модель представления стран конфликта за которые играет 
 *пользователь, нужен для модели GameModel.
 * */

@Entity
@Table(name = "Players_in_Game")
public class PlayerModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Players_Id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "Name", nullable = false, unique = false)
    private String name;
    
    @Column(name = "Round_Status", nullable = false, unique = false)
    private boolean roundStatus;
    
    @Column(name = "Player_Status", nullable = false, unique = false)
    private String countryStatus;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "User_Id", nullable = false)
    private User user;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Game_id")
    private GameModel game;
    
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "Game_Id", nullable = false)
    //private GameModel game;
}
