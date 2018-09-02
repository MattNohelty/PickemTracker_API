package com.nohelty.pickemtracker.websocket

import com.nohelty.pickemtracker.domain.Game
import com.nohelty.pickemtracker.domain.Score
import com.nohelty.pickemtracker.repository.GameRepository
import org.springframework.messaging.simp.SimpMessagingTemplate
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

const val updateIntervalSeconds:Long = 10

@Component
class ScheduledUpdatesOnTopic(
        val messagingTemplate: SimpMessagingTemplate,
        val gameRepository:GameRepository) {

    @Scheduled(fixedDelay = updateIntervalSeconds * 1000)
    fun publishScoreUpdates() {

        //TODO only publish updates during game time

        val games:List<Game> = gameRepository.getGamesForWeek(2017, 1) //TODO

        val scores:MutableList<Score> = mutableListOf<Score>()
        games.forEach{g -> scores.add(Score(g, (Math.random() * 50).toInt(), (Math.random() * 30).toInt()))}

        messagingTemplate.convertAndSend("/topic/scores", scores);
    }
}