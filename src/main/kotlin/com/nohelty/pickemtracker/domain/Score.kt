package com.nohelty.pickemtracker.domain

/**
 * Created by Matt.Nohelty on 9/24/2017
 */
data class Score(
        val game:Game?,
        val homeScore:Int?,
        val awayScore:Int?) {

    //TODO is this necessary
    constructor() : this(null, null, null)
}