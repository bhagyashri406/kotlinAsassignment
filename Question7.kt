package com.example.asassignmentkotlin

/**
 *12-jun-2020
 * @Bhagya Shri
 */

fun main(args: Array<String>) {
    val numArray = doubleArrayOf(75.0, -34.0, 50.0, 33.5, 45.5, 73.7, 5.0)
    var largest = numArray[0]

    for (num in numArray) {
        if (largest < num)
            largest = num
    }
    println("Largest element = %.2f".format(largest))
}
