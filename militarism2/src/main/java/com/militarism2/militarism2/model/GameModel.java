package com.militarism2.militarism2.model;

/**
 * FIXME: 1)Классы model служат для форм заполнения на фронте 
 * в твоем случае это должен быть класс GameEntity(переименуй можно просто Game) он должен быть вынесен в другой пакет например
 * com.militarism2.militarism2.mvc.games.entity (создай отдельный пакет и вынеси этот клас туда)
 * 
 * */
/**
 * @author Димоооооон
 * */
//FIXME: подобавляй автора  к своим классам!!

import javax.persistence.*;
/**
 * FIXME: 1)Классы model служат для форм заполнения на фронте 
 * в твоем случае это должен быть класс GameEntity(переименуй можно просто Game) он должен быть вынесен в другой пакет например
 * com.militarism2.militarism2.mvc.games.entity (создай отдельный пакет и вынеси этот клас туда)
 * 
 * */
/**
 * @author Димоооооон
 * */
//FIXME: подобавляй автора  к своим классам!!


/*
 * Представление игр в бд
 * */

@Entity
@Table(name = "Games")
public class GameModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Game_Id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "maximum_user", nullable = false, unique = false)
    private int maxUsers; //FIXME: 3) это поле не должно тут находиться, удоли

    @Column(name = "user_count", nullable = false)
    private int userCount;
    
    //номер текущего хода
    @Column(name = "Round", nullable = false, unique = false)
    private short round;
    

    //gameData
    
    //Статус игры
    @Column(name = "Status", nullable = false, unique = false)
    private String gameStatus;
    

    //время для одного хода
    @Column(name = "Periodic", nullable = false, unique = false)
    private long turnPeriod;
    
    @Column(name = "Name", nullable = false)
    private String name;
    
    /**FIXME: 4) тут должно быть  поле Scenario - оно будет связывать игру со сценарием 
    * в которо будут храниться количество стран-участников (это и будет maxUser)и класс GameMap в котором и будет карта.
    * связ класса Game и класса Scenario можешь сделать один к одному одна игра имеет один сценарий
    */
    

}
