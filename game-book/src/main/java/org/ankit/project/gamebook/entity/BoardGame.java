package org.ankit.project.gamebook.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "board_game")
@Getter
@Setter
public class BoardGame {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private int minPlayers;

    private int maxPlayers;

    private Timestamp createTime;
}
