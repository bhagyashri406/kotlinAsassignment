package com.example.asassignmentkotlin

/**
 *12-jun-2020
 * @Bhagya Shri
 */

fun main(args: Array<String>) {
    val numArray = doubleArrayOf(25.3, 37.5, -65.0, 10.34, 11.0, 25.0)
    var sum = 0.0

    for (num in numArray) {
        sum += num
    }

    val average = sum / numArray.size
    println("The average is: %.2f".format(average))
}
