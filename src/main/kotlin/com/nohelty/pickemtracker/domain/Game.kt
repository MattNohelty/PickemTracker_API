package com.nohelty.pickemtracker.domain

import com.nohelty.pickemtracker.enum.Team

data class Game(
        val id: Int,
        val homeTeam: Team,
        val awayTeam: Team,
        val overUnder: Double,
        val spread: Double) {
}