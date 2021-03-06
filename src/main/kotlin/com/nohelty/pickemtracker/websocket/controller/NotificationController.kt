package com.nohelty.pickemtracker.websocket.controller

import org.springframework.messaging.simp.SimpMessagingTemplate
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod


@Controller
class NotificationController(
        val messagingTemplate: SimpMessagingTemplate) {

    @RequestMapping(value = "/test-notification", method = arrayOf(RequestMethod.GET))
    fun testNotification() {
        System.out.print("TEST")
        this.messagingTemplate.convertAndSend("/topic/notify", "Test Notification")
    }

}