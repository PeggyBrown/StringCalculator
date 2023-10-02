package com.szkolatestow.stringcalculator

import org.amshove.kluent.`should be equal to`
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class StringCalculatorTest {

    private val calc: StringCalculator = StringCalculator()

    @Test
    fun shouldReturnZeroWhenNoNumbersProvidedInAddition() {
        val result = calc.add("")
        assertEquals(0, result)
    }

    @Test
    fun shouldReturnTheNumberWhenOneNumberProvided() {
        val result = calc.add("1")
        assertEquals(1, result)
    }

    @Test
    fun shouldReturnTheSumOfTwoNumbersWhenTwoNumbersProvided() {
        //given
        val calc = StringCalculator()
        //when
        val result = calc.add("1,2")
        //then
        assertEquals(3, result)
    }

    @Test
    fun shouldIgnoreSpaces() {
        val result = calc.add("1 , 2  ")
        result `should be equal to` 3
    }

    @Test
    fun shouldNotAcceptNonNumericCharacters() {
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