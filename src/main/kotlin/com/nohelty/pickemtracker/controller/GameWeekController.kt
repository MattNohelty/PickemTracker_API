package com.nohelty.pickemtracker.controller

import com.nohelty.pickemtracker.domain.Game
import com.nohelty.pickemtracker.domain.User
import com.nohelty.pickemtracker.exception.ResourceNotFoundException
import com.nohelty.pickemtracker.repository.GameRepository
import com.nohelty.pickemtracker.repository.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController()
@RequestMapping("/week/{year}/{week}/game")
class GameWeekController(val gameRepository: GameRepository) {

    @GetMapping()
    fun getAllGamesByWeek(@PathVariable year:Int, @PathVariable week:Int): List<Game> {
        val games: List<Game> = gameRepository.getGamesForWeek(year, week)
        return games
    }
}