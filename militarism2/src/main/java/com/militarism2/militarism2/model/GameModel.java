package com.militarism2.militarism2.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
    
    //номер текущего хода
    @Column(name = "Round", nullable = false, unique = false)
    private short round;
    
    //список стран  	
    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "game")
    private Set<CountryModel> comments = new HashSet<>();
    
    //gameData
    
    //Статус игры
    @Column(name = "Status", nullable = false, unique = false)
    private String gameStatus;
    

    //время для одного хода
    @Column(name = "Periodic", nullable = false, unique = false)
    private long turnPeriod;
    
    @Column(name = "Name", nullable = false)
    private String name;
        

}
