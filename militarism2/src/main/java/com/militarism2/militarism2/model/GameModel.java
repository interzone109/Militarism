package com.militarism2.militarism2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
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
@Entity
@Table(name = "GamesList")//FIXME: 2)название таблицы из двух слов пишется через нижнее подчеркивание 
// в твоем счлучает это должно быть  games
public class GameModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "maximum_user", nullable = false, unique = false)
    private int maxUsers; //FIXME: 3) это поле не должно тут находиться, удоли

    @Column(name = "user_count", nullable = false)
    private int userCount;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    /**FIXME: 4) тут должно быть  поле Scenario - оно будет связывать игру со сценарием 
    * в которо будут храниться количество стран-участников (это и будет maxUser)и класс GameMap в котором и будет карта.
    * связ класса Game и класса Scenario можешь сделать один к одному одна игра имеет один сценарий
    */
    
}
