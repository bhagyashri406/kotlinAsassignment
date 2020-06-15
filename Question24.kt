package com.example.asassignmentkotlin

/**
 *12-jun-2020
 * @Bhagya Shri
 */

fun main(args: Array<String>) {
    val numbers: List<Int?> = listOf(1, 3, 2, null, 4)
    val nonNullNumbers = numbers.filterNotNull()
    println(nonNullNumbers) // [1,3, 2, 4]

}