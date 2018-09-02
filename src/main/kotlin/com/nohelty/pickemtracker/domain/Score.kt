package com.nohelty.pickemtracker.domain

data class Score(
        val game:Game?,
        val homeScore:Int?,
        val awayScore:Int?) {

    //TODO is this necessary
    constructor() : this(null, null, null)
}