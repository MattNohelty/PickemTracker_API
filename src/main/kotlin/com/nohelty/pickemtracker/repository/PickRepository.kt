package com.nohelty.pickemtracker.repository

import com.nohelty.pickemtracker.domain.Pick
import com.nohelty.pickemtracker.enum.OverUnderPickOption
import com.nohelty.pickemtracker.enum.SpreadPickOption
import org.springframework.stereotype.Repository

/**
 * Get all users
 */
@Repository
class PickRepository {

    fun getPicksForUserByWeek(userId:Int, leagueId:Int, year:Int, week:Int): Set<Pick> {
        val pick1 = Pick(100, 10, SpreadPickOption.away, 25, OverUnderPickOption.none)
        val pick2 = Pick(101, 11, SpreadPickOption.home, 25, OverUnderPickOption.over)
        return setOf(pick1, pick2)
    }

    fun savePicksForUserByWeek(userId:Int, leagueId:Int, year:Int, week:Int, picks:Set<Pick>): Set<Pick> {
        return picks
    }

    fun deletePicksForUserByWeek(userId:Int, leagueId:Int, year:Int, week:Int) {
        return
    }
}