package com.nohelty.pickemtracker.domain

import com.nohelty.pickemtracker.enum.Team

/**
 * Created by Matt.Nohelty on 9/24/2017
 */
data class Game(
        val id: Int,
        val homeTeam: Team,
        val awayTeam: Team,
        val overUnder: Double,
        val spread: Double) {
}