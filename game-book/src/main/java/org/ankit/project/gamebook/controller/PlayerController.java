package org.ankit.project.gamebook.controller;

import org.ankit.project.gamebook.dtos.PlayerDto;
import org.ankit.project.gamebook.entity.Player;
import org.ankit.project.gamebook.repository.PlayerRepository;
import org.ankit.project.gamebook.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/players")
    public ResponseEntity<List<Player>> listAll() {
        return new ResponseEntity<>(playerService.getAll(), HttpStatus.OK);
    }

}
