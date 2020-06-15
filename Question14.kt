package com.example.asassignmentkotlin

/**
 *12-jun-2020
 * @Bhagya Shri
 */

fun main(args: Array<String>) {

    val numbers: List<Int> = listOf(0, 1, 2, 8, 3, 9, 5, 6, 7)
    val evenNumbers = numbers.filter { it % 2 == 0 }

    println(evenNumbers)
}