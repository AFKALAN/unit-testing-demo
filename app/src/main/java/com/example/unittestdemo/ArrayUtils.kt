package com.example.unittestdemo

class ArrayUtils {
    fun checkMissingNumber(ar1: Array<Int>, ar2: Array<Int>): Int?{
        val map2 = ar2.associateBy{
            it
        }

        for (i in ar1){
            if(!map2.containsKey(i)){
                return i
            }
        }
        return null
    }
}