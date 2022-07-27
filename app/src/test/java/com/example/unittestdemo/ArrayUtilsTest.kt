package com.example.unittestdemo

import org.junit.Assert.*
import org.junit.Test

class ArrayUtilsTest{
    private var arrayUtil = ArrayUtils()

    @Test
    fun `test for missing number`(){
        val answer = arrayUtil.checkMissingNumber(arrayOf(1, 2, 3), arrayOf(1, 2))
        assertEquals(3, answer)
    }

    @Test
    fun `test for same elements`(){
        val answer = arrayUtil.checkMissingNumber(arrayOf(1, 2, 3), arrayOf(1, 2, 3))
        assertNull(answer)
    }
}
