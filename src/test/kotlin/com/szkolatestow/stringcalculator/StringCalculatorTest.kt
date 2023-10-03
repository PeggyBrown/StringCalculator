package com.szkolatestow.stringcalculator

import org.amshove.kluent.`should be equal to`
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class StringCalculatorTest {

    private val calc: StringCalculator = StringCalculator()

    @Test
    fun `should return zero when no numbers provided in addition`() {
        val result = calc.add("")
        assertEquals(0, result)
    }

    @Test
    fun `should return the number when one number provided`() {
        val result = calc.add("1")
        assertEquals(1, result)
    }

    @Test
    fun `should return the sum of two numbers when two numbers provided`() {
        //given
        val calc = StringCalculator()
        //when
        val result = calc.add("1,2")
        //then
        assertEquals(3, result)
    }

    @Test
    fun `should ignore spaces`() {
        val result = calc.add("1 , 2  ")
        result `should be equal to` 3
    }

    @Test
    fun `should not accept non numeric characters`() {
        assertThrows<IllegalCharacterException>{
            calc.add("1 ,(")
        }
    }

    @Test
    fun `should return zero when no numbers provided in subtraction`() {
        val calc = StringCalculator()
        val result = calc.subtract("")
        assertEquals(0, result)
    }
}