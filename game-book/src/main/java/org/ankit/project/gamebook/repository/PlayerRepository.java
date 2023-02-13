package org.ankit.project.gamebook.repository;

import org.ankit.project.gamebook.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
