package com.nohelty.pickemtracker.domain

import com.nohelty.pickemtracker.enum.OverUnderPickOption
import com.nohelty.pickemtracker.enum.SpreadPickOption

data class Pick(
            val id:Int?,
            val gameId:Int,
            val spreadPickOption:SpreadPickOption,
            val spreadPickPoints:Int,
            val overUnderPickOption: OverUnderPickOption) {
}