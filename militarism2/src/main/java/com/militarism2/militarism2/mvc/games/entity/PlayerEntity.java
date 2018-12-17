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

import lombok.Data;





/**
 * 
 *Модель представления стран конфликта за которые играет 
 *пользователь, нужен для модели GameModel.
 *
 * @author Dima
 * 
 * */


@Entity
@Table(name = "Players_in_Game")
@Data
public class PlayerEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Players_Id", nullable = false, updatable = false)
    private Long id;
	
	//удалить из бд эту строчку 
	//@Column(name = "Color", nullable = false, unique = false)
	//String color;

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
    private GameEntity game;
    
    public   PlayerEntity() {
		// TODO Auto-generated constructor stub
		
	}
    
    
    public String getName() {
		return name;
	}
    //public void setColor(String Color) {
		//this.color = Color;
	//}
    
	public void setName(String name) {
		this.name = name;
	}

	public boolean isRoundStatus() {
		return roundStatus;
	}

	public void setRoundStatus(boolean roundStatus) {
		this.roundStatus = roundStatus;
	}

	public String getCountryStatus() {
		return countryStatus;
	}

	public void setCountryStatus(String countryStatus) {
		this.countryStatus = countryStatus;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public GameEntity getGame() {
		return game;
	}

	public void setGame(GameEntity game) {
		this.game = game;
	}

	public Long getId() {
		return id;
	}

	
    
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "Game_Id", nullable = false)
    //private GameModel game;
}
