package com.militarism2.militarism2.model;

import javax.persistence.*;

import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Представление игр в бд
 * 
 * */

@Entity
@Table(name = "Games")
public class GameModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Game_Id", nullable = false, updatable = false)
    private Long id;
    
    //номер текущего хода
    @Column(name = "Round", nullable = false, unique = false)
    private short round;
    
    //номер текущего начало игры
    @Column(name = "Start_Time", nullable = false, unique = false)
    private Date startTime;
    
    //список зареганых пользователей в игру  	
   // @OneToMany(cascade = CascadeType.ALL,
     //       fetch = FetchType.LAZY,
       //     mappedBy = "game")
    //private Set<PlayerModel> players = new HashSet<>();
    @OneToMany(mappedBy = "game")
    private List<PlayerModel> players;
    
    //gameData
	//Статус игры
    @Column(name = "Status", nullable = false, unique = false)
    private String gameStatus;
    

    //время для одного хода
    @Column(name = "Periodic", nullable = false, unique = false)
    private long turnPeriod;
    
    @Column(name = "Name", nullable = false)
    private String name;
    
    public Date getStartTime() {
		return startTime;
	}
    
    public void setStartDate(Date startTime) {
		this.startTime=startTime;
	}
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public short getRound() {
		return round;
	}

	public void setRound(short round) {
		this.round = round;
	}

	public List<PlayerModel> getPlayers() {
		return players;
	}

	public void setPlayers(List<PlayerModel> players) {
		this.players = players;
	}

	public String getGameStatus() {
		return gameStatus;
	}

	public void setGameStatus(String gameStatus) {
		this.gameStatus = gameStatus;
	}

	public long getTurnPeriod() {
		return turnPeriod;
	}

	public void setTurnPeriod(long turnPeriod) {
		this.turnPeriod = turnPeriod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


        

}
