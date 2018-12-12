package com.militarism2.militarism2.mvc.games.entity;

import javax.persistence.*;

import lombok.Data;

import java.sql.Date;
import java.util.List;
/**
 * FIXME: переименуй этот класс в GameEntity
 * Имя класса CountryModel тут не подходит оконтчание модель относить к MVC 
 * в твоем случает ето энтити и класс должен называться GameEntity
 * */

@Entity
@Table(name = "Games")
@Data
public class GameModel {
	
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
    private ScenarioModel scenario;

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
    
   


    //private String name;
    
    /**FIXME: 4) тут должно быть  поле Scenario - оно будет связывать игру со сценарием 
    * в которо будут храниться количество стран-участников (это и будет maxUser)и класс GameMap в котором и будет карта.
    * связ класса Game и класса Scenario можешь сделать один к одному одна игра имеет один сценарий
    */
    


}

