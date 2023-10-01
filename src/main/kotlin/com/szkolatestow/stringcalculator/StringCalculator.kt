package com.szkolatestow.stringcalculator

class StringCalculator {
    fun add(numbers: String) : Int {
        return when (numbers) {
            "" -> 0
            else -> sumTrimmedNumbers(numbers);
        }
    }

    private fun sumTrimmedNumbers(numbers: String) = numbers
        .split(",")
        .sumOf { Integer.parseInt(it.trim()) }

}

