package com.nohelty.pickemtracker.controller

import com.nohelty.pickemtracker.domain.Pick
import com.nohelty.pickemtracker.repository.PickRepository
import org.springframework.web.bind.annotation.*

@RestController()
@RequestMapping("/week/{year}/{week}/pick")
class PickWeekController(val pickRepository: PickRepository) {

    @GetMapping()
    fun getPicksForUserByWeek(@PathVariable year:Int, @PathVariable week:Int): Set<Pick> {
        val picks: Set<Pick>  = pickRepository.getPicksForUserByWeek(1, 1, year, week) //TODO user id
        return picks;
    }

    @PostMapping
    fun savePicksForUserByWeek(@PathVariable year:Int, @PathVariable week:Int, @RequestBody picks: Set<Pick>): Set<Pick> {

        pickRepository.savePicksForUserByWeek(1, 1, year, week, picks) //TODO user id

        val updatedPicks: Set<Pick>  = pickRepository.getPicksForUserByWeek(1, 1, year, week) //TODO user id
        return picks;
    }
}