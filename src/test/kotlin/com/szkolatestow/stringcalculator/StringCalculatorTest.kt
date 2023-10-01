package com.szkolatestow.stringcalculator

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StringCalculatorTest {

    @Test
    fun shouldReturnZeroWhenNoNumbersProvided() {
        val calc = StringCalculator()
        val result = calc.add("")
        assertEquals(0, result)
    }

    @Test
    fun shouldReturnTheNumberWhenOneNumberProvided() {
        val calc = StringCalculator()
        val result = calc.add("1")
        assertEquals(1, result)
    }

    @Test
    fun shouldReturnTheSumOfTwoNumbersWhenTwoNumbersProvided() {
        val calc = StringCalculator()
        val result = calc.add("1,2")
        assertEquals(3, result)
    }

    @Test
    fun shouldIgnoreSpaces() {
        val calc = StringCalculator()
        val result = calc.add("1 , 2  ")
        assertEquals(3, result)
    }
}