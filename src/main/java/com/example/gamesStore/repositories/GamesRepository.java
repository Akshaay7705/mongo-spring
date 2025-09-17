package com.example.gamesStore.repositories;

import com.example.gamesStore.models.Games;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GamesRepository extends MongoRepository<Games, String> {
}
