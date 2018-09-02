package com.nohelty.pickemtracker.repository

import com.nohelty.pickemtracker.domain.Game
import com.nohelty.pickemtracker.enum.Team
import org.springframework.stereotype.Repository

@Repository
class GameRepository {

    fun getGamesForWeek(year:Int, week:Int): List<Game> {
        val game1 = Game(10, Team.packers, Team.vikings, 40.0, -3.0)
        val game2 = Game(11, Team.lions, Team.bears, 42.0, -1.0)
        val game3 = Game(12, Team.lions, Team.bears, 22.0, 7.0)
        val game4 = Game(13, Team.lions, Team.bears, 32.0, -3.0)

        return listOf(game1, game2, game3, game4)
    }

}