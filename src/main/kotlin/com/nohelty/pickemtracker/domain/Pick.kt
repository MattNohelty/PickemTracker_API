package com.nohelty.pickemtracker.domain

import com.nohelty.pickemtracker.enum.OverUnderPickOption
import com.nohelty.pickemtracker.enum.SpreadPickOption

/**
 * Created by Matt.Nohelty on 9/24/2017
 */
data class Pick(
            val id:Int?,
            val gameId:Int,
            val spreadPickOption:SpreadPickOption,
            val spreadPickPoints:Int,
            val overUnderPickOption: OverUnderPickOption) {
}