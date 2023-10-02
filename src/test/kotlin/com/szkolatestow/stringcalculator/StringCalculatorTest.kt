package com.szkolatestow.stringcalculator

import org.amshove.kluent.`should be equal to`
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class StringCalculatorTest {

    @Test
    fun shouldReturnZeroWhenNoNumbersProvidedInAddition() {
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
        result `should be equal to` 3
    }

    @Test
    fun shouldNotAcceptNonNumericCharacters() {
        val calc = StringCalculator()
        assertThrows<IllegalCharacterException>{
            calc.add("1 ,(")
        }
    }

    @Test
    fun shouldReturnZeroWhenNoNumbersProvidedInSubtraction() {
        val calc = StringCalculator()
        val result = calc.subtract("")
        assertEquals(0, result)

    }
}