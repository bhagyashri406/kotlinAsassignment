package com.example.asassignmentkotlin

import java.util.*

/**
 *12-jun-2020
 * @Bhagya Shri
 */

fun main(args: Array<String>) {

    val numbersArray = arrayOf(1, 2, null, 4, 5, 6, null, 8, 9, 10)
    val nulloddArray = numbersArray.filter { it != null && it % 2 != 0 || it == null }
    print(nulloddArray)

}