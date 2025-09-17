package com.example.gamesStore.controllers;

import com.example.gamesStore.models.Games;
import com.example.gamesStore.repositories.GamesRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GamesController {

    private final GamesRepository repo;

    public GamesController(GamesRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Games> getAllGames() {
        return repo.findAll();
    }

    @PostMapping
    public Games createGame(@RequestBody Games game) {
        return repo.save(game);
    }
}
