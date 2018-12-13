package com.militarism2.militarism2.mvc.games.entity;

import javax.persistence.*;

import lombok.Data;

import java.sql.Date;
import java.util.List;

/*
 * @author Dima
 * */
@Entity
@Table(name = "Games")
@Data
public class GameEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Game_Id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "user_count", nullable = false)
    private int userCount;
    
    //номер текущего хода
    @Column(name = "Round", nullable = false, unique = false)
    private short round;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Scenario_Id")
    private ScenarioEntity scenario;

    //номер текущего начало игры
    @Column(name = "Start_Time", nullable = false, unique = false)
    private Date startTime;
    
    //список зареганых пользователей в игру  	
   // @OneToMany(cascade = CascadeType.ALL,
     //       fetch = FetchType.LAZY,
       //     mappedBy = "game")
    //private Set<PlayerModel> players = new HashSet<>();
    @OneToMany(mappedBy = "game")
    private List<PlayerEntity> players;

    public GameEntity()
    {
    	
    }
    

	//gameData
	//Статус игры
    @Column(name = "Status", nullable = false, unique = false)
    private String gameStatus;
    

    //время для одного хода
    @Column(name = "Periodic", nullable = false, unique = false)
    private long turnPeriod;
    
    @Column(name = "Name", nullable = false)
    private String name;

	public int getUserCount() {
		return userCount;
	}

	public void setUserCount(int userCount) {
		this.userCount = userCount;
	}

	public short getRound() {
		return round;
	}

	public void setRound(short round) {
		this.round = round;
	}

	public ScenarioEntity getScenario() {
		return scenario;
	}

	public void setScenario(ScenarioEntity scenario) {
		this.scenario = scenario;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public List<PlayerEntity> getPlayers() {
		return players;
	}

	public void setPlayers(List<PlayerEntity> players) {
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

