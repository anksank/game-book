package org.ankit.project.gamebook.service;

import org.ankit.project.gamebook.dtos.PlayerDto;
import org.ankit.project.gamebook.entity.Player;
import org.ankit.project.gamebook.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getAll() {
        List<Player> players = playerRepository.findAll();
        return players;
    }
}
